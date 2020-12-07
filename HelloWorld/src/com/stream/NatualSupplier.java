package com.stream;

import java.util.function.Supplier;

public class NatualSupplier  implements Supplier<Integer> {
    int n = 0;
    public Integer get() {
        n++;
        return n;
    }
}
