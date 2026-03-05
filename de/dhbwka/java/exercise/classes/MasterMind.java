package de.dhbwka.java.exercise.classes;
//von KI

import java.util.Random;
import java.util.Scanner;

public class MasterMind {

    private String geheimCode;
    private int maxVersuche = 20;
    private int aktuelleVersuche = 0;

    public static void main(String[] args) {
        MasterMind spiel = new MasterMind();
        spiel.starteSpiel();
    }

    private void starteSpiel() {
        Scanner scanner = new Scanner(System.in);
        geheimCode = generiereGeheimCode();

        System.out.println("===== MASTER MIND =====");
        System.out.println("Errate den 5-stelligen Code (Buchstaben A–H).");
        System.out.println("Ein Buchstabe kann mehrfach vorkommen.");
        System.out.println("Du hast " + maxVersuche + " Versuche.\n");

        while (aktuelleVersuche < maxVersuche) {

            System.out.print("Tipp eingeben: ");
            String tipp = scanner.nextLine().toUpperCase();

            if (!istGueltigerTipp(tipp)) {
                System.out.println("Ungültige Eingabe! Genau 5 Buchstaben von A–H eingeben.\n");
                continue;
            }

            aktuelleVersuche++;

            int[] bewertung = pruefeTipp(tipp);

            System.out.println("Richtige Position: " + bewertung[0]
                    + " | Richtiger Buchstabe falsche Position: "
                    + bewertung[1]);

            if (bewertung[0] == 5) {
                System.out.println("\n🎉 Gewonnen! Du hast den Code erraten!");
                return;
            }

            System.out.println("Verbleibende Versuche: "
                    + (maxVersuche - aktuelleVersuche) + "\n");
        }

        System.out.println("Leider verloren!");
        System.out.println("Der Code war: " + geheimCode);
    }

    private String generiereGeheimCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char buchstabe = (char) ('A' + random.nextInt(8)); // A–H
            code.append(buchstabe);
        }

        return code.toString();
    }

    private int[] pruefeTipp(String tipp) {

        int richtigePosition = 0;
        int richtigeFalschePosition = 0;

        boolean[] geheimVerwendet = new boolean[5];
        boolean[] tippVerwendet = new boolean[5];

        // 1. Richtige Position prüfen
        for (int i = 0; i < 5; i++) {
            if (tipp.charAt(i) == geheimCode.charAt(i)) {
                richtigePosition++;
                geheimVerwendet[i] = true;
                tippVerwendet[i] = true;
            }
        }

        // 2. Richtiger Buchstabe falsche Position
        for (int i = 0; i < 5; i++) {

            if (tippVerwendet[i])
                continue;

            for (int j = 0; j < 5; j++) {
                if (!geheimVerwendet[j]
                        && tipp.charAt(i) == geheimCode.charAt(j)) {

                    richtigeFalschePosition++;
                    geheimVerwendet[j] = true;
                    break;
                }
            }
        }

        return new int[]{richtigePosition, richtigeFalschePosition};
    }

    private boolean istGueltigerTipp(String tipp) {

        if (tipp.length() != 5)
            return false;

        for (int i = 0; i < 5; i++) {
            char c = tipp.charAt(i);
            if (c < 'A' || c > 'H')
                return false;
        }

        return true;
    }
}