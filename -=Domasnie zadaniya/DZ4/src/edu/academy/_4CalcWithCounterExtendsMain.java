package edu.academy;

public class _4CalcWithCounterExtendsMain {
    public static void main(String[] args) {
        _4CalcWithCounterExtends example = new _4CalcWithCounterExtends();
        double c = example.multiply(12,15);
        double d = example.devide(15,16);
        double e = example.plus(15,66);
        double f = example.minus(55,32);
        double g= example.stepen(5,3);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(example.getCounter());

        _1CalcWithOperator calc1 = new _1CalcWithOperator();
        _4CalcWithCounterExtends calc2 =new _4CalcWithCounterExtends();
        calc2.devide(3,5);
        System.out.println(calc2.getCounter());
    }
}
