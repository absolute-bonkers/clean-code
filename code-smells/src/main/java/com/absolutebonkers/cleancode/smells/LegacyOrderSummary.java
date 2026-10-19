package com.absolutebonkers.cleancode.smells;

import java.math.BigDecimal;

public final class LegacyOrderSummary {
    public String describe(
            String customerName,
            String customerEmail,
            String street,
            String city,
            String postalCode,
            BigDecimal total) {
        return "%s <%s> — ship to %s, %s %s — total $%s".formatted(
                customerName, customerEmail, street, city, postalCode, total);
    }
}
