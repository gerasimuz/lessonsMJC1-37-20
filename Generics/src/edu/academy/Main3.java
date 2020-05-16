package edu.academy;


public class Main3 {
    public static void main(String[] args) {


        BoxGeneric<Integer> box = new BoxGeneric<>();
        box.setItem(123);

        BoxGeneric <String> box2 = new BoxGeneric<>();
        box2.setItem("Java рулит");
        System.out.println(box.getItem());
        System.out.println(box2.getItem());



    }
}