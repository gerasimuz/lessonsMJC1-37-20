package edu.ExceptionsMy;

public class ExceptionMain1 {
    public static void main(String[] args) {
        System.out.println(method1(10));
    }

    public static int method1(int i) {
        try {
            return method2(i);
        } catch (IllegalArgumentException e) {
            System.out.println("ошибка");
        }
        return 100;
    }

    public static int method2(int i){
       return method3(i);
    }
    /* тут i должны быть отличное от 0.
        */
    public static int method3(int i){
       return 3;

    }

}
