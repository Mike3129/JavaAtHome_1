package Kolekcje.zadanie5;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{

    private String nrIndexu;
    private String imie;
    private String nazwisko;
    private Plec plec;


}
