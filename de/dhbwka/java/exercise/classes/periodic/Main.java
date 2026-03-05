package de.dhbwka.java.exercise.classes.periodic;

//Klasse Main
public class Main {

    //Main :)
    public static void main(String[] args) {

        //Erzeugt ein neues Periodensystem
        PeriodicTable table = new PeriodicTable();

        //Fügt neues Element sowie Eigenschaften hinzu
        table.addElement(new Element("Wasserstoff","H",1,'K',Element.GAS,true));
        table.addElement(new Element("Helium","He",2,'K',Element.GAS,true));
        table.addElement(new Element("Brom","Br",35,'N',Element.LIQUID,true));

        //Fügt neues Metal sowie Eigenschaften hinzu
        table.addElement(new Metal("Natrium","Na",11,'M',Element.SOLID,true,false,2.1E7));
        table.addElement(new Metal("Eisen","Fe",26,'N',Element.SOLID,false,false,1.002E7));
        table.addElement(new Metal("Germanium","Ge",32,'N',Element.SOLID,false,true,1.45));
        table.addElement(new Metal("Tellur","Te",52,'O',Element.SOLID,true,true,0.005));
        table.addElement(new Metal("Gold","Au",79,'P',Element.SOLID,false,false,4.4E7));

        //Ausgabe für "Alle Elemente:"
        System.out.println("Alle Elemente:");

        //for-loop für Ausgabe der oben deklarierten Elemente
        for(int i=1;i<=118;i++){
            //Aufruf getter für Elemente
            Element e = table.getElement(i);
            if(e != null){
                System.out.println(e);
            }
        }

        //Ausgabe für "Metalle:"
        System.out.println("\nMetalle:");

        //Aufruf getter für Metalle, wird in Array metals geschoben
        Element[] metals = table.getMetals();

        //for-loop für Ausgabe aller Metalle in Array metals
        for(Element m : metals){
            System.out.println(m);
        }

        //Ausgabe für "Gold:"
        System.out.println("\nGold:");

        //Ausgabe von Element mit ordinal 79 (= Gold)
        System.out.println(table.getElement(79));
    }
}