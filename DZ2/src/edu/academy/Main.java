package edu.academy;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("введите номер цвета");
    int col = scan.nextInt();

    Color color = new Color(col);
        System.out.println("мы передали в конструктор номер цвета - ");
        color.getNumber();
        System.out.println("цвет называется - ");
        color.getName();
    }
}
