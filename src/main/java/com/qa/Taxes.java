package com.qa;

public class Taxes {

    public int calculateTaxPercentage(int salary) {
        if (20000 > salary && salary >= 15000) return 10;
        if (30000 > salary && salary >= 20000) return 15;
        if (45000 > salary && salary >= 30000) return 20;
        if (45000 <= salary) return 25;
        return 0;
    }


    public Double howMuchTax(int salary) {
        return (1.00 *(salary / 100) * calculateTaxPercentage(salary));
    }
}
