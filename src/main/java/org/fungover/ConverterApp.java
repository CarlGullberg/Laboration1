package org.fungover;

import java.util.*;

public class ConverterApp {
    public static void main(String[] args) {
        ServiceLoader<CurrencyConverter> loader = ServiceLoader.load(CurrencyConverter.class);
        List<CurrencyConverter> converters = new ArrayList<>();

        System.out.println("Available converters:");
        int index = 1;
        for (CurrencyConverter converter : loader) {
            converters.add(converter);
            System.out.printf("%d. %s%n", index++, converter.getName());
        }

        if (converters.isEmpty()) {
            System.out.println("No converters found!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose converter (1-" + converters.size() + "): ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > converters.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        CurrencyConverter selected = converters.get(choice - 1);
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();
        double result = selected.convert(amount);
        System.out.printf("%.2f converted using '%s' = %.2f%n",
                amount, selected.getName(), result);
    }
}
