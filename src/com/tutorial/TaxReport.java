package com.tutorial;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }
    public void show(){
        var tax = calculator.calculateTaxes();
        System.out.println(tax);
    }
}
