package Kolekcje.zadanie5;

import java.util.ArrayList;

public class StudentMejn {
    public static void mejn() {

        //zadanie 6
        ArrayList<Student> listaStudenow = new ArrayList<>();
        listaStudenow.add(new Student("1589", "Michal", "Soltysiak", Plec.MEZCZYZNA));
        listaStudenow.add(new Student("1523", "Jurek", "Burmistsz", Plec.MEZCZYZNA));
        listaStudenow.add(new Student("1459", "Wiecha", "przybora", Plec.KOBIETA));
        listaStudenow.add(new Student("1598", "Romualda", "Wieniawska", Plec.KOBIETA));

        //wypisanie listy poprzez sout
        System.out.println(listaStudenow);

        //wypisanie listy poprzez foreach
        for (Student s : listaStudenow) {
            System.out.println(s);
        }

        // wypisanie tylko kobiet
        System.out.println("Wypisuje tylko kobiety");
        for (Student kobiety : listaStudenow) {
            if (kobiety.getPlec().equals(Plec.KOBIETA)) {
                System.out.println(kobiety);
            }

        }
        // wypisanie tylko mężczyzn
        System.out.println("Wypisuje tylko mężczyzn");
        for (Student meny : listaStudenow) {
            if (meny.getPlec().equals(Plec.MEZCZYZNA)) {
                System.out.println(meny);
            }

        }

        // wypisanie tylko indexy
        System.out.println("Wypisuje tylko indexy osób");
        for (Student indexy : listaStudenow) {
            System.out.println(indexy.getNrIndexu());

        }
    }
}
