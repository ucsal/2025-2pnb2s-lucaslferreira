package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private double taxRate;

    public TaxCalculator() {
        String prop = System.getProperty("tax.rate");
        if (prop != null) {
            taxRate = Double.parseDouble(prop);
        } else {
            taxRate = 0.10; // default 10%
        }
    }

    public double calculate(double amount) {
        return amount * taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}

