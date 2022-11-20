package com.test.rampup;

import java.util.*;

public class RestQuerySimulator {

    private Map<Student, Results> studentWiseResults;

    public RestQuerySimulator() {
        this.studentWiseResults = populateMap();
    }

    public Student getStudent() {
        System.out.println("getting student first");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Student("z", 1,100);
    }

    private Map<Student,Results> populateMap() {
        Student student = new Student("z", 1, 100);
        Results studentResult = new Results(1000,"eng",
                "hin",80,3);

        Map<Student,Results> constr =  new HashMap<>();
        constr.put(student,studentResult);
        return constr;
    }

    public List<Student> allStudents() {
        return new ArrayList<>(
                Arrays.asList(new Student("z", 1, 20),
                        new Student("a", 2, 200)));
    }

    public Results getResult() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentWiseResults.get(new Student("z", 1, 100));
    }

    public Results getResultForStudent(Student student) {
        System.out.println("getting result based on student");
        return studentWiseResults.get(student);
    }
}
