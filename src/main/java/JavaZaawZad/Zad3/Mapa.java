package JavaZaawZad.Zad3;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    //zadanie 3 robione w domu
    public static void getMap(){
        Map<String,Integer> newMap = new HashMap<>();
        newMap.put("Wiesiek", 1987);
        newMap.put("Maryna", 1988);
        newMap.put("Kołotko", 2020);
        newMap.put("Leszek", 1900);
        newMap.put("Waldek", 2000);
        int iterator = 0;
        for (Map.Entry entry:newMap.entrySet()) {
            System.out.print("Klucz "+ entry.getKey() +", Wartość " + entry.getValue());
            if (iterator == newMap.size() -1){
                System.out.print(".");
            }else {
                System.out.print(",");
            }
            System.out.println();
            iterator++;

        }






    }



}
