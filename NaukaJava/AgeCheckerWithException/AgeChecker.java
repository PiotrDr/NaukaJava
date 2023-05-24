package AgeCheckerWithException;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) throws InvalidAgeExceptions {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Czesc. Podaj swoj wiek");
        int age = scanner.nextInt();
        if ( age <= 0) {
            throw new InvalidAgeExceptions("Niepoprawny wiek");
        } else if (age >= 18 ) {
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Jestes niepelnoletni");
        }

    }
}
