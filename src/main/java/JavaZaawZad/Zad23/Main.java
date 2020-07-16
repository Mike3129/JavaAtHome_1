package JavaZaawZad.Zad23;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Słoń");
        animals.add("Pies");
        animals.add("Kot");
        animals.add("Słoń");

        Zoo zoo = new Zoo (animals);
        System.out.println(zoo.getNumberofAllTypesOfAnimals());
        System.out.println(zoo.getAnimalsCount());



    }
}
