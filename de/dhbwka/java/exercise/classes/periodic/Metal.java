package de.dhbwka.java.exercise.classes.periodic;

//Klasse Metal, erbt von Element
public class Metal extends Element {

    //Deklaration private Variablen
    private boolean metalloid;
    private double conductivity;

    //Konstruktor, welcher Metal Eigenschaften zuweist
    public Metal(String name, String symbol, int ordinal, char shell,
                 int phase, boolean mainGroup,
                 boolean metalloid, double conductivity) {

        super(name, symbol, ordinal, shell, phase, mainGroup);
        this.metalloid = metalloid;
        this.conductivity = conductivity;
    }

    //public Funktion, welche metalloid returned (aka getter)
    public boolean isMetalloid() {
        return metalloid;
    }

    //public Setter, welcher metalloid zuweist
    public void setMetalloid(boolean metalloid) {
        this.metalloid = metalloid;
    }

    //public Getter für conductivity
    public double getConductivity() {
        return conductivity;
    }

    //public Setter, welcher conductivity zuweist
    public void setConductivity(double conductivity) {
        this.conductivity = conductivity;
    }

    //public ToString Funktion für Ausgabe
    @Override
    public String toString() {

        String base = super.toString();

        if (metalloid) {
            return base + ", Halbleiter, σ: " + conductivity;
        }

        return base + ", σ: " + conductivity;
    }
}
