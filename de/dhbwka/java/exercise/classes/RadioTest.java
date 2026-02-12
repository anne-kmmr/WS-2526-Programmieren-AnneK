package de.dhbwka.java.exercise.classes;

public class RadioTest {

    public static void main(String[] args) {

        // Test Standardkonstruktor
        Radio r1 = new Radio();
        System.out.println(r1);

        r1.turnOn();
        r1.incVolume();
        r1.setFrequency(98.4);
        System.out.println(r1);

        // Test Konstruktor mit Parametern
        Radio r2 = new Radio(true, 2, 120.0); // ungültige Frequenz
        System.out.println(r2);

        r2.decVolume();
        r2.turnOff();
        r2.incVolume(); // sollte nichts ändern, da aus
        System.out.println(r2);
    }


    private static class Radio {

        // Attribute
        private boolean on;
        private int volume;          // 0 - 10
        private double frequency;    // 85.0 - 110.0

        // a+b) Standardkonstruktor mit sinnvollen Startwerten
        public Radio() {
            this.on = false;
            this.volume = 5;
            this.frequency = 99.9;
        }

        // b) Konstruktor mit Parametern
        public Radio(boolean on, int volume, double frequency) {
            this.on = on;

            // Lautstärke prüfen
            if (volume >= 0 && volume <= 10) {
                this.volume = volume;
            } else {
                this.volume = 5; // Standardwert
            }

            // Frequenz über Methode setzen (inkl. Prüfung)
            setFrequency(frequency);
        }

        // c) Methoden

        // Lautstärke erhöhen (nur wenn Radio an ist)
        public void incVolume() {
            if (on && volume < 10) {
                volume++;
            }
        }

        // Lautstärke verringern (nur wenn Radio an ist)
        public void decVolume() {
            if (on && volume > 0) {
                volume--;
            }
        }

        // Radio einschalten
        public void turnOn() {
            on = true;
        }

        // Radio ausschalten
        public void turnOff() {
            on = false;
        }

        // Frequenz setzen (mit Bereichsprüfung)
        public void setFrequency(double frequency) {
            if (frequency >= 85.0 && frequency <= 110.0) {
                this.frequency = frequency;
            } else {
                this.frequency = 99.9;
            }
        }

        // Status als String zurückgeben
        @Override
        public String toString() {
            String status = on ? "an" : "aus";
            return "Radio " + status + ": Freq=" + frequency + ", Laut=" + volume;
        }
    }
}
