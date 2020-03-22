package edu.academy;

public class _21_mod10 {
    public boolean mod(int a,int b){
        int c = a%10;
        int d = b%10;
        if (c==d) return true;
        else return false;
    }
}
