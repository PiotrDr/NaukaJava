package Lambda;

public class StudentTest {
    public static void main(String[] args) {

        Student it = new ItStudent();
        sayHello("John", it);

        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };
    sayHello("Anna", med);

        // (parametr) ->   System.out.println("I am not a student. My name is " + name);

        Student noStudent = name -> {
            System.out.println("I am not a student");
            System.out.println("My name is " + name);
        };
        sayHello("Tom", noStudent);
    }

    public static void sayHello(String name, Student student) {
        student.sayHello(name);
    }
}
