package edu.interfaceMy;

public abstract class Bird implements Creator{
    public abstract void  move();
    public void eat (){
        System.out.println("I can eat");
    }
    public void live(){
        System.out.println("live in Bird");
    }
}
