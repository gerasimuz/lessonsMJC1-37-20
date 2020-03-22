package edu.academy;

public class _2_minus21 {
    public int minus(int n){
        if (n<=21)
            return Math.abs(21 - n);
         else
             return Math.abs(2*(n-21));
    }
}
