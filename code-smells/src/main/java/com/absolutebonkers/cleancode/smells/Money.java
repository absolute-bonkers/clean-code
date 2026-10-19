package com.absolutebonkers.cleancode.smells;

import java.math.BigDecimal;
import java.util.Objects;

public record Money(BigDecimal amount) {
    public Money {
        Objects.requireNonNull(amount, "amount");
    }
}
