package edu.interfaceMy;

class BaseClass{
    void meth(){
        System.out.println("base meth");
    }
}
interface Interface1{
    void method1();
}
interface Interface2{
    void method2();
}

class MyClass extends BaseClass implements Interface1, Interface2{
    @Override
    public void method1(){
        System.out.println("method in interface");
    }

    @Override
    public void method2() {
        System.out.println("method2 in interface");
    }
}


public class Starter {
    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.method1();
        my.method2();
        Interface1 link1 = new MyClass();
        Interface2 link2 = new MyClass();

        link1.method1();
        link2.method2();

        BaseClass base = new BaseClass();
        MyClass devired = new MyClass();
        BaseClass devired0 =  devired;
        Interface1 devired1 = devired;
        Interface2 devired2 = devired;
        devired0.meth();
        devired1.method1();
        devired2.method2();
    }
    }


