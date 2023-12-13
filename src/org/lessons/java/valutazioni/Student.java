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
    /* La valutazione complessiva viene fatta sulla percentuale di assenze (da 0 a 100) e la media dei voti (da 0 a 5):
    - se lo studente ha fatto più del 50% di assenze è bocciato
    - se ha fatto tra il 25% e il 50% di assenze è promosso solo se la media dei voti è superiore a 2
    - se ha fatto meno del 25% di assenze è promosso se la media dei voti è superiore o uguale a 2 */
    public String isPromoted (int absence, double grades) {
        if(absence > 50) {
            return "The student is rejected :(";
        } else if((absence < 50 && absence > 25) && grades < 2) {
            return "The student is rejected :(";
        } else if(absence < 25 && grades < 2) {
            return "The student is rejected :(";
        }
        return "The student is promoted :)";
    }

}
