package edu.MyLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonimusComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vania");
        list.add("Pet");
        list.add("Ivanko");
        System.out.println(list);

//
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return 1;
//                } else if (o2.length() > o1.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        Comparator<String> comparator = Comparator.comparingInt(String::length);

        list.sort(comparator);
        System.out.println(list);
    }

}

