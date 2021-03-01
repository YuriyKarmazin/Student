package com.students;

import static com.students.Student.countStudent;

public class Main {
    public static void main(String[] args) {
        Student Peter = new Student("McCauley", 1234);
        Student Jack = new Student("McAllan");
        Student Mark = new Student(1234);
        Student Karl = new Student();

        Peter.printStudents();
        Jack.printStudents();
        Mark.printStudents();
        Karl.printStudents();

        System.out.println("Number of students is: " + countStudent);
    }
}
