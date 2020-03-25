package edu.academy;

import org.w3c.dom.ls.LSOutput;

public class StringMain2 {
    public static void main(String[] args) {


        String ilya = "Виталий";
        String fakeIlya = new String("Виталий");
        System.out.println(ilya==fakeIlya);
        System.out.println(ilya.equals(fakeIlya));
        System.out.println(ilya==fakeIlya.intern());

        //compareTo compareToIgnoreCase  = возвращает ноль если 2 строки равны друг другу. 1 - если символы 1 числа больше
        //символов второго числа.
        //CharAt - находит индекс искомого символа в массиве в строке
        //indexOf lastIndexOf - находим индексы строки в подстроке и запоминаем их индексы
        //substing - достать со строки подстроку - с 5 по 10 символ
        //toLowerCase toUpperCase -  применяется часто.

        //StringBuffer и StringBuilder

        String str = "изучаю что нибудь";
    }
}
