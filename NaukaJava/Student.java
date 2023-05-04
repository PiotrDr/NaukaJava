public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int nrIndeksu;

    public void przedstawSie() {
        System.out.println("Nazywam się "+ imie + " " + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Zaloguj się za pomocą " + nick);
    }
    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to: " + nrIndeksu);
    }
    public void  podajEmail() {
        System.out.println("Mój email to: " + email);
    }
}
