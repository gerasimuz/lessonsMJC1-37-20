package edu.academy;

public class CalculatorWithOperator {

    double devide(double a,double b){
        return (a/b);
    }
        double multiply(double a, double b){//умножение
        return (a*b);
    }
    double plus(double a, double b){//плюс
        return (a+b);
    }
    double minus(double a, double b){//минус
        return (a-b);
    }
    double stepen(double a, double b){//a в степени b
        double res =1;
        for (int i=1;i<=b;i++){
            res=res*a;
        }
        return res;
    }
    double modul(double a) {//модуль
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }
    double koren(double a){//корень
            double t;
            double squareRoot = a / 2;
            do {
                t = squareRoot;
                squareRoot = (t + (a / t)) / 2;
            } while ((t - squareRoot) != 0);
            return squareRoot;
        }
    }

