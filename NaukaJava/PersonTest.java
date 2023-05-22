public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "University");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();
        Footballer footballer = new Footballer("Mike", 21, "Boca Juniors");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
