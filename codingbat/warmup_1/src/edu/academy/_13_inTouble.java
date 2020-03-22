package edu.academy;

public class _13_inTouble {
    public boolean inTrouble(boolean speaks, int hour) {
        if (speaks == true) {
            if ((hour < 7) || (hour > 20)) return true;
            else return false;
        }
            else return false;
    }
}
