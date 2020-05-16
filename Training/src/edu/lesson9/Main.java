package edu.lesson9;

public class Main {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass();
        instance.method1();

         //upcasting
        SomeInterface1 instanceUp1 = instance;
        instanceUp1.method1();

        SomeInterface2 instanceUp2 = instance;
        instanceUp2.method2();

        SomeInterface3 instanseUp3 = instance;
        instanseUp3.method3();

        //DownCasting
        SomeClass instanceDown = (SomeClass) instanceUp1;
        instanceDown.method1();
        //множественное наследование в java запрещено. но разрешена множ имплементация


    }
}
