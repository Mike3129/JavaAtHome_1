package Kolekcje;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class KolekcjeZadania {


        /*
Stwórz listę Integerów. Wykonaj zadania:
- dodaj do listy 5 elementów ze scannera
- dodaj do listy 5 elementów losowych
- wypisz elementy
Sprawdź działanie aplikacji.
         */

    public static void zad_1() {
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




}
