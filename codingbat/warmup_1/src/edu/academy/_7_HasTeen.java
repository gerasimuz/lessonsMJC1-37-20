package edu.academy;

public class _7_HasTeen {

    public boolean hasTeen(int a, int b, int c) {
        int array[] = {a, b, c};
        int ss = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 13 && array[i] <= 19) {
                ss++;
            }
        }
        if (ss >= 1) return true;
            else return false;
    }
}