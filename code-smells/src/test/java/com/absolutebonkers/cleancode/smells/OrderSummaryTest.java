package com.absolutebonkers.cleancode.smells;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class OrderSummaryTest {
    @Test
    void summarizesAnOrderUsingNamedDomainValues() {
        var summary = new OrderSummary(
                new Customer("Ada", "ada@example.com"),
                new Address("1 Main St", "London", "N1"),
                new Money(new BigDecimal("24.50")));

        var expected = "Ada <ada@example.com> — ship to 1 Main St, London N1 — total $24.50";

        assertEquals(expected, summary.describe());
        assertEquals(expected, new LegacyOrderSummary().describe(
                "Ada", "ada@example.com", "1 Main St", "London", "N1",
                new BigDecimal("24.50")));
    }
}
