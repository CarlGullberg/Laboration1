package org.fungover;

public class EurToSekConverter implements CurrencyConverter {

    @Override
    public String getName() {
        return "EUR to SEK";
    }

    @Override
    public double convert(double amount) {
        return amount * 11.3; // Exempelväxelkurs
    }
}