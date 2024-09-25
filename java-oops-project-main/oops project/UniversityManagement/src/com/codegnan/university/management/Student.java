package com.codegnan.university.management;

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private ArrayList<Course> courses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
