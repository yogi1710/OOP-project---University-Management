package com.codegnan.university.management;

import java.util.ArrayList;

public class UniversityManagement {
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;

    public UniversityManagement() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public static void main(String[] args) {
        UniversityManagement um = new UniversityManagement();

        // Sample data
        Student student1 = new Student("John Doe", "S001");
        Course course1 = new Course("Computer Science", "CS101", 3);
        student1.enrollCourse(course1);
        um.addStudent(student1);

        Professor professor1 = new Professor("Dr. Smith", "Computer Science");
        um.addProfessor(professor1);

        // Displaying student details
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        for (Course course : student1.getCourses()) {
            System.out.println("Enrolled Course: " + course.getCourseName());
        }
    }
}
