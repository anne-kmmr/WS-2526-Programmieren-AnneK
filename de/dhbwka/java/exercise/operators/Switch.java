package de.dhbwka.java.exercise.operators;

public class Switch {
        public static void main(String args[]) {
            for (char c = 65; c < 91; c++) { // entspr. 'A'/'Z'
                switch (c) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println(c + " ist ein Vokal");
                        break;
                    case 'X':
                        System.out.println("Das " + c
                                + " ist mein Lieblingsbuchstabe");
                        break;
                    default:
                        System.out.println(c + " ist ein Konsonant");
                }
            }
        }
}
