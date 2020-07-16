package JavaZaawZad.Zad23;

import java.util.*;

public class Zoo {

    private List<String> animals;

    public Zoo(List<String> animals) {
        this.animals = animals;

    }

    public int getNumberofAllTypesOfAnimals() {
        Set<String> numberOfAnimals = new HashSet<>(animals);
        return numberOfAnimals.size();
    }



    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> animalsCount = new HashMap<>();
        animals.forEach(element -> {
            if (animalsCount.containsKey(element)) {
                Integer elementsCounter = animalsCount.get(element);
                elementsCounter++;
                animalsCount.put(element, elementsCounter);
            } else {
                animalsCount.put(element, 1);
            }
        });
        return animalsCount;
    }

}
