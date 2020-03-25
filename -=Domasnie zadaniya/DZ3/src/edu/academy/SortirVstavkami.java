package edu.academy;

import java.util.Arrays;
import java.util.Scanner;

public class SortirVstavkami {
    public static void main(String[] args) {

    //Сортировка прямыми включениями оно же вставками
    Scanner scanner = new Scanner(System.in);
        System.out.println("ведите количество элементов массива");
    int size = scanner.nextInt();

    int array[] = new int[size];
        System.out.println("введите сам массив");
        for (int i = 0; i < array.length; i++) {
        array[i] = scanner.nextInt();
    }
    //вывод массива
        System.out.println(Arrays.toString(array));

        //бщая суть сортировок вставками такова:
        //
        //Перебираются элементы в неотсортированной части массива.
        //Каждый элемент вставляется в отсортированную часть массива на то место, где он должен находиться.
        int left=0;
        int right = 0;
        for (int k =left; ++left <= right; k = ++left) {

            //Очередную пару рядом стоя́щих элементов
            //заносим в пару буферных переменных
            int a1 = array[k], a2 = array[left];
            if (a1 < a2) {
                a2 = a1; a1 = array[left];
            }

            //Вставляем больший элемент из пары
            while (a1 < array[--k]) {
                array[k + 2] = array[k];
            }
            array[++k + 1] = a1;

            //Вставляем меньший элемент из пары
            while (a2 < array[--k]) {
                array[k + 1] = array[k];
            }
            array[k + 1] = a2;
        }

//Граничный случай, если в массиве нечётное количество элементов
//Для последнего элемента применяем сортировку простыми вставками
        int last = array[right];
        while (last < array[right]) {
            array[right + 1] = array[right];
        }
        array[right + 1] = last;

    }
}
