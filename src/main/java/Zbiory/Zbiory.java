package Zbiory;


import java.util.*;

public class Zbiory {
    public static void zad1() {
    /*Umieść wszystkie elementy tablicy {​10​,​12​,​10​,​3​,​4​,​12​,​12​,​300​,​12​,​40​,​55​} wzbiorze (HashSet)
    oraz:Konstruktor kopiujący elementy listy do setu:Set<Integer> liczby = ​new ​HashSet<>(Arrays.​asList​(​1​, ​2​ ... ));
    a.Wypisz liczbę elementów na ekran (metoda size())
    b.Wypisz wszystkie zbioru elementy na ekran (forEach)
    c.Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
    d.zmień implementacje na TreeSet (zamień HashSet na TreeSet przy tworzeniuinstancji kolekcji
     */

        Set<Integer> liczby = new HashSet<>(Arrays.asList(10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 55));

        System.out.println("Cały zbiór: " + liczby);

        System.out.println("Liczba elementów zbioru: " + liczby.size());

        for (Integer l : liczby) {
            System.out.print(l + " ");
        }
        System.out.println();

        //usunięcie konkretnych elementów ze zbioru i wypisanie
        liczby.remove(10);
        liczby.remove(12);

        System.out.println(liczby);

        Set<Integer> liczby2 = new TreeSet<>(Arrays.asList(10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 55));
        System.out.println(liczby2);

    }
    /*
    Napisz statyczną metodę sprawdzającą,
    czy w tekście nie powtarzają się litery zwykorzystaniem zbioru.
    (boolean zawieraDuplikaty(String text))
     */
    public static boolean zawieraDuplikaty(String text){

        Set<Character> zbiorZnakow = new HashSet<>();
        for (int i = 0; i < text.length(); i++)
            zbiorZnakow.add(text.charAt(i));
        System.out.println(zbiorZnakow);

        return zbiorZnakow.size()!=text.length();

    }

    /*
    Utwórz klasę ParaLiczb (int a,int b) i dodaj kilka instancji do zbioru:{(1,2), (2,1), (1,1), (1,2)}.
    Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie zoczekiwaniem?
     */





    /*
    Stwórz aplikację która przyjmuje od użytkownika ciąg znaków (dowolny). Podziel ciąg(split) na pojedyncze litery.
    Twoim zadaniem jest stworzenie aplikacji która wypisze tylkounikalne litery frazy wpisanej przez użytkownika.
    Pomyśl o wykorzystaniu cechy zbioru -pamiętaj, że zbiór sam usuwa duplikaty
     */

    public static void ZwrotCiaguZnakow(){
        System.out.println("Podaj dowolny ciąg znaków");
        Scanner podajCiag = new Scanner(System.in);
        String podanyCiag = podajCiag.nextLine();
        Set<Character> ciagZnakow = new HashSet<>();
        for (int i = 1; i < podanyCiag.length(); i++)
            ciagZnakow.add(podanyCiag.charAt(i));
        System.out.println(ciagZnakow);
    }

    public static void ZwrotCiaguSlow(){
        System.out.println("Podaj dowolne zdanie odzielone spacjami");
        Scanner scanner = new Scanner(System.in);
        String podanyCiag = scanner.nextLine();

        Set<String> unikalneSlowa = new HashSet<>();
        //podział na słowa
        String[] slowa = podanyCiag.split(" ");
        //opcja 1
//        for (String b: slowa) {
//            unikalneSlowa.add(b);
//        }
//        System.out.println(unikalneSlowa);

        //opcja 2
        Collections.addAll(unikalneSlowa, slowa);
        System.out.println(unikalneSlowa);


        //zliczanie slow


    }

}
