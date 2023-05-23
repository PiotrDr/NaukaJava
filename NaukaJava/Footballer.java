public class Footballer extends Person {

    public  String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
        System.out.println("Jestem w konstruktorze Footballer");
    }

    public void eat() {
        System.out.println("I like healthy food");
    }
    public void playFootball() {
        System.out.println("I am playing football for " + footballClub);
    }
}
