package Obiektowosc;

import lombok.Getter;

@Getter
public enum  PodatekProduktu {
    VAT8 (0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(0.00);

    private double wartoscPodatku;
    PodatekProduktu(double wartoscPodatku){
        this.wartoscPodatku = wartoscPodatku;
    }

}
