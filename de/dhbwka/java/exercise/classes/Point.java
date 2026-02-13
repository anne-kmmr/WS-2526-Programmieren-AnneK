package de.dhbwka.java.exercise.classes;

public class Point {

    //globale Variablen erstellen
    private double xCoordinate;
    private double yCoordinate;

    //Standard-Constructor mit Zuweisung von Wert 0 sowie Erstellung eines neuen Datentyps
    public Point(double xCoordinate, double yCoordinate) {
        xCoordinate = 0;
        yCoordinate = 0;
        Point point = new Point(xCoordinate, yCoordinate);   
    }

    //funktioniert das? überarbeiten
    public Point getPoint1(Point point, double xCoordinate, double yCoordinate) {
        Point point1 = new Point(xCoordinate, yCoordinate);
        return point1;
    }

    public Point getPoint2(Point point, double xCoordinate, double yCoordinate) {
        Point point2 = new Point(xCoordinate, yCoordinate);
        return point2;
    }

    //Berechnung Abstand des Punktes zum Ursprung
    //wird in der zugehörigen Beispiel-Ausgabe nicht gebraucht, daher hier keine Funktion und return 0
    private double PointToOrigin(){
        return 0; //Kein Ergebnis → kein neuer Punkt
    }

    //Spiegelung des Punktes an der x-Achse
    //wird in der zugehörigen Beispiel-Ausgabe nicht gebraucht, daher hier keine Funktion und return 0
    private double ReflectionOnXAxis(){
        return  0; //Kein Ergebnis → kein neuer Punkt
    }

    //Spiegelung des Punktes an der y-Achse
    //wird in der zugehörigen Beispiel-Ausgabe nicht gebraucht, daher hier keine Funktion und return 0
    private double ReflectionOnYAxis(){
        return 0; //Kein Ergebnis → kein neuer Punkt
    }

    //Spiegelung des Punktes am Ursprung
    private double mirrorOrigin(){
        getPoint1(xCoordinate, yCoordinate);
        
        if (xCoordinate == 0 || yCoordinate == 0){
            return xCoordinate + yCoordinate;
        }
        else{
            //Punkte des Punktes A spiegeln und damit in den Minusbereich verschieben
            xCoordinate = xCoordinate * (-1);
            yCoordinate = yCoordinate * (-1);
            setPoint1(xCoordinate,yCoordinate);
        }
    }

    //Abstand zweier Punkte → Name verändert, da getter und Funktion ähnlich wären
    private double Distance(Point point){
        //Abstand berechnen mit A/gespiegelt A - B
        //evtl. Zwischenspeichern von PunktA, bevor PunktB drankommt, danach Differenz berechnen
        return 0;

    }

    //Funktion als Rückgabewert, der im Endeffekt einen String mittels System.out.printl zurückgibt
    public String toString(){
        //wird hier nicht benötigt, außer man möchte die doubles als string ausgeben?
    }

    //umbauen! Setter am Ende von Funktionen aufrufen, um damit die Werte festzulegen, das geschieht
    //aktuell noch nicht verwendet
    public void setPoint1(double xCoordinate, double yCoordinate) {
        
    }

    public void setPoint2(double xCoordinate, double yCoordinate) {

    }

    public static void main(String[] args) {
        Point pointA = new Point(4.0, 2.0);
        System.out.println("A: " + pointA);
        Point pointB = new Point(-1.0, -1.0);
        System.out.println("B: " + pointB);
        System.out.println("Abstand A-B: "  + pointA.Distance(pointB));
        pointA = pointA.mirrorOrigin();
        System.out.println("A': " + pointA);
        System.out.println("Abstand A’-B: " + pointA.Distance(pointB));
    }
}
