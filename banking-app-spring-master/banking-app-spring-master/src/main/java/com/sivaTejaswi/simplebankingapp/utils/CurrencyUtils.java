package com.sivaTejaswi.simplebankingapp.utils;

import com.sivaTejaswi.simplebankingapp.domain.enums.Currency;

import static com.sivaTejaswi.simplebankingapp.domain.enums.Currency.DOLLAR;
import static com.sivaTejaswi.simplebankingapp.domain.enums.Currency.EURO;
import static com.sivaTejaswi.simplebankingapp.domain.enums.Currency.POUND;

public class CurrencyUtils {

    public static Currency convertStringToCurrency (String currency) {
        switch (currency.toLowerCase()) {
            case "euro":
                return EURO;
            case "dollar":
                return DOLLAR;
            case "pound":
                return POUND;

                default:
                    return EURO;

        }
    }
}
