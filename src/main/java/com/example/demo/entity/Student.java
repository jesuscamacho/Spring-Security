package com.example.demo.entity;

public class Student {

    private final Integer studentId;
    private final String studentName;


    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.studentName = name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
