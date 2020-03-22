package edu.academy;

public class _14_negPos {
    public boolean negPos(int a, int b, boolean bool) {
        if (bool == false) {
            if ((a > 0 && b < 0) || (b > 0 && a < 0)) {
                return true;
            } else return false;
        }else if
        ((bool == true) && (a < 0 && b < 0)) {
            return true;
        }
        else return false;

    }
}