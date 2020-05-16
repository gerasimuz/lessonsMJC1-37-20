package edu.Iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain1 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add (1);
        data.add (5);
        data.add (17);
        data.add (28);

        for (Integer item : data) {
            System.out.println(item);
        }

        System.out.println("---");

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        System.out.println("---");

        Iterator <Integer> iter = data.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("---");





    }
}
