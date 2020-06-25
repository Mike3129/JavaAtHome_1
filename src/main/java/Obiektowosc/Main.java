package Obiektowosc;

public class Main {
    public static void main(String[] args) {

//        Produkt.podajCeneBrutto(256.55);
        Rachunek rachunek = new Rachunek();
        rachunek.dodajProdukt(new Produkt("Masło",2.55,PodatekProduktu.VAT23));
        rachunek.dodajProdukt(new Produkt("Chleb",1.55,PodatekProduktu.VAT23));
        rachunek.dodajProdukt(new Produkt("Ser",6.77,PodatekProduktu.VAT23));
        rachunek.wyswietlRachunek();
        System.out.println("Suma netto wynosi: " + rachunek.sumaCenNetto());
        System.out.println("Suma brutto wynosi: " + rachunek.sumaBrutto());
        System.out.printf("Watość podatku: %.2f", rachunek.wartoscPodatku());



    }
}
