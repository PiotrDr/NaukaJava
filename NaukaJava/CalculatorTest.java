import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czesc podaj 1 liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj 2 liczbe");
        int secondNumber = scanner.nextInt();
       Calculator calculator = new Calculator();
       int dodaj = calculator.dodaj(firstNumber, secondNumber);
       int odejmij = calculator.odejmij(firstNumber,secondNumber);
       int podziel = calculator.podziel(firstNumber,secondNumber);
       int pomnoz = calculator.pomnoz(firstNumber,secondNumber);
        System.out.println("Ich suma to " + dodaj);
        System.out.println("Ich odejmowanie to " + odejmij);
        System.out.println("Ich dzielenie to " + podziel);
        System.out.println("Ich mnożenie to " + pomnoz);
        System.out.println("Ich modulo to " + calculator.mod(firstNumber,secondNumber));
    }
}
