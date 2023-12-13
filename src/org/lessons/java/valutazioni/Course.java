package org.lessons.java.valutazioni;

import java.util.ArrayList;

public class Course{
    // Classe Corso che contiene una lista di studenti

    // ----------- ATTRIBUTI ------------
    private ArrayList<Student> students = new ArrayList<>();



    // ----------- METODI ------------

    // aggiungere uno studente alla lista
    public void addStudent(ArrayList<Student> students, Student newStudent) {
        students.add(newStudent);
    }

    // remuovere uno studente dalla lista
    public void removeStudent(ArrayList<Student> students,int id) {
        students.remove(id-1);
    }

    // mostrare a video l’elenco di tutti gli studenti con i relativi dati
    public void printStudents(ArrayList<Student> students) {
        for(Student student : students){
            System.out.println(student.toString());
        }
    }

    // dare la percentuale di studenti promossi
    public double promotedStudents(ArrayList<Student> students) {
       int promotedStudents = 0;
        for(Student student : students) {
            if (student.isPromoted()) {
                promotedStudents ++;
            }
        }
        return (students.size() * ((double) promotedStudents / 100));

    }
}
