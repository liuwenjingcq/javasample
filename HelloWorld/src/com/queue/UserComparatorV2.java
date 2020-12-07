package com.queue;

import java.util.Comparator;

public class UserComparatorV2 implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            if (u1.number.length() == u2.number.length()) {
                return u1.number.compareTo(u2.number);
            }
            return u1.number.length() - u2.number.length();
        }
        if (u1.number.charAt(0) == 'V') {
            return -1;
        } else {
            return 1;
        }
    }

}
