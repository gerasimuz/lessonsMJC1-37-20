package edu.academy;

class StaticDemo {
    static int y;
    int x;

    int sum(){
        return x+y;
    }
}

public class SDemo{
    public static void main(String[] args) {

        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("ob1.x = " + ob1.x + " ob2.x = " + ob2.x);

        StaticDemo.y = 100;
        System.out.println(ob1.sum());
        System.out.println(ob2.sum());
    }
}
