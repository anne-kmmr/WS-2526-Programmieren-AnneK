package de.dhbwka.java.exercise.classes.periodic;

//Klasse Element
public class Element {

    //Deklaration von private Variablen
    private String name;
    private String symbol;
    private int ordinal;
    private char shell;
    private int phase;
    private boolean mainGroup;

    //Deklaration von public Variablen
    public static final int SOLID = 1;
    public static final int LIQUID = 2;
    public static final int GAS = 3;

    //Konstruktor, welcher Eigenschaften festlegt und Eigenschaften zuweist
    public Element(String name, String symbol, int ordinal, char shell, int phase, boolean mainGroup) {
        this.name = name;
        this.symbol = symbol;
        this.ordinal = ordinal;
        this.shell = shell;
        this.phase = phase;
        this.mainGroup = mainGroup;
    }

    //Deklaration der Getter

    //Getter für Name
    public String getName() {
        return name;
    }

    //Getter für Symbol
    public String getSymbol() {
        return symbol;
    }

    //Getter für Ordinal
    public int getOrdinal() {
        return ordinal;
    }

    //Getter für Shell
    public char getShell() {
        return shell;
    }

    //Getter für Phase
    public int getPhase() {
        return phase;
    }

    //Funktion/Abfrage, ob Element in MainGroup ist
    public boolean isMainGroup() {
        return mainGroup;
    }

    //Deklaration der Setter

    //Setter für Namen
    public void setName(String name) {
        this.name = name;
    }

    //Setter für Symbol
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    //Setter für Ordinal
    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    //Setter für Shell
    public void setShell(char shell) {
        this.shell = shell;
    }

    //Setter für Phase
    public void setPhase(int phase) {
        this.phase = phase;
    }

    //Setter für MainGroup
    public void setMainGroup(boolean mainGroup) {
        this.mainGroup = mainGroup;
    }

    //public phaseToString Funktion, welcher je nach phase einen return zurückgibt
    public String phaseToString() {
        switch (phase) {
            case SOLID: return "fest";
            case LIQUID: return "flüssig";
            case GAS: return "gasförmig";
            default: return "unbekannt";
        }
    }

    //public ToString Funktion, welches eine finale Ausgabe herausgibt
    @Override
    public String toString() {

        String group = mainGroup ? "Hauptgruppe" : "Nebengruppe";

        return name + " (" + symbol + "," + ordinal + ") "
                + "Schale: " + shell + ", "
                + phaseToString()
                + ", Gruppe: " + group;
    }

    //public Funktion für equals, weißt je nach bool zu
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Element))
            return false;

        Element e = (Element) o;

        return this.ordinal == e.ordinal;
    }
}
