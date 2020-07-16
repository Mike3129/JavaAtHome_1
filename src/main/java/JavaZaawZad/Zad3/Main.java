package JavaZaawZad.Zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        //zadanie 3 wykonane na zajęciach
//        Map<String, Number> map1 = new HashMap<>();
//        map1.put("Java", 18);
//        map1.put("C++", 20);
//        map1.put("HTML", 85);
//        map1.put("PHP", 45);
//        map1.put("C#", 96);
//        printMap(map1);
//
//    }
//
//    //    //zadanie 3 wykonane na zajęciach
//    public static void printMap(Map<String, Number> map) {
//        int iterator = 0;
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry);
//            System.out.print(entry.getKey() + ", Wartość: " + entry.getValue());
//            if (iterator == map.size() - 1) {
//                System.out.print(".");
//            } else {
//                System.out.print(",");
//            }
//            System.out.println();
//            iterator++;
//
//        }
//
//
//    }
        //zadanie 3 robione w domu
        /*
        Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba, a
        następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: <k>, Wartość: <v>. Na końcu
        każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
        Przykład:
        Klucz: Java, Wartość: 18,
        Klucz: Python, Wartość: 1,
        …
        Klucz: PHP, Wartość: 0.
         */
        Mapa.getMap();
    }
}




