package edu.academy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMy {
    public static void main(String[] args) {
        ArrayList <Integer> listMy = new ArrayList<>();
        listMy.add(0);
        listMy.add(45);
        listMy.add(23);
        listMy.add(132);
//        System.out.println(listMy);


        Iterator<Integer> iterator = listMy.iterator();
        while(iterator.hasNext()){
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }
    }


}
