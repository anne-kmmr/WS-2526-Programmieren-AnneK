package de.dhbwka.java.exercise.classes;

public class Point {

    //globale, private Variablen erstellen
    private double xCoordinate;
    private double yCoordinate;

    //Standard-Constructor mit Zuweisung der Koordinaten
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    //Getter für X-Koordinate
    public double getXCoordinate() {
        return xCoordinate;
    }

    //Setter für X-Koordinate
    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    //Getter für Y-Koordinate
    public double getYCoordinate() {
        return yCoordinate;
    }

    //Setter für Y-Koordinate
    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
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
    private Point mirrorOrigin(){

        //funktioniert das?
        if (xCoordinate == 0 || yCoordinate == 0){
            //Wenn einer der Punkte null ist, wird kein zusätzliches Minus ausgegeben
            return new Point(xCoordinate, yCoordinate);
        }
        else{
            //Punkte des Punktes A spiegeln und damit in den Minusbereich verschieben
            return new Point(-xCoordinate, -yCoordinate);
        }
    }

    // Abstand/Berechnung zu einem anderen Punkt
    private double getDistance(Point otherPoint) {
        double dx = this.xCoordinate - otherPoint.xCoordinate;
        double dy = this.yCoordinate - otherPoint.yCoordinate;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //Funktion als Rückgabewert, der im Endeffekt einen String mittels System.out.printl zurückgibt
    //(für Ausgaben von Punkte/gespiegelten Punkt)
    public String toString(){
        return "Punkt (" + xCoordinate + "," + yCoordinate + ")";
    }

    //Main als Test
    public static void main(String[] args) {
        Point pointA = new Point(4.0, 2.0);
        System.out.println("A: " + pointA);
        Point pointB = new Point(-1.0, -1.0);
        System.out.println("B: " + pointB);
        System.out.println("Abstand A-B: "  + pointA.getDistance(pointB));
        pointA = pointA.mirrorOrigin();
        System.out.println("A': " + pointA);
        System.out.println("Abstand A’-B: " + pointA.getDistance(pointB));
    }
}