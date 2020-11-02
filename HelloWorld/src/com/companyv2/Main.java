package com.companyv2;


import com.company.Income;
import com.company.RoyaltyIncome;
import com.company.Salary;
import com.company.StateCouncilSpecialAllowance;

public class Main {
    public static void main(String[] args) {
        Incomev2[] incomev2 = new Incomev2[]{
                new RoyaltyIncomev2(12000),
                new Salaryv2(5000)
        };
        System.out.println(totalTax(incomev2));

    }

    public static double totalTax(Incomev2... incomev2s) {
        double total = 0;
        for (Incomev2 incomev2 : incomev2s) {
            total = total + incomev2.getTax();
        }
        return total;
    }

}

