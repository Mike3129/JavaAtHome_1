package Obiektowosc;

import java.util.*;

public class Rachunek {
    private ArrayList<Produkt> listaZakupow = new ArrayList<>();

public void dodajProdukt(Produkt produkt){
    listaZakupow.add(produkt);
}
public void wyswietlRachunek(){

    System.out.println(listaZakupow);
}


}
