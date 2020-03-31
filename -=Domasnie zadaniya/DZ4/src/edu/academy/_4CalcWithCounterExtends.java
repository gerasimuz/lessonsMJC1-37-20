package edu.academy;

public class _4CalcWithCounterExtends extends _1CalcWithOperator implements ICalculator{
    private int counter;

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

        public double stepen ( double a, double b){
            this.counter++;
            double sum = 1;
            for (int i = 1; i < b; i++) {
                sum = sum * a;
            }
            return sum;
        }
    public int getCounter(){
        return counter;
    }
    }

