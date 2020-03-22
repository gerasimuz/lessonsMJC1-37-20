package edu.academy;

public class _9_nearTo10 {
    public int nearTo (int a, int b){
        int aa= Math.abs(10-a);
        int bb= Math.abs(10-b);
        if (aa==bb){
            return 0;
        } else if(aa>bb)
            return b;
        else return a;

    }
}
