package de.dhbwka.java.exercise.classes;

import java.util.Random;

public class RandomNumbers {
    private static final int MAX = 20;
    private static int[] randomNumbers;

    static {
        RandomNumbers.randomNumbers = new int[RandomNumbers.MAX];
        // Lokale Variable rand ist nicht static!
        Random rand = new Random();
        for (int i = 0; i < RandomNumbers.MAX; i++) {
            RandomNumbers.randomNumbers[i] = rand.nextInt(50);
        }
    }
}
