package com.students;

public class Student {
    public static int countStudent;
    public String lastName;
    public int studentID;

    public Student(String lastName, int studentID) {
        this.lastName = lastName;
        this.studentID = studentID;
        countStudent++;
    }

    public Student(String lastName) {
        this.lastName = lastName;
        countStudent++;
    }

    public Student(int studentID) {
        this.studentID = studentID;
        countStudent++;
    }

    public Student() {
        countStudent++;
    }

    void printStudents (){
        System.out.println("last Name: " + lastName);
        System.out.println("ID: " + studentID);
        System.out.println(" ");
    }
}