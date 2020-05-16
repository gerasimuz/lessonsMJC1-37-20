package edu.lesson10;

public class DerivedClass extends BaseClass{

    @Override
    public void method() {
        super.method();
        System.out.println("method from DerivedClass");
    }
}
