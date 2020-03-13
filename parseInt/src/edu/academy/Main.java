package edu.academy;

public class Main {

    public static class AutoBoxingExample {

        public static void main(String[] args) {
            String a = "45";
            double b = Double.parseDouble(a);//метод перевод из строки в целочисленный или дробный тип
            int c = Integer.parseInt(a);
            System.out.println(b);
            System.out.println(c);

            String dd="64";
            double ddd = Double.parseDouble(dd);

            System.out.println(ddd);
            System.out.println(Integer.valueOf(dd,16));
            System.out.println(Integer.valueOf(dd,10));
            System.out.println(Integer.valueOf(dd,8));
            Boolean B1 = Boolean.TRUE;
            Boolean B2 = new Boolean ("true"); //можно и так и так. обект обертка будет иметь значение true только если в него помещено значение тру, во всвех остальных случаях false
            Boolean wBool = false;
            System.out.println(wBool);


        }
    }
}