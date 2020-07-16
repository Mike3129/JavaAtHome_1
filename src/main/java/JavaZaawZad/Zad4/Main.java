package JavaZaawZad.Zad4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Storage2 storage = new Storage2();
        storage.addToStorage("9877","Wiecha");
        storage.addToStorage("1856","Władzia");
        storage.addToStorage("1285","Bolek");
        storage.addToStorage("12684","Wiecha");
        storage.addToStorage("6587","Widzimisia");
        storage.addToStorage("25977","Wojtka");
        storage.printValues("12684");
        storage.findValuesAlternative("Wiecha");


    }
}
