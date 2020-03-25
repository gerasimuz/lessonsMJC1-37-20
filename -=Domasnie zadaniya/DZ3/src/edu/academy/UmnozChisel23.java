package edu.academy;

import java.util.Scanner;

public class UmnozChisel23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число до которого умножать");
        int N = scanner.nextInt();

        int sum = 1;
        do {
            sum = sum * (N % 10);
            System.out.println("cледующая цифра " +  (N%10) + " произведение с ним равно " + sum);
        }
        while((N/=10) != 0);

        System.out.println("произведение всех чисел от 1 до "+ N + " равна " + sum);
    }
}
