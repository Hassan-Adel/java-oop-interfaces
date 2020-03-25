package com.tutorial;

public class TaxCalculator2020 implements TaxCalculator {
    double taxableInccome;

    public TaxCalculator2020(double taxableInccome) {
        this.taxableInccome = taxableInccome;
    }

    @Override
    public double calculateTaxes() {
        return taxableInccome*0.4;
    }
}
