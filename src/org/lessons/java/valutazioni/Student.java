package org.lessons.java.valutazioni;

public class Student {
    /* id dello studente (intero), percentuale assenze (intero), media voti (numero decimale)*/

    // ----------- ATTRIBUTI --------------
    private int id;
    private int absence;
    private double grades;

    // ----------- COSTRUTTORI ----------------

    public Student(int id, int absence, double grades) {
        this.id = id;
        this.absence = absence;
        this.grades = grades;
    }

    // ----------- GETTER E SETTER ----------------


    public int getId() {
        return id;
    }

    public int getAbsence() {
        return absence;
    }

    public double getGrades() {
        return grades;
    }
}
