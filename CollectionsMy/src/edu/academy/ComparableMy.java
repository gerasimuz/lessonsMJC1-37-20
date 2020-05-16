package edu.academy;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableMy {
    public static void main(String[] args) {


        Animal cat1 = new Animal("scottish", 6000, 105, 350);
        Animal cat2 = new Animal("breat", 8000, 150, 250);
        Animal cat3 = new Animal("Huilo", 3000, 10, 10);
        Animal cat4 = new Animal("Huil23", 4500, 10, 10);

        Animal[] cats = {cat1,cat2,cat3,cat4}; //загнали все обьекты в массив
        System.out.println("массив котов до сортировки");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].toString());
        }

        Arrays.sort(cats);   // отсортировали массив
        System.out.println("массив котов после сортировки по скорости");

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].toString());
        }





    }
}
