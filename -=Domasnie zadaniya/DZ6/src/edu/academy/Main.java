package edu.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //путь к файлу
        String filePath = "D:\\JAVA\\-=Domasnie zadaniya\\DZ6\\src\\edu\\academy\\WarAndPiece.txt";
        //читаем текст
        String textMy = "";
        try {
            textMy = new String (Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

          //разбиваем массив на слова

        String [] words = textMy.toLowerCase().replace(",","").replace(".","").replace("--","").split("\\s|\\b|=");

        //заносим слова в map
        Map < String, Integer> data = new HashMap<>();
        for (String word : words) {
            if (data.containsKey(word)){
                data.put(word, data.get(word)+1);
            }else { data.put(word, 1); }
            }

        data.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
}
// А ТАК ВООБЩЕ HASHMAP НЕ СОРТИРУЕТСЯ



//        for (Map.Entry<String,Integer> entry: data.entrySet()){
//            System.out.println(entry.getKey()+ " = "+ entry.getValue());
//        }


//    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue8(Map<K, V> map) {
//        Map<K, V> result = new LinkedHashMap<>();
//        Stream<Map.Entry<K, V>> data = map.entrySet().stream();
//        data.sorted(Comparator.comparing(e -> e.getValue())).forEach(e -> result.put(e.getKey(), e.getValue()));
//        return result;
//    }


}
