package Kolekcje.zadanie6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student> {
    private List<Double> oceny = new ArrayList<>();
    private String imie, nazwisko, index;

    public Student (String imie, String nazwisko, String index){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }
    public int compareTo(Student other) {
        // dokonuje parsowania ze String -> Integer obu liczb/indeksów.
        return Integer.compare(Integer.parseInt(this.index), Integer.parseInt(other.index));
    }

}
