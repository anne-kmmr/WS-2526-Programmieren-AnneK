package de.dhbwka.java.exercise.arrays;

public class MyArray {
    public static void main(String[] args) {
        double[] nums = new double[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 100;
        }
        for (double d : nums) {
            System.out.println(d);
        }
    }
}