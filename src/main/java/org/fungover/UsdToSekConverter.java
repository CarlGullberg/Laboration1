package org.fungover;

public class UsdToSekConverter implements CurrencyConverter {

    @Override
    public String getName() {
        return "USD to SEK";
    }

    @Override
    public double convert(double amount) {
        return amount * 10.5; // Exempelväxelkurs
    }
}
