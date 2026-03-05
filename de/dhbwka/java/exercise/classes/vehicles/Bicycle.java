package de.dhbwka.java.exercise.classes.vehicles;

//Klasse Bicycle, welche von Vehicle erbt
public class Bicycle extends Vehicle {

    //Konstruktor, welcher Bicycle mittels Eigenschaften erzeugt und ihm dessen zuweist
    public Bicycle(double speed) {
        super(2, 30);
        setSpeed(speed);
    }
}
