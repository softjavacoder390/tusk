package com.test.rampup;
import java.util.Objects;

public class Student {
    private final String name;
    private final Integer rollNum;
    private final Integer marks;

    public Student(String name, Integer rollNum, Integer marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Integer getRollNum() {
        return rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && rollNum.equals(student.rollNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNum);
    }
}
