package edu.academy;

public class BoyMain {
    public static void main(String[] args) {
        Boy Aleks = new Boy();
        Boy Fedya = new Boy();

        System.out.println("за 4 года рост Алекса составит " + Aleks.grow(4) + " см");
        System.out.println("за 9 лет рост Феди составит " + Fedya.grow(9) + " см");
    }
}
