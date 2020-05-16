package edu.academy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAnimal {
    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("bulldog", 500));
        animals.add(new Animal("Sphinks", 200));
        animals.add(new Animal("Pit", 400));
        animals.add(new Animal("Masechka", 600));

        Iterator<Animal> iterator = animals.iterator();
        while(iterator.hasNext()){
            Animal tmp = iterator.next();
            System.out.println(tmp);

        }
    }
}
