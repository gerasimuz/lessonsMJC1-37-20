package edu.academy;

public class CalcMain {
    public static void main(String[] args) {
        CalculatorWithOperator example = new CalculatorWithOperator();

        double a = example.devide(28,5);
        double b = example.stepen(a,2);
        double c = example.multiply(15,7);
        double d = example.plus(4.1,c);
        double result = example.plus(d, b);
        System.out.println("вычисленная переменная равна "+result);
    }
}
