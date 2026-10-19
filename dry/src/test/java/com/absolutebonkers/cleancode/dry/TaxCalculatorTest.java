package com.absolutebonkers.cleancode.dry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class TaxCalculatorTest {
    @Test
    void checkoutAndQuoteShareTheSameTaxRule() {
        var calculator = new TaxCalculator(new BigDecimal("0.08"));
        var subtotal = new BigDecimal("19.99");

        assertEquals(new BigDecimal("1.60"), new Checkout(calculator).taxFor(subtotal));
        assertEquals(new BigDecimal("1.60"), new Quote(calculator).taxFor(subtotal));
    }
}
