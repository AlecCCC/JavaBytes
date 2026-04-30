package org.maps;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> empIds = new HashMap<>();

        empIds.put("Alec", 1230);
        empIds.put("Donald", 0326);
        empIds.put("Mike", 9716);

        System.out.println(empIds);

        System.out.println(empIds.get("Alec"));





    }
}