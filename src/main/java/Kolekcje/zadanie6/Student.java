package Kolekcje.zadanie6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private List<Double> oceny = new ArrayList<>();
    private String imie, nazwisko, index;

    public Student (String imie, String nazwisko, String index){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

}
