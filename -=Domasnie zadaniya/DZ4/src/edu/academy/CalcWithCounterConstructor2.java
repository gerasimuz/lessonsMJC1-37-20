package edu.academy;

public class CalcWithCounterConstructor2 implements ICalculator {

        private ICalculator calc;
        private int count;
        public CalcWithCounterConstructor2(ICalculator calcWithMath){
            this.calc=calcWithMath;
        }

    @Override
    public double plus(double a, double b) {
        count++;
        return calc.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        count++;
        return calc.minus(a, b);
    }

    @Override
    public double devide(double a, double b) {
        count++;
        return calc.devide(a, b);
        }

    @Override
    public double multiply(double a, double b) {
        count++;
        return calc.multiply(a, b);
    }

    @Override
    public double stepen(double a, double b) {
        count++;
        return calc.stepen(a, b);
    }

    @Override
    public double modul(double a) {
        count++;
        return calc.modul(a);
    }

    @Override
    public double koren(double a) {
        count++;
        return calc.koren(a);
    }


}
