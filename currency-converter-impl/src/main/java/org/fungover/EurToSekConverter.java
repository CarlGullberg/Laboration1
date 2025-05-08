package org.fungover;

public class EurToSekConverter implements CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 11.0;
    }

    @Override
    public String getSourceCurrency() {
        return "EUR";
    }

    @Override
    public String getTargetCurrency() {
        return "SEK";
    }
}
