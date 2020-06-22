package Kolekcje;

import org.w3c.dom.ls.LSOutput;

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
        System.out.println("index elementu to: "+ lista.indexOf(max));
    }


}
