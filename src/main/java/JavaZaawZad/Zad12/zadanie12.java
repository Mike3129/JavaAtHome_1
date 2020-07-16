package JavaZaawZad.Zad12;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class zadanie12 {
    private String name;
    private int rok;
    private String kraj;

    public zadanie12(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        zadanie12 zadanie12 = (zadanie12) o;
        return rok == zadanie12.rok &&
                Objects.equals(name, zadanie12.name) &&
                Objects.equals(kraj, zadanie12.kraj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rok, kraj);
    }
}
