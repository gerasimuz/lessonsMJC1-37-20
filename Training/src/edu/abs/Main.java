package edu.abs;

public class Main {
    public static void main(String[] args) {
        Bird p = new Penguin();
        Bird s = new Straus();
        Bird sw = new Swallow();

        p.move();
        s.move();
        sw.move();



    }
}
