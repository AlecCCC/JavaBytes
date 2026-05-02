package org.maps;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        Map<String, Integer> empIds = new HashMap<>();
//
//        empIds.put("Alec", 1230);
//        empIds.put("Donald", 0326);
//        empIds.put("Mike", 9716);
//
//        System.out.println(empIds);
//
//        System.out.println(empIds.get("Alec"));
//
//        System.out.println(empIds.containsKey("Alec"));
//        System.out.println(empIds.containsValue(1230));
//
//        //Can overwrite Keys if we put on the same key
//        empIds.put("Alec", 6767);
//        System.out.println(empIds);
//
//        //replace only does something if the key exists
//        empIds.replace("Dave", 9999);
//
//        //IF key value doesnt exist, it will add the key value
//        empIds.putIfAbsent("Steve",2222);
//        System.out.println(empIds);
//
//        empIds.remove("Steve");
//        System.out.println(empIds);

        HashMap<String,String> bully = new HashMap<>();

        System.out.println(mapBully(bully));

        bully.put("a", "candy");
        bully.put("b", "");

        System.out.println(mapBully(bully));

        HashMap<String, String> mapab = new HashMap<>();

        mapab.put("a", "Hi");
        mapab.put("b","There");

        System.out.println(mapAB(mapab));




    }



    public static Map<String,String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }


    public static Map<String,String> mapShare(Map<String, String> map) {

        if (map.containsKey("a")) {

            map.put("b", map.get("a"));

        }
        map.remove("c");
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;

    }

}