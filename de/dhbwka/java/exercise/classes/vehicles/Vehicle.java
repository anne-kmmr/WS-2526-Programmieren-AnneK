package de.dhbwka.java.exercise.classes.vehicles;

//Klasse Vehicle, welche zuweist und ausgibt
public class Vehicle {

    //protectet Variablen für Details zu den Autos
    protected int wheels;
    protected double vmax;
    protected double position;
    protected double speed;

    //public Konstruktor für Vehicle, welcher öffentlich einmal für alle Werte 0 zuweist (ohne Eingabewerte)
    public Vehicle() {
        wheels = 0;
        vmax = 0;
        position = 0;
        speed = 0;
    }

    //weiterer, public Konstruktor für Vehicle, welcher die Werte genauer zuweist
    public Vehicle(int wheels, double vmax) {
        this.wheels = wheels;
        this.vmax = vmax;
        this.position = 0;
        this.speed = 0;
    }

    //public Funktion setSpeed, welche den Speed "misst" und dementsprechend den Speed oder die maximale Geschwindigkeit zuweist
    public void setSpeed(double speed) {
        if (speed > vmax) {
            this.speed = vmax;
        } else {
            this.speed = speed;
        }
    }

    //public Funktion drive, welche Zeitumrechung macht und danach die position pro Stunde berechnet
    public void drive(double minutes) {
        double hours = minutes / 60.0;
        position += speed * hours;
    }

    //Ausgabe der Ergebnisse
    public String toString() {
        return this.getClass().getSimpleName()
                + " at position " + position + " km with "
                + wheels + " wheels at speed "
                + speed + " km/h of max. "
                + vmax + " km/h.";
    }
}
