package de.dhbwka.java.exercise.classes.periodic;

//Klasse PeriodicTable
public class PeriodicTable {

    //private Elemente und Variablen
    private Element[] elements = new Element[118];
    private int count = 0;

    //public Funktion addElement, welche Elemente hinzufügt
    public void addElement(Element e) {
        if (!hasElement(e.getOrdinal()) && count < elements.length) {
            elements[count++] = e;
        }
    }

    //public Funktion, welche auf Element prüft
    public boolean hasElement(int o) {
        for (int i = 0; i < count; i++) {
            if (elements[i].getOrdinal() == o) {
                return true;
            }
        }
        return false;
    }

    //public Getter für Element
    public Element getElement(int o) {
        for (int i = 0; i < count; i++) {
            if (elements[i].getOrdinal() == o) {
                return elements[i];
            }
        }
        return null;
    }

    //public Getter für getMetals aus Array
    public Element[] getMetals() {
        Element[] metals = new Element[count];
        int m = 0;

        for (int i = 0; i < count; i++) {

            if (elements[i] instanceof Metal) {
                metals[m++] = elements[i];
            }
        }

        Element[] result = new Element[m];
        for (int i = 0; i < m; i++) {
            result[i] = metals[i];
        }
        return result;
    }
}
