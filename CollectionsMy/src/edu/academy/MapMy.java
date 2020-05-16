package edu.academy;

import java.util.HashMap;
import java.util.Map;

public class MapMy {
    public static void main(String[] args) {


        //в обьекте map хранятся пары ключ = значение
        Map<String, Integer> map = new HashMap<>();
        map.put("Petr",100);
        map.put("Denis",150);
        map.put("Petr",170);
        map.put("Me",190);
        map.put("Fedor", 140);
        System.out.println(map);
        System.out.println(map.size());

        for (Map.Entry<String, Integer> tmp: map.entrySet()) {
            System.out.println(tmp.getKey()+ " " + tmp.getValue());
        }

    }
}