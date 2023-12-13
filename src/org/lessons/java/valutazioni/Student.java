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

    // ----------- METODI ----------------

    // metodo che calcola, in base a percentuale assenze e media voti, se lo studente è promosso o bocciato
    public boolean isPromoted () {
        if(absence > 50) {
            return false;
        } else if((absence < 50 && absence > 25) && grades < 2) {
            return false;
        } else if(absence < 25 && grades < 2) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student " + id + ", absence = " + absence + ", grades = " + grades;
    }
}
