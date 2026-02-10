//package de.dhbwka.java.exercise.arrays;
//import java.util.Scanner;
//
////nicht fertig!
//
//public class Eratostenes {
//
//    private static void sieve(){
//        //Deklaration globaler Variablen & Arrays
//        Scanner inputScanner = new Scanner(System.in);
//        float primes[] = {}; //leer, siehe Anweisung
//
//        //Out- und Input
//        System.out.print("Welche Zahl möchtest du durch das Sieb des Eratostenes laufen lassen? ");
//        float n = inputScanner.nextFloat();
//
//        //Berechnung aller natürlichen zahlen von 2 bis n
//        float howManyNumbers = n - 1;
//
//        //Größe des Arrays bestimmen
//        float[] sieve = new float[howManyNumbers];
//
//        //kleinste Zahl in sieves finden
//        int min = 0;
//        for (int i = 2; i < sieve.length; i++) {
//            if (sieve[i]) {
//                min = i;
//                break;
//            }
//        }
//
//        //Hinzufügen vom Minimum in primes
//        primes.add(min);
//
//        //i aus sieves löschen
//        for (int i = min; i < sieve.length; i += min) {
//            sieve[i] = false;
//        }
//
//        //Finalen Output
//        System.out.println("Hier alle Primzahlen zwischen 2 und n: ");
//        for (int i = 2; i < sieve.length; i++) {
//            System.out.print(sieve[i] + ", ");
//        }
//    }
//
//    public static void main(String[] args) {
//        sieve();
//    }
//}
