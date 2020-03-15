package edu.academy;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {




            int dayNumber = 6;

            switch (dayNumber){
                case 1:
                    System.out.println("понедельник");
                    break;
                case 2:
                    System.out.println("вторник");
                    break;
                case 3:
                    System.out.println("среда");
                    break;
                case 4:
                    System.out.println("четверг");
                    break;
                case 5:
                    System.out.println("пятница");
                    break;
                default:
                    System.out.println("сегодня выходные");
                    break;
            }




//        операторы управление (ветвления)
//        тернарный оператор всегда!!! возвращает результат
//        выполняется (условие) ? (возвращаемое выражение при true) : (возвращаемое выражение при false)
        int c = 123;

        if (c > 0) {
            System.out.println("с положительное");
        } else {
            System.out.println("с отрицательное");
        }
        int a= 12323;
        int b = 123;
        if (a>b) {

            System.out.println("а больше b на " + (a-b));
                    } else if (a<b) {
            System.out.println("а меньше б на " + (b-a));
                    } else {
            System.out.println("они равны");
        }

        int x = (a<b) ? b-a : a-b;
        System.out.println("разница этих чисел равна " + x);


        }


    }