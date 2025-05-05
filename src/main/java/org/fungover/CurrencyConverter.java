package org.fungover;

public interface CurrencyConverter {
    String getName();
    double convert(double amount);
}