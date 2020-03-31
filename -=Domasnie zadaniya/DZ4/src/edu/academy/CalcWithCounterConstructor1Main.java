package edu.academy;

public class CalcWithCounterConstructor1Main {
    public static void main(String[] args) {
        _3CalcWithCounter calcWithCounter = new _3CalcWithCounter();
        CalcWithCounterConstructor1 calc = new CalcWithCounterConstructor1(calcWithCounter);
        _2CalcWithMath calcWithMath = new _2CalcWithMath();
        CalcWithCounterConstructor1 calc2 = new CalcWithCounterConstructor1(calcWithMath);
        CalcWithCounterConstructor1 calc3 = new CalcWithCounterConstructor1(new _2CalcWithMath());
    }
}
