package org.lessons.java.valutazioni;


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int numberStudent = randomNumbers.nextInt(10,20);
        Course course = new Course();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numberStudent; i++ ) {
            int randomAbsence = randomNumbers.nextInt(0,100);
            double randomGrades = randomNumbers.nextDouble(0,5);

            Student student = new Student((i+1),randomAbsence,randomGrades);
            students.add(student);
        }

        course.printStudents(students);

        System.out.println("Studenti promossi : " + course.promotedStudents(students) + "%");








    }
}
