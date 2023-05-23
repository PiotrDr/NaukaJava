package identifires.second;

import identifires.first.Parent;

//klasa potomna w innej paczce nie ma dostępu do pól/metod private i default(identyfikator paczki)

public class Child extends Parent {
    public void testIdentifie(){
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}
