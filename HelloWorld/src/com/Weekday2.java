package com;

enum Weekday2 {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);
    public final int dayValue;

    private Weekday2(int dayValue) {
        this.dayValue = dayValue;
    }
}
