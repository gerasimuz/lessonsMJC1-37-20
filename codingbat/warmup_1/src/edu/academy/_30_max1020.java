package edu.academy;

public class _30_max1020 {
    public int lit(int a, int b) {
       boolean aa = (a >= 10 && a <= 20);
       boolean bb = (b >= 10 && b <= 20);
        if (aa && bb)return Math.max(a, b);
        else if (aa = true) return a;
        else if (bb=true) return b;
        else return 0;
    }
}