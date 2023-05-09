public class Auto {
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

    public Auto(String marka, String model, int rokProdukcji, int przebieg){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }
    public void jedz() {
        System.out.println("Jedz!");
    }
    public void hamuj() {
        System.out.println("Hamuj");
    }
    public void info() {
        System.out.println("Marka auto to: " + marka);
        System.out.println("Model auta to: " + model);
        System.out.println("Rok produkcji to: " + rokProdukcji);
        System.out.println("Jego przebieg to: " + przebieg);
    }
}
