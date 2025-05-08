package org.fungover;

public class UsdToSekConverter implements CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 10.5;
    }

    @Override
    public String getSourceCurrency() {
        return "USD";
    }

    @Override
    public String getTargetCurrency() {
        return "SEK";
    }
}
