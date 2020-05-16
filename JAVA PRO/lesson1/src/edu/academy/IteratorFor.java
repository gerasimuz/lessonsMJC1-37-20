package edu.academy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorFor {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(2);
        a1.add(5);
        a1.add(8);
        System.out.println(a1);
        //создаем итератор arraylistа а1.

        ListIterator<Integer> listIterator = a1.listIterator();


        while (listIterator.hasNext()){

            System.out.print(listIterator.next()+ " ");
        }


    }

}
