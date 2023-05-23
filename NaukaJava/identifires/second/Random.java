package identifires.second;

import identifires.first.Parent;

//klasa potomna w innej paczce nie ma dostępu do pól/metod private, default(identyfikator paczki) oraz protected

public class Random {

    public void testIdentifier(){
        Parent parent = new Parent();
        System.out.println(parent.first);
        parent.firstMethod();
    }
}
