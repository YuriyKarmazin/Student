package com.students;

public class Student {
    public static int countStudent;
    public String lastName;
    public int studentID;

    public Student (String lastName, int studentID){
        this.lastName = lastName;
        this.studentID = studentID;
        countStudent++;
        System.out.println("The first student is " + lastName + " and his ID is: " + studentID);
    }
    public Student (String lastName){
        this.lastName = lastName;
        countStudent++;
        System.out.println("The second student is " + lastName);
    }
    public Student (int studentID){
        this.studentID = studentID;
        countStudent++;
        System.out.println("The third student is ... and his ID is: " + studentID);
    }
    public Student (){
        countStudent++;
        System.out.println("The fourth student is ... ");
        System.out.println(" Number of students is: " + countStudent);
    }
}