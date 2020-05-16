package edu.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


//http://tut.by/.... - http - протокол. by - домен верхнего уровня. tut.by- домен
public class Main {

    public static void main(String [] args)    {

        Pattern pattern = Pattern.compile("(http|https)://(\\w+\\.(\\w+))/.*");

        List <String> links =new ArrayList<>();
        try {
            links = Files.lines(Paths.get("D:\\JAVA\\-=Domasnie zadaniya\\DZ9\\src\\edu\\academy\\Benign_list.csv"))
                    .map(s -> s.replaceAll(";*",""))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }


        Map <String, Integer> http = new HashMap<>();
        Map < String, Integer> domen = new HashMap<>();
        Map < String, Integer> highDomen = new HashMap<>();

        for (String a: links) {
            Matcher matcher = pattern.matcher(a);
            while (matcher.find()) {

                    String ss1 = matcher.group(1);
                    String ss2 = matcher.group(2);
                    String ss3 = matcher.group(3);


                if (http.containsKey(ss1)){
                    http.put(ss1, http.get(ss1)+1);
                } else { http.put(ss1, 1); }

                if (domen.containsKey(ss2)){
                    domen.put(ss2, domen.get(ss2)+1);
                } else { domen.put(ss2, 1); }

                if (highDomen.containsKey(ss3)){
                    highDomen.put(ss3, highDomen.get(ss3)+1);
                } else { highDomen.put(ss3, 1); }
            }

        }

        System.out.println("ПОДЫТОЖИМ \n -----распределение по протоколам следующее:------ ");
        http.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(2)
                .forEach(System.out::println);

        System.out.println(" -----десять самых часто встречающихся доменов:------ ");
        domen.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(System.out::println);

        System.out.println(" -----десять самых часто встречающихся доменов верхнего уровня (страна):------ ");
        highDomen.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(System.out::println);
    }
}


