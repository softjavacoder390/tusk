package com.test.rampup;
import java.util.concurrent.*;

public class StudentFetchService {
    private final RestQuerySimulator restQuerySimulator = new RestQuerySimulator();

    /*
    fixed thread pool works on the basis of unbounded queue
    each time a new task is added to the thread(s), if number of tasks > num of threads
    tasks are added to the queue
     */
    private final ExecutorService studentFetcherExec = Executors.newFixedThreadPool(1);
    private final ExecutorService resultFetcherExec = Executors.newFixedThreadPool(1);



    public void combineStudentsAndResultsWithFuture() {
        /*
        Imagine student fetch and result fetch are being done via two different REST APIs servers
        we need not wait for Studentfetch to complete to fetch the result
        we could try to do this concurrently
        both services take 5 seconds to complete the requests
        if we wait individually without completable future, they will take total 10 seconds
        as these are two different tasks, we could have more thread in the fixed pool
        or we could define separate thread for Results fetch
         */
        CompletableFuture<Student> studentCompletableFuture =
                CompletableFuture.supplyAsync(restQuerySimulator::getStudent, studentFetcherExec);
        CompletableFuture<Results> resultCompletableFuture =
                CompletableFuture.supplyAsync(restQuerySimulator::getResult, resultFetcherExec);
        try {
            Student student = studentCompletableFuture.get();
            Results results = resultCompletableFuture.get();
            System.out.println(student.getName() + " strong subject : " + results.getStrongSubject());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void combineStudentsAndResultsSync() {
        Student student = restQuerySimulator.getStudent();
        Results results = restQuerySimulator.getResult();
        System.out.println(student.getName() + " strong subject : " + results.getStrongSubject());
    }

    public Results fetchStudent() {

        /*In this method, imagine there are two rest calls
         - getStudent(get one student)
         - getResultBasedOnTheStudent
         so, the call is sequential, unless we get the student we wont get the result
         so, one thread doing two tasks is acceptable as operations are sequential.
         so, we are using the same executorservice with 1 thread
        */
        CompletableFuture<Results> studentCompletableFuture
                = CompletableFuture.supplyAsync(restQuerySimulator::getStudent,studentFetcherExec).
                thenApplyAsync(restQuerySimulator::getResultForStudent,studentFetcherExec);
        try {
            return studentCompletableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        StudentFetchService studentFetchService = new StudentFetchService();

        long current = System.currentTimeMillis();
        studentFetchService.combineStudentsAndResultsWithFuture();
        System.out.println("time taken async with future: " + (System.currentTimeMillis() - current));
        current = System.currentTimeMillis();
        studentFetchService.combineStudentsAndResultsSync();
        System.out.println("time taken sequentially : " + (System.currentTimeMillis() - current));

        //System.out.println(studentFetchService.fetchStudent());
    }
}
