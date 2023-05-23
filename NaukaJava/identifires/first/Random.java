package identifires.first;

//klasa w tej samej paczce nie ma dostępu do pól/metod private

public class Random {

        public void testIdentifier(){
            Parent parent = new Parent();
            System.out.println(parent.first);
            System.out.println(parent.second);
            System.out.println(parent.third);
            parent.firstMethod();
            parent.secondMethod();
            parent.thirdMethod();
        }
}
