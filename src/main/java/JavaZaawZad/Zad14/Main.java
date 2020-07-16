package JavaZaawZad.Zad14;

import com.sun.security.jgss.GSSUtil;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // sposób pierwszy
        Random random = new Random();
//        System.out.println(random.nextInt(5000));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt(50000));
        }
        System.out.println(list.size());
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));

        Set<Integer> set = new HashSet<>();
        list.forEach(element -> set.add(element));
        System.out.println(set.size());


        // sposób drugi stream
        List<Integer> listOfRandomInts;
        Random rand = new Random();
        final int maxValue = 50000;
        listOfRandomInts = IntStream.rangeClosed(0, 100000)
                .boxed()
                .map(i -> rand.nextInt(maxValue))
                .collect(Collectors.toList());
        System.out.println(listOfRandomInts.size());
        System.out.println(new HashSet<>(listOfRandomInts).size());

        List<Integer> ints = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 9);
        System.out.println(getDuplicatedElements(ints));
        TwentyFiveElements(ints);

    }

    //podpunkt drugi
    private static Set<Integer> getDuplicatedElements(List<Integer> ints) {
        Map<Integer, Integer> countedIntsMap = new HashMap<>();
        ints.forEach(element -> {
            if (countedIntsMap.containsKey(element)) {
                Integer elementsCounter = countedIntsMap.get(element);
                elementsCounter++;
                countedIntsMap.put(element, elementsCounter);
            } else {
                countedIntsMap.put(element, 1);
            }
        });
        return countedIntsMap
                .entrySet() //iterowanie po elementach mapy
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());

    }

    // podpunkt 3
    private static void TwentyFiveElements(List<Integer> ints) {
        Map<Integer, Integer> countedIntsMap = new HashMap<>();
        ints.forEach(element -> {
            if (countedIntsMap.containsKey(element)) {
                Integer elementsCounter = countedIntsMap.get(element);
                elementsCounter++;
                countedIntsMap.put(element, elementsCounter);
            } else {
                countedIntsMap.put(element, 1);
            }
        });
        countedIntsMap
                .entrySet() //iterowanie po elementach mapy
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                })
                .forEach(entry -> System.out.println(entry));

    }
}
