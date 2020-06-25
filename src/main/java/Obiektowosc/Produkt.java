package Obiektowosc;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Produkt {

    private String nazwaProduktu;
    private Double cenaProduktu;
    private PodatekProduktu podatekProduktu;

    public static void  podajCeneBrutto(Double cenaNetto){
        Double cenaBrutto = cenaNetto + (cenaNetto * PodatekProduktu.VAT23.getWartoscPodatku());
        System.out.println(cenaBrutto);

    }

    public Produkt(String nazwaProduktu, Double cenaProduktu, PodatekProduktu podatekProduktu){
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.podatekProduktu = podatekProduktu;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktu=" + cenaProduktu +
                ", podatekProduktu=" + podatekProduktu +
                '}';
    }
}


