import java.util.Scanner;

public class CzyPelnoletni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Mozesz kupic alkohol");
        } else if (age > 0 && age < 18){
            System.out.println("Jestes nieletni!");
        } else if (age == 0 || age < 0) {
            System.out.println("Podaj poprawna liczbe");
        }
    }
}
