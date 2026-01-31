package de.dhbwka.java.exercise.datatypes;

//Kaufmännisches Runden 2
//warum funktioniert das? Datentyptechnisch wegen long und ansonsten weil er mit der Klasse rundet

public class Round2 {
    public static void main(String[] args) {
        double pi = -3.1415926;
        double e = -2.7182818;
        long piLong = Math.round(pi);
        long eLong = Math.round(e);
        System.out.println("Pi ganzzahlig: " + piLong);
        System.out.println("e ganzzahlig: " + eLong);
    }
}
