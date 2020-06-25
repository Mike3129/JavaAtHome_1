package Obiektowosc;

import java.util.*;

public class Rachunek {
    private ArrayList<Produkt> listaZakupow = new ArrayList<>();

    public void dodajProdukt(Produkt produkt) {
        listaZakupow.add(produkt);

    }

    public void wyswietlRachunek() {

        for (Produkt s : listaZakupow) {
            System.out.println(s);
        }

    }

    public double sumaCenNetto() {

        double suma = listaZakupow.get(0).getCenaProduktu();
        for (int i = 1; i < listaZakupow.size(); i++) {
            suma = suma + listaZakupow.get(i).getCenaProduktu();
        }
        return suma;
    }

    public double sumaBrutto() {
        double suma2 = (listaZakupow.get(0).getCenaProduktu() + (listaZakupow.get(0).getCenaProduktu() *
                listaZakupow.get(0).getPodatekProduktu().getWartoscPodatku()));

        for (int i = 1; i < listaZakupow.size(); i++) {
            suma2 = suma2 + (listaZakupow.get(i).getCenaProduktu() + (listaZakupow.get(i).getCenaProduktu() *
                    listaZakupow.get(i).getPodatekProduktu().getWartoscPodatku()));
        }
        return suma2;


    }

    public double wartoscPodatku(){
        double roznica = sumaBrutto() - sumaCenNetto();
        return roznica;
    }


}
