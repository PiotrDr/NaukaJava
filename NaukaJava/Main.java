import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czesc podaj 1 liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj 2 liczbe");
        int secoundNumber = scanner.nextInt();
        int dodaj, odejmij, podziel, pomnoz;
        dodaj = firstNumber+secoundNumber;
        odejmij = firstNumber-secoundNumber;
        podziel = firstNumber/secoundNumber;
        pomnoz = firstNumber*secoundNumber;
        System.out.println("Ich suma to " + dodaj);
        System.out.println("Ich odejmowanie to " + odejmij);
        System.out.println("Ich dzieleni to " + podziel);
        System.out.println("Ich mnożenie to " + pomnoz);
    }
}
