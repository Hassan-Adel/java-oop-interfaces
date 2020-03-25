package com.tutorial;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport() {
    }

    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTaxes();
        System.out.println(tax);
    }

    public TaxReport setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
        return this;
    }
}

