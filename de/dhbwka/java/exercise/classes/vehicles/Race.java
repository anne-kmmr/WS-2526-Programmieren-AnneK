package de.dhbwka.java.exercise.classes.vehicles;

//Klasse Race, welche main beinhaltet und somit das Rennen startet
public class Race {

    //Main-Funktion für das Rennen
    public static void main(String[] args) {

        //Erzeugt 4 neue Autos
        Vehicle[] vehicles = new Vehicle[4];

        //Weist den eben erstellten Autos einen Namen und Werte zu
        vehicles[0] = new Bicycle(20.0);
        vehicles[1] = new Car(150.0);
        vehicles[2] = new RacingCar(200.0);
        vehicles[3] = new Ambulance(80.0, true);

        //Auto 0 (Fahrrad) fahren 240 Minuten
        vehicles[0].drive(240.0);

        //Alle anderen Autos fahren 60 Minuten
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].drive(60);
        }

        //Letztendlicher Output mittels toString-Funktion
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].toString());
        }
    }
}