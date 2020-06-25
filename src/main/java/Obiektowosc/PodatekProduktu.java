package Obiektowosc;

import lombok.Getter;

@Getter
public enum  PodatekProduktu {
    VAT8 (0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(0.00);

    private Double wartoscPodatku;
    PodatekProduktu(Double wartoscPodatku){
        this.wartoscPodatku = wartoscPodatku;
    }

}
