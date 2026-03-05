package de.dhbwka.java.exercise.classes.vehicles;

//Klasse Car, welches von Vehicle erbt
public class Car extends Vehicle {

    //Konstruktor für Car und Definition von Car mittels Eigenschaften
    public Car(double speed) {
        super(4, 140);
        setSpeed(speed);
    }
}