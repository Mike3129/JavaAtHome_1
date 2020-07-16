package JavaZaawZad.Zad6;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Java", 5);
        map.put("C++", 8);
        map.put("Python", 10);

        printMap(map);

    }

    public static void printMap (TreeMap map){
        //treeMap segreguje, dlatego są inne wartości na wyjściu
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
