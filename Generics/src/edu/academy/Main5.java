package edu.academy;

public class Main5 {
    public static void main(String[] args) {
        BoxGeneric<Long> box1 = new BoxGeneric<>();
        box1.setItem(123l);

        BoxGeneric<Number> box2 = new BoxGeneric<>();
        box2.setItem(123);

        BoxGeneric<Number> box3 = new BoxGeneric<>();
        box3.setItem(123);

        box3 = box2;

    }
}
