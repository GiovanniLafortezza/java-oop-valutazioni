package org.lessons.java.valutazioni;

public class Student {
    /* id dello studente (intero), percentuale assenze (intero), media voti (numero decimale)*/

    // ----------- ATTRIBUTI --------------
    private int id;
    private int absence;
    private double grades;

    // ----------- COSTRUTTORI ----------------

    public Student(int id, int absence, double grades) throws IllegalArgumentException{
        validId(id);
        validAbsence(absence);
        validGrades(grades);
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

    public void setId(int id) throws IllegalArgumentException{
        validId(id);
        this.id = id;
    }

    public void setAbsence(int absence) throws IllegalArgumentException{
        validAbsence(absence);
        this.absence = absence;
    }

    public void setGrades(double grades) throws IllegalArgumentException{
        validGrades(grades);
        this.grades = grades;
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
        return "Student " + id + ", absence = " + absence + ", grades = " + grades + " , is passed? : " + isPromoted();
    }

    // ----------- VALIDATORS ----------------
    private void validId(int id) throws IllegalArgumentException{
        if ( id < 0)
            throw new IllegalArgumentException("ERROR : id not valid");
    }

    private void validAbsence(int absence) throws IllegalArgumentException{
        if (absence < 0 || absence > 100)
            throw new IllegalArgumentException("ERROR : absence not valid");
    }

    private void validGrades(double grades) throws IllegalArgumentException{
        if (grades < 0 || grades > 5)
            throw new IllegalArgumentException("ERROR : grade not valid");
    }

}
