package JavaZaawZad.Zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class StringList{
    public static void StringList(){
        List<String> list = Arrays.asList("Wiechu", "Andrzej", "Lukasz");
        list.sort(Collections.reverseOrder());
        System.out.println("Lista po sortowaniu od tyłu: "+ list);
        Collections.sort(list);
        System.out.println("Lista po sortowaniu zwykłym: " + list);
    }

}
