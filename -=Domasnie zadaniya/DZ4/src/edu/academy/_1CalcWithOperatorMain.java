package edu.academy;

public class _1CalcWithOperatorMain {
    public static void main(String[] args) {
        _1CalcWithOperator example = new _1CalcWithOperator();
        _1CalcWithOperator ex = new _1CalcWithOperator();
        double a = example.devide(28,5);
        double b = example.stepen(a,2);
        double c = example.multiply(15,7);
        double d = example.plus(4.1,c);
        double result = example.plus(d, b);
        System.out.println("вычисленная переменная равна \n"+result);
        ////вторая часть.
//        double devide0 = ex.devide(result,0);
//        System.out.println(devide0);//ошибка infinity
//        double devide0Dd = ex.devide(result,0d);
//        System.out.println(devide0Dd);


        System.out.println("те же самые пункты через интерфейс ICalculator и класс CalculatorWithMath");
        _2CalcWithMath newMath = new _2CalcWithMath();
        double aa = newMath.devide(28,5);
        double bb = newMath.stepen(aa,2);
        double cc = newMath.multiply(15,7);
        double dd = newMath.plus(4.1,cc);
        double result2 = newMath.plus(dd, bb);
        System.out.println(result2);
    }
}
