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

        System.out.println(empIds.containsKey("Alec"));
        System.out.println(empIds.containsValue(1230));

        //Can overwrite Keys if we put on the same key
        empIds.put("Alec", 6767);
        System.out.println(empIds);

        //replace only does something if the key exists
        empIds.replace("Dave", 9999);

        //IF key value doesnt exist, it will add the key value
        empIds.putIfAbsent("Steve",2222);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);





    }
}