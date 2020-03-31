package edu.academy;

public class _2CalcWithMath extends _1CalcWithOperator implements ICalculator{

    //наследуем все методы с CalcWithOperator переопределяем только 3 метода через Math/
    @Override
    public double modul(double a) {
        return Math.abs(a);
    }

    @Override
    public double stepen(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double koren(double a) {
        return Math.sqrt(a);
    }

    //    @Override
//    public double multiply(double a, double b) { return a*b; }
//
//    @Override
//    public double devide(double a,double b) {
//        return a/b;
//    }
//
//    @Override
//    public double plus(double a,double b) {
//        return a+b;
//    }
//
//    @Override
//    public double minus(double a,double b) {
//        return a-b;
//    }
//
//    @Override
//    public double stepen(double a,double b) {
//        return Math.pow(a,b);
//    }
//
//    @Override
//    public double modul(double a) {
//        return Math.abs(a);
//    }
//
//    @Override
//    public double koren(double a) {
//        return Math.sqrt(a);
//    }

}
