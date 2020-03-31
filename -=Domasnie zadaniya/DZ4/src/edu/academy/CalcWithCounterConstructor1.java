package edu.academy;

public class CalcWithCounterConstructor1 implements ICalculator {
        //создали 3 переменные 3 типов, в которые потом будем помещать значения принимаемого аргумента по слову this
        private _2CalcWithMath calcWithMath;
        private _3CalcWithCounter calcWithCounter;
        private _4CalcWithCounterExtends calcWithMathExtends;
        private int count;

        //конструктор данного класса в зависимости от типа аргумента (принятой переменной)
        public  CalcWithCounterConstructor1(_2CalcWithMath calcWithMath){
            this.calcWithMath=calcWithMath;
        }

        public  CalcWithCounterConstructor1(_3CalcWithCounter calcWithCounter){
            this.calcWithCounter=calcWithCounter;
        }

        public  CalcWithCounterConstructor1(_4CalcWithCounterExtends calcWithMathExtends){
            this.calcWithMathExtends=calcWithMathExtends;
        }
        //метод подсчета количества обращений к интерфейсу ICalculator
        private ICalculator getCalc(){
            if (calcWithCounter != null){
                return calcWithCounter;
            }
            else if(calcWithMath != null){
                return calcWithMath;
            } else {
                return calcWithMathExtends;
            }
        }

        //определяем наши все методы заявленные в интерфейсе. обязательное явление
        @Override
        public double plus(double a, double b) {
            count++;
            return getCalc().plus(a, b);
        }

        @Override
        public double minus(double a, double b) {
            count++;
            if (calcWithCounter != null){return calcWithCounter.minus(a,b);
            } else{return calcWithMath.minus(a,b);
            }
        }

        @Override
        public double devide(double a, double b) {
            count++;
            if (calcWithCounter != null){
                return calcWithCounter.devide(a,b);
            } else{return calcWithMath.devide(a,b);
            }
        }

        @Override
        public double multiply(double a, double b) {
            count++;
            if (calcWithCounter != null){return calcWithCounter.multiply(a,b);
            }else{return calcWithMath.multiply(a,b);
            }
        }

        @Override
        public double stepen(double a, double b) {
            count++;
            if (calcWithCounter != null){
                return calcWithCounter.stepen(a,b);
            }else{
                return calcWithMath.stepen(a,b);
            }
        }

        @Override
         public double modul(double a) {
            count++;
            if (calcWithCounter != null) {
                return calcWithCounter.modul(a);
            }else{
                return calcWithMath.modul(a);
            }
        }

        @Override
        public double koren(double a) {
            count++;
            if (calcWithCounter != null) {
                return calcWithCounter.koren(a);
            }else{
                return calcWithMath.koren(a);
            }
        }
}
