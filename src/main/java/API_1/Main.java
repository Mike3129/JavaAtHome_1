package API_1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zadanie 1
        /*
        Zadanie, część podstawowa:
Skorzystaj z rzeczy które poznaliśmy na poprzednich zajęciach i wykonaj zapytanie o fakt o kotach. Po odebraniu treści odpowiedzi przetwórz ją (jest w formacje JSON) i wyświetl użytkownikowi fakt. Następnie zapytaj użytkownika czy chce poznać
kolejny fakt, jeśli tak, to wykonaj kolejne zapytanie, pobierz je, przetwórz i wyświetl.
         */
        catFaktRodzaj.fact();

        //rozszerzenie zad 1
        System.out.println("Chcesz poznać fakt czy rodzaj kota? (fakt/rodzaj)");
        String odp2 = scanner.nextLine();

        if (odp2.equals("fakt")){
            catFaktRodzaj.fact();
        }
        else {
            catFaktRodzaj.rodzaj();
        }




    }
}
