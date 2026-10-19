package com.absolutebonkers.cleancode.refactoring;

import java.math.BigDecimal;
import java.util.Objects;

public record CartItem(String name, BigDecimal unitPrice, int quantity) {
    public CartItem {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(unitPrice, "unitPrice");
        if (name.isBlank() || unitPrice.signum() < 0 || quantity < 1) {
            throw new IllegalArgumentException("Cart item values must be valid");
        }
    }

    public BigDecimal lineTotal() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }
}
