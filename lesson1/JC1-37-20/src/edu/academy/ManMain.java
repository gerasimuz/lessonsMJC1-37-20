package edu.academy;

public class ManMain {
    public static void main(String[] args) {
        Man maks = new Man();
        Man ilya = new Man();
        ilya = maks;

        System.out.println("maks :" + maks.hairLength);
        System.out.println("ilya :" + ilya.hairLength);
        for (int i = 0; i < 10; i++) {
            maks.grow();
        }
        System.out.println("maks :" + maks.hairLength);
        System.out.println("ilya :" + ilya.hairLength);

    }
}
