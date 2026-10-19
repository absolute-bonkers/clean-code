package com.absolutebonkers.cleancode.dry;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class TaxCalculator {
    private final BigDecimal rate;

    public TaxCalculator(BigDecimal rate) {
        if (rate.signum() < 0) {
            throw new IllegalArgumentException("Tax rate cannot be negative");
        }
        this.rate = rate;
    }

    public BigDecimal taxFor(BigDecimal amount) {
        return amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
    }
}
