package com.companyv3;

import com.company.Income;

public class SalaryIncomev3 implements Incomev3 {
    private double incomev3;
    SalaryIncomev3(double incomev3){
        this.incomev3 =incomev3;
    }
    @Override
    public double getTax() {
        if(incomev3<=5000){
            return 0;
        }else {
            return (incomev3-5000) * 0.2;
        }

    }
}
