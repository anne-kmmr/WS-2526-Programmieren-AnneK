package de.dhbwka.java.exercise.arrays;

import java.util.Arrays;

public class ArrayGreat {
    public static void main(String[] args) {

        double[] nums = new double[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 100;
            System.out.println(nums[i]); //Zusatzaufgabe 1
        }

        int max = 0;
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[max] < nums[i]) {
                index = i;
                max = i;
            }
        }
        System.out.println("Maximum: " + nums[max] + " und der Index ist: " + index); //Zusatzaufgabe 2
    }
}

//Zusatzaufgabe 1: alle Ausgaben unter Maximum ausgeben -> erledigt
//Zusatzaufgabe 2: index von Maximum ausgeben
