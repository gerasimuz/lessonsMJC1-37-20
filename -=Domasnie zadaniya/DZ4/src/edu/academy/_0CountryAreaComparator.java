package edu.academy;

import java.util.Comparator;

public class _0CountryAreaComparator implements Comparator<_0Country> {

    public int compare(_0Country o1, _0Country o2) {
        if (o1.getArea() == o2.getArea()) return 0;
        else if (o1.getArea() > o2.getArea()) {
            return 1;
        } else return -1;
    }

}
