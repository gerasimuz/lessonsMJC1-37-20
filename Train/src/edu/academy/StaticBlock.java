package edu.academy;

class StaticBlock {
    static double rootOf2;
    static double rootOf3;


    //дальше статический блок - выполняется первым при загрузке класса
    static {
        System.out.println("статический блок");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock (String message){
        System.out.println(message);
    }
}

class SDemo3{
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");
        System.out.println(StaticBlock.rootOf2 + " " + StaticBlock.rootOf3);
    }
}