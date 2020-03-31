package edu.academy;

public class _3CalcWithCounter implements ICalculator {
    private int counter;
    public int getCounter() {
        return counter;
    }

    public double plus ( double a, double b){
        this.counter++;
        return (a+b);
    }

    public double minus ( double a, double b){
        this.counter++;
        return a-b;
    }

    public double multiply ( double a, double b){
        this.counter++;
        return a * b;
    }

    public double devide ( double a, double b){
        this.counter++;
        return a / b;
    }

    public double stepen(double a, double b){//a в степени b
        double res =1;
        this.counter++;
        for (int i=1;i<=b;i++){
            res=res*a;
        }
        return res;
    }

    public double modul(double a) {//модуль

        this.counter++;
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

    public double koren(double a){//корень

        double t;
        double squareRoot = a / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (a / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }

}
