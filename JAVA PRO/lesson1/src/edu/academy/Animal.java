package edu.academy;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class Animal {
    String breed;
    int price;

    Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal breed= " + breed + ", price= " + price;
    }
}

class MainAnimal{
    public static void main(String[] args) {
        Animal cat = new Animal("Brit",400);
        Animal dog = new Animal("LAzorit", 500);
        Animal bird = new Animal("Crow", 300);


        ArrayList <Animal> al = new ArrayList<>();
        al.add(new Animal("sphynx",5000));
        al.add(new Animal("malamut",400));
        al.add(new Animal("brit",300));

        Iterator <Animal> iterator = al.iterator();
            while (iterator.hasNext()){
            Animal tmp = iterator.next();
            tmp.price +=100;
            System.out.println(tmp);
        }


    }
}
