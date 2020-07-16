package JavaZaawZad.Zad2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class StringList2 {
    public static void StringList(){
        List<String> list = Arrays.asList("Wiechu", "Andrzej", "Lukasz","anna", "jędruś", "Staszek");
        list.sort(String::compareToIgnoreCase);
        System.out.println("Lista posortowana bez znaczenia wielkości liter "+ list);
    }

}
