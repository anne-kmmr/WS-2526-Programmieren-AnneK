package de.dhbwka.java.exercise.arrays;
import java.util.Scanner;

//noch nicht fertig

public class Norm
{
    private static void calculation(){
        //Scanner und Array
        Scanner inputScanner = new Scanner(System.in);
        float[] vectorArrary = {};

        //Out- und Input
        System.out.print("Bitte Anzahl der Elemente n eingeben: ");
        int numberOfX = inputScanner.nextInt();

        //Ausgabe und Schreiben in den Array
        for (int i = 0; i < numberOfX; i++){
            System.out.print("Bitte x_" + i + " eingeben: ");
            float inputForX = inputScanner.nextFloat();

            //das funktioniert nicht
            //vectorArrary[i] = inputForX;
            System.out.println(vectorArrary[i]);
        }

        //berechnung fehlt noch
    }

    public static void main(String[] args) {
        calculation();
    }
}
