package de.dhbwka.java.exercise.control;

public class ShoeSize {
    static void output(){
        //Ausgabe von Tabellen-Head nur einmal
        System.out.println("Zentimeter      |  Größe");
        System.out.println("----------------+--------");

        //Festlegung globaler Variablen und Standardwerte
        int size = 30;
        double firstZentimeter = 19.33;
        double secondZentimeter;

        //20 Durchläufe der Schleife mit "wachsenden" Parametern und Berechnung/rundung der Zentimeter
        for(int s = 30; s <= 49; s++) {

            //Runden funktioniert noch nicht ganz
            secondZentimeter = Math.round(((size / 1.5)  * 100.0) / 100.0);
            firstZentimeter = Math.round(((secondZentimeter - 2.0/3.0) * 100.0) / 100.0);
            System.out.println(firstZentimeter + " - " + secondZentimeter + "    |  " + size++);
        }
    }

    public static void main(){
        output();
    }
}