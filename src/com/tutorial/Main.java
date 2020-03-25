package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var calculator = new TaxCalculator2020(100_000);
        var report = new TaxReport();
        report.setCalculator(calculator);
    }
}
