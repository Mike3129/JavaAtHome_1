package JavaZaawZad.Zad4;

import java.util.*;

/*
robione w domu
Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
addToStorage(String key, String value) → dodawanie elementów do przechowywalni
printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
 */

public class Storage2 {

    private Map<String, List<String>> mapa = new HashMap<>();

    public Storage2() {

    }

    public Storage2(Map<String, List<String>> mapa) {
        this.mapa = mapa;
    }

    public void addToStorage(String key, String value) {
        if (!mapa.containsKey(key)) { //jeżeli mapa nie zawiera danego klucza
            List<String> values = new ArrayList<>(); // to tworzymy nową listę wartości
            values.add(value); // dodajemy wartość do listy
            mapa.put(key, values); // dodajemy nowy klucz oraz listę wartości do mapy
        } else {
            mapa.get(key).add(value); // w innym przypadku wyszukujemy danego klucza i dodajemy wartość do niego,
            // jako że wartości to lista.
        }
    }

    public void printValues(String key) {
        System.out.println("Cała lista to: " + mapa);
        System.out.println("Wartości dla danego klucza to: " + mapa.get(key));
    }

    public void findValues(String value) {
        for (Map.Entry entry:mapa.entrySet()) {
            if (entry.getValue() == value)
                System.out.println("Klucze dla danej wartości to: " + entry.getKey());

        }


    }

    public void findValuesAlternative(String value){
        mapa.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
                .forEach(System.out::println);

    }

}
