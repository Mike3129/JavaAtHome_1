package Zbiory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj tekst");
        Scanner daneWprowadzane = new Scanner(System.in);
        String text = daneWprowadzane.nextLine();
        System.out.println(Zbiory.zawieraDuplikaty(text));

//        Zbiory.ZwrotCiaguSlow();
    }

}
