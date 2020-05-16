package edu.academy;

public class Calculator{

    public static Double calculate(final double numberOne, final String operation, final double numberTwo){

           switch (operation) {
               case ("+"):
                   return numberOne + numberTwo;

               case ("-"):
                   return numberOne - numberTwo;

               case ("*"):
                   return numberOne * numberTwo;

               case ("/"):
                   return numberOne / numberTwo;

               default:
                   return 0d;
           }
       }

    public static void main(String[] args) {
        System.out.println(calculate(2,"/",0));
    }
}


