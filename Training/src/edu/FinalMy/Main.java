package edu.FinalMy;

//если класс final то значит что наследование класса запрещено
//если final стоит у метода. то его запрещено переопределять.

final class FinalClass{
    public int x;
    public int y;

}

class DerivedClass {};

public class Main {
    public static void main(String[] args) {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;
        System.out.println(instance.x + " " + instance.y);
    }

}
