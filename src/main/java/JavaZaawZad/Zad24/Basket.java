package JavaZaawZad.Zad24;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;

public class Basket {

    public static final int CAPACITY = 10;
    private List<Integer> items = new ArrayList<>();

    public Basket() {

    }

    public void addToBasket() {
        if (items.size() == CAPACITY) {
//            System.out.println("Too many items");
//            return;
            throw new BasketFullEception();
        }
        items.add(1);
        System.out.println("aaa");
    }

    public void removeToBasket() {
        if (items.size() == 0) {
            System.out.println("There are no items");
            return;
        }
        items.remove(1);
    }
}
