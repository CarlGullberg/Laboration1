package org.fungover;

public interface CurrencyConverter {
    double convert(double amount);
    String getSourceCurrency();
    String getTargetCurrency();
}