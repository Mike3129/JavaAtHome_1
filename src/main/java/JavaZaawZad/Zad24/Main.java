package JavaZaawZad.Zad24;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        for (int i = 0; i < Basket.CAPACITY + 1; i++) {
            basket.addToBasket();
        }

        Basket basket2 = new Basket();
        basket2.removeToBasket();
    }
}
