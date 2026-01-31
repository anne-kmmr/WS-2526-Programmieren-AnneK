package de.dhbwka.java.exercise.datatypes;

//Kaufmännisches Runden 1

public class Round1 {
    public static void main(String[] args) {
        double pi = 3.1415926;
        double e = 2.7182818;
        long piLong = Math.round(pi);
        long eLong = Math.round(e);
        System.out.println("Pi ganzzahlig: " + piLong);
        System.out.println("e ganzzahlig: " + eLong);
    }
}
