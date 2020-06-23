package Kolekcje;

import Kolekcje.zadanie5.StudentMejn;
import Kolekcje.zadanie6.Dziennik;
import Kolekcje.zadanie6.Student;

public class Main {
    public static void main(String[] args) {

//        StudentMejn.mejn();

        Dziennik dziennik = new Dziennik();

        //dodawania studentów
        dziennik.dodajStudenta(new Student("Michal","Gałgan", "1234"));
        dziennik.dodajStudenta(new Student("Sara","Ludzka", "5678"));
        dziennik.dodajStudenta(new Student("Wiechu","Debil", "9101"));
        dziennik.dodajStudenta(new Student("Lechu","Kolec", "1213"));
        dziennik.dodajStudenta(new Student("Kazia","Bałwan", "1415"));

//        dziennik.wyswietlStudentow();

//        //usuwanie studenta
//        dziennik.usunStudenta(new Student("Kazia","Bałwan","1415"));
//
//        dziennik.wyswietlStudentow();
//
//        //usuwanie po indexie
//        dziennik.usunStudentaPoIndexie("1213");

        //wyświetlanie studenta po numerze indexu
//        dziennik.zwrotStudentaPoIndexie("9101");

        //dodanie oceny do konkretnego studenta po numerze indexu
        dziennik.dodajOcene("9101",4.5);
        dziennik.dodajOcene("9101",3.5);
        dziennik.dodajOcene("9101",2.5);
        dziennik.dodajOcene("9101",4.0);
        dziennik.dodajOcene("9101",4.0);
        dziennik.dodajOcene("9101",4.5);
        dziennik.wyswietlStudentow();

        //zwrot posortowanej listy



    }


}

