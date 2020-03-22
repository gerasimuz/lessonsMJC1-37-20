package edu.academy;

public class _18_teen13_19 {
    public boolean teen(int a, int b){

        boolean aa = (a>=13 && a<=19);
        boolean bb = (b>=13 && b<=19);

        if ((aa&&!bb)||(!aa&&bb)) return true;
        else return false;



    }
}
