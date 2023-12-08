package de.neuefische;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(2);
        uniqueNumbers.add(23);
        uniqueNumbers.add(56);
        uniqueNumbers.add(786);
        System.out.println(uniqueNumbers);
        uniqueNumbers.add(2);
        uniqueNumbers.add(23);
        System.out.println(uniqueNumbers);

        char[] c = {'a', 'b', 'c'};

        Map<Integer, Character> chars = new HashMap<>();

        chars.put(97, c[0]);
        chars.put(98, c[1]);
        chars.put(99, c[2]);

        System.out.println(chars);

        Map<String, Car> cars = new HashMap<>();
        Car vw = new Car("1", "VW");
        Car bmw = new Car("2", "BMW");
        Car audi = new Car("3", "Audi");
        cars.put(vw.getId(), vw);
        cars.put(bmw.getId(), bmw);
        cars.put(audi.getId(), audi);
        for(String id : cars.keySet()){
            if(id.equals("1")){
                System.out.println(cars.get("1"));
            }
        }
        System.out.println(cars);
        cars.remove("1");
        System.out.println(cars);
        System.out.println(cars.containsKey("2"));
    }
}