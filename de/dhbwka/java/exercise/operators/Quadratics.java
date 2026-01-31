package de.dhbwka.java.exercise.operators;
import java.util.Scanner;
//nur sehr simples programm ohne viel extra funktionen

public class Quadratics {

    static void Input() {
        //gibt es eine bessere methode oder ist scanner nur eine standardmäßige methode?
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the values for a, b and c to calculate x.");
        System.out.print("Please enter the value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter the value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Please enter the value for c: ");
        double c = scanner.nextDouble();
        System.out.println("You entered: " + a + " for a, " + b + " for b and " + c + " for c. Please wait ...");

        CalculationAndOutput(a, b, c);
    }

    static void CalculationAndOutput(double a, double b, double c) {

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation is degenerate.");
            } else {
                double x = -c / b;
                System.out.println("x = " + x);
            }
        } else {
            double d = b * b - 4 * a * c;

            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
            else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            }
            else {
                System.out.println("The solution is conjugate complex.");
            }
        }
    }

    public static void main(String[] args) {
        Input();
    }
}