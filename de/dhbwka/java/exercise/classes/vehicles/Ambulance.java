package de.dhbwka.java.exercise.classes.vehicles;

//Klasse, welche von Car erbt
public class Ambulance extends Car {

    //globale, private Variable
    private boolean signal;

    //Konstruktor, welcher Ambulance erzeugt und ihm Eigenschaften zuweist
    public Ambulance(double speed, boolean signal) {
        super(speed);
        this.signal = signal;
    }

    //public Funktion, welche das Signal an macht
    public void turnSignalOn() {
        signal = true;
    }

    //public Funktion, welche das Signal aus macht
    public void turnSignalOff() {
        signal = false;
    }

    //Ausgabe der Signal-Statuses mit toString Funktion (nur für Ambulance!)
    @Override
    public String toString() {
        String state = signal ? "Signal on." : "Signal off.";
        return super.toString() + " " + state;
    }
}
