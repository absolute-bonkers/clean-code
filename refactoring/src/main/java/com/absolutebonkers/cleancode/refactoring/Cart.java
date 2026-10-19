package com.absolutebonkers.cleancode.refactoring;

import java.math.BigDecimal;
import java.util.List;

public final class Cart {
    private final List<CartItem> items;

    public Cart(List<CartItem> items) {
        this.items = List.copyOf(items);
    }

    public BigDecimal total() {
        return items.stream()
                .map(CartItem::lineTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
