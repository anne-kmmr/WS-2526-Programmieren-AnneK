package de.dhbwka.java.exercise.arrays;

public class PDSum {
    public static void main(String[] args) {
        int[] pd = { 1, 2, 4, 8, 16, 32, 64, 128 };
        int sum = 0;
        for (int i = 0; i < pd.length; i++) {
            sum = sum + pd[i];
        }
        System.out.println("Sum: " + sum);
    }
}
