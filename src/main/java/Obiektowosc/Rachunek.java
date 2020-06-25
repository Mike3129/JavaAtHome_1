package Obiektowosc;

import java.util.*;

public class Rachunek {
    private Set<Produkt> listaZakupow = new HashSet<>();

public void dodajProdukt(Produkt produkt){
    listaZakupow.add(produkt);
}
public void wyswietlRachunek(){
    System.out.println(listaZakupow);
}

}
