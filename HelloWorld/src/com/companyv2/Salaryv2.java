package com.companyv2;

public class Salaryv2 extends Incomev2 {

    public  Salaryv2(double incomev2){
        super(incomev2);
    }

    @Override
    public double getTax() {
        return incomev2 * 0.1;
    }
}
