package edu.academy;

public class _20_in3050 {
    public boolean in(int a, int b){
        boolean a30 = (a<=40&&a>=30)&&(b>=30&&b<=40);
        boolean b30 = (a<=50&&a>=40)&&(b>=40&&b<=50);

        if (a30==true)return true;
        else if (b30==true) return true;
        else return false;
    }
}
