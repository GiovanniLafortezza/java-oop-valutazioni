package org.lessons.java.valutazioni;


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int numberStudent = randomNumbers.nextInt(10,21);
        Course course = new Course();
        ArrayList<Student> theStudents = new ArrayList<>();
        for (int i = 0; i < numberStudent; i++ ) {
            int randomAbsence = randomNumbers.nextInt(0,101);
            double randomGrades = randomNumbers.nextDouble(0.0,5.0);
            Student student = new Student((i+1),randomAbsence,randomGrades);
            theStudents.add(student);
        }

        try {
            Student addStudent = new Student(5,12,88);
            course.addStudent(theStudents,addStudent);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        course.printStudents(theStudents);

        System.out.println("Studenti promossi : " + course.promotedStudents(theStudents) + "%");








    }
}
