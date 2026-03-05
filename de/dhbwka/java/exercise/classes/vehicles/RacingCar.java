package de.dhbwka.java.exercise.classes.vehicles;

//Klasse RasingCar, welches von Car erbt
public class RacingCar extends Car {

    //Konstruktor RacingCar, welcher erstellt und Werte zuweist
    public RacingCar(double speed) {
        super(speed);
        this.vmax = 220;
        setSpeed(speed);
    }
}