package Obiektowosc;

public class Main {
    public static void main(String[] args) {

//        Produkt.podajCeneBrutto(256.55);
        Rachunek rachunek = new Rachunek();
        rachunek.dodajProdukt(new Produkt("Masło",2.55,PodatekProduktu.VAT23));
        rachunek.wyswietlRachunek();
    }
}
