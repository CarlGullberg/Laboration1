package org.fungover;

import java.util.ServiceLoader;

public class ConverterApp {
    public static void main(String[] args) {
        ServiceLoader<CurrencyConverter> converters = ServiceLoader.load(CurrencyConverter.class);

        for (CurrencyConverter converter : converters) {
            System.out.println("Konverterare: " + converter.getClass().getSimpleName());
            System.out.println("100 enheter blir: " + converter.convert(100));
            System.out.println("----------");
        }
    }
}
