package edu.academy;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Massive3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите количество элементов массива");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("введите сам массив");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }


        //вывод конечного массиве через for
        System.out.println("вывод массива через for ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        //вывод конечного массиве через do...while
        System.out.println("вывод массива через do...while: ");
        int t=0;
        do {System.out.print(array[t] + " ");
        t++;
        } while (t<(size));

        System.out.println("");
        //вывод конечного массиве через while
        System.out.println("вывод массива через while: ");
        int k=0;
        while (k<size){
            System.out.print(array[k] + " ");
            k++;
        }

        System.out.println("");
        //вывод массива через for..each
        System.out.println("вывод массива через for..each");
        for(int arrChislo:array){
            System.out.print(arrChislo + " ");
        }

        //вывод каждого второго элемента массива
        System.out.println(" ");
        System.out.println("вывод каждого второго элемента массива ");
        for (int i=0;i<array.length;i=i+2){
            System.out.print(array[i] + " ");

        }

        System.out.println(" ");
        System.out.println("введите каждый какой (N) элемент вы хотите выводить - ");
        int K = scanner.nextInt();

        for (int i=0;i<array.length;i++){
            if (i%K==0) System.out.print(array[i] + " ");
        }

    }



}
