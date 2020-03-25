package edu.academy;
import java.util.Scanner;

public class Umnozhenie21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число до которого умножать");
        int n = scanner.nextInt();

        int sum =1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        System.out.println("сумма всех чисел от 1 до "+ n + " равна " + sum);
    }
}
