package com.absolutebonkers.cleancode.dry;

import java.math.BigDecimal;
import java.util.Objects;

public final class Checkout {
    private final TaxCalculator taxCalculator;

    public Checkout(TaxCalculator taxCalculator) {
        this.taxCalculator = Objects.requireNonNull(taxCalculator, "taxCalculator");
    }

    public BigDecimal taxFor(BigDecimal subtotal) {
        return taxCalculator.taxFor(subtotal);
    }
}
