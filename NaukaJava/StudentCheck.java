public class StudentCheck {
    public static void main(String[] args) {
        Student.infoUczelnia();
        Student nr1 = new Student();
        Student nr2 = new Student();
        Student nr3 = new Student();
        nr1.imie = "Adam";
        nr1.nazwisko = "Kowalski";
        nr1.email = "adam@mail.com";
        nr1.nrIndeksu = 12345;
        nr1.nick = "AdamxD1";

        nr2.imie = "Ania";
        nr2.nazwisko = "Nowak";
        nr2.email = "ania@mail.com";
        nr2.nrIndeksu = 23456;
        nr2.nick = "AnnaPanna";

        nr3.imie = "Kasia";
        nr3.nazwisko = "Nowa";
        nr3.email = "kasia@mail.com";
        nr3.nrIndeksu = 34567;
        nr3.nick = "Kacha";

        Student[] students = new Student[3];
        students[0] = nr1;
        students[1] = nr2;
        students[2] = nr3;
        for (int i = 0; i < students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }

    }
}
