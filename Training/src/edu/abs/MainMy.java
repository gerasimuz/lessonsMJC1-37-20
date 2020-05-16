package edu.abs;
    abstract class AbstractClass{
    public abstract void method();
    }

    class ConcretteClass extends AbstractClass{
        public void method(){
        System.out.println("Implementation");
    }
    }


    public class MainMy {
    public static void main(String[] args) {
        AbstractClass instance = new ConcretteClass();
        instance.method();
    }
}

