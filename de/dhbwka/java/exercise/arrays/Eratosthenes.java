package de.dhbwka.java.exercise.arrays;
import java.util.Scanner;

//Aufgabe unklar, daher nicht final fertig

public class Eratosthenes {

    private static void sieve(){
        //Deklaration globaler Variablen & Arrays
        Scanner inputScanner = new Scanner(System.in);

        //Out- und Input
        System.out.print("Welche Zahl möchtest du durch das Sieb des Eratosthenes laufen lassen? ");
        float n = inputScanner.nextFloat();
        int arrayInput = (int) n;

        //Größe des Arrays bestimmen
        float[] sieve = new float[arrayInput];
        float[] primes = new float[arrayInput]; //sollte leer sein, Größe kann max. wie sieves sein, daher vorerst so groß wie sieves

        //kleinste Zahl in sieves finden
        int min = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i] < min) {
                min = i;
                break;
            }
        }

        //Hinzufügen vom Minimum in primes auf index 0
        primes[0] = min;

        //i aus sieves löschen
        //habe hier keine andere Möglichkeit gefunden, daher alle Werte auf 0 setzen
        for (int i = min; i < sieve.length; i += min) {
            sieve[i] = 0;
        }

        //Finalen Output
        System.out.println("Hier alle Primzahlen zwischen 2 und n: ");
        for (int i = 2; i < sieve.length; i++) {
            System.out.print(sieve[i] + ", ");
        }
    }

    //final Output?! Aufgabe nicht klar

    public static void main(String[] args) {
        sieve();
    }
}
