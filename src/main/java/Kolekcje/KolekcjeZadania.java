package Kolekcje;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.ClientInfoStatus;
import java.util.*;

public class KolekcjeZadania {


        /*
Stwórz listę Integerów. Wykonaj zadania:
- dodaj do listy 5 elementów ze scannera
- dodaj do listy 5 elementów losowych
- wypisz elementy
Sprawdź działanie aplikacji.
         */

    public static void zad1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 5 liczb");
        ArrayList<Integer> liczby = new ArrayList<>();
        int i;
        for (i = 0; i < 5; i++)
            liczby.add(scanner.nextInt());

        System.out.println("Lista po wpisaniu liczb:");
        System.out.println(liczby);

        Random generator = new Random();
        for (i = 0; i < 5; i++) {
            liczby.add(generator.nextInt(50));
        }

        System.out.println("Lista po dodaniu losowych liczb");
        System.out.println(liczby);
    }

    /*
 Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
- dodaj do listy 10 liczb losowych
- oblicz sumę elementów na liście (wypisz ją)
- oblicz średnią elementów na liście (wypisz ją)
- stwórz kopię listy i ją posortuj: (Collections.sort( listaDoPosortowania) - sortuje listę)
(przykład użycia Collections.sort(lista):
ArrayList<Integer> liczby = new ArrayList<>();
liczby.add(5);
liczby.add(10);
liczby.add(15);
Collections.sort(liczby);
- podaj medianę elementów na liście posortowanej (wypisz ją)
- znajdź największy i najmniejszy element na liście która nie była sortowana. Zrób to pętlą for
- po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for
- po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
Sprawdź działanie aplikacji.Stwórz oddzielnego maina, a w nim kolejną listę integerów.

     */

    public static void zad2() {
        Random generator = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        int i;
        //wypisanie losowych liczb
        for (i = 0; i < 10; i++)
            lista.add(generator.nextInt(30));
        System.out.println(lista);

        //sumowanie losowych liczb
        int suma = 0;
        for (i = 0; i < lista.size(); i++) {
            suma = lista.get(i) + suma;
        }

        System.out.println("suma listy: " + suma);
        System.out.println("średnia liczb wynosi: " + suma / lista.size());

        //sortowanie listy
        ArrayList<Integer> listaPosortowana = lista;
        Collections.sort(listaPosortowana);
        System.out.println(listaPosortowana);

        int a = listaPosortowana.get(4);
        int b = listaPosortowana.get(5);
        float mediana = (a + b) / 2;

        System.out.println("Mediana listy wynosi " + mediana);

        // szukanie najmniejszego elemntu w nieposortowanej liście
        int min = 0;
        for (i = 1; i < lista.size(); i++) {
            if (lista.get(0) < lista.get(i)) {
                min = lista.get(0);
            } else {
                min = lista.get(i);
            }
        }
        System.out.println("najmniejszy element to: " + min);
        System.out.println("index elementu to: " + lista.indexOf(min));

        //szukanie największego elemntu
        int max = 0;
        for (i = 1; i < lista.size(); i++) {
            if (lista.get(0) > lista.get(i)) {
                max = lista.get(0);
            } else {
                max = lista.get(i);
            }
        }
        System.out.println("największy element to: " + max);
        System.out.println("index elementu to: " + lista.indexOf(max));
    }

    /*
    Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
- dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355,
2222, 1111, 3546, 138751, 235912 (jako stringi) (dodaj je posługując się metodą
Arrays.asList())
Przykład użycia Arrays.asList():
ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać
na liście String’ów.
- określ indeks elementu 138751 posługując się metodą indexOf
- sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
- sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
- usuń z listy obiekt 67888 oraz 67889 (metoda remove)
- wykonaj ponownie powyższe sprawdzenia.
- iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w
oddzielnej linii).
Sprawdź działanie aplikacji.
     */

    public static void zad3() {

        ArrayList<String> listaStringow =
                new ArrayList<>(Arrays.asList("10030", "10030", "138751", "3004", "4000", "12355", "12222", "67888", "111200",
                        "225355", "2222", "1111", "3546", "235912"));
        System.out.println(listaStringow);
        System.out.println("index elemntu 138751 to: " + listaStringow.indexOf("138751"));

        //szukamy na liście obiektu 67888

        System.out.println("Czy na liście znajduje się element 67888? --> " + listaStringow.contains("67888"));
        System.out.println("Czy na liście znajduje się element 67889? --> " + listaStringow.contains("67889"));

        //usuwanie określonych elementów
        listaStringow.remove("67889");
        listaStringow.remove("67888");

        System.out.println("Czy na liście znajduje się element 67888? --> " + listaStringow.contains("67888"));
        System.out.println("Czy na liście znajduje się element 67889? --> " + listaStringow.contains("67889"));

        //wyświetlanie listy za pomocą iteratora
        ListIterator<String> iterator = listaStringow.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
/*
Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
- dodaj do listy losowe 100 elementów z zakresu 0-100. (konwersja int na string to
String.valueOf())
- oblicz średnią liczb
- usuń wszystkie liczby powyżej średniej
- wypisz wszystkie liczby
- wykonaj kopię listy do tablicy
Sprawdź działanie aplikacji.

 */

        public static void zad4(){
            //dodanie 100 losowych elementów
            Random generator = new Random();
            ArrayList<String> stringi = new ArrayList(Arrays.asList("1586","66","558"));
            System.out.println(stringi);
            int i;
            for (i = 0; i < 100; i++) {
                stringi.add(String.valueOf(generator.nextInt(101)));
            }
            System.out.println(stringi);
            ArrayList<Integer> listaZeStringow = new ArrayList<>();
            for (String s : stringi)
                listaZeStringow.add(Integer.valueOf(s));
            System.out.println(listaZeStringow);

            // obliczanie średniej
            int suma = 0;
            for(i = 0; i < listaZeStringow.size(); i++)
                suma = suma + listaZeStringow.get(i);

            int srednia = suma / listaZeStringow.size();
            System.out.println("średnia z listy wynosi: " + srednia);

            //usunięcie liczb powyżej średniej
            for (i = 0; i < listaZeStringow.size(); i++) {
                if (listaZeStringow.get(i) > srednia)
                    listaZeStringow.remove(i);
            }
            System.out.println(listaZeStringow);
            System.out.println(listaZeStringow.size());

            //wyrzucenie listy do tablicy
            int[] tabListy = new int[listaZeStringow.size()];

            for (i = 0 ; i < listaZeStringow.size(); i++){
                tabListy[i] = listaZeStringow.get(i);
                System.out.println(tabListy[i]);
           }








        }




}
