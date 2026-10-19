package com.absolutebonkers.cleancode.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Test;

class CartTest {
    @Test
    void totalsEachItemsPriceTimesItsQuantity() {
        var cart = new Cart(List.of(
                new CartItem("Notebook", new BigDecimal("3.50"), 2),
                new CartItem("Pen", new BigDecimal("1.25"), 1)));

        assertEquals(new BigDecimal("8.25"), cart.total());
    }

    @Test
    void emptyCartTotalsZero() {
        assertEquals(BigDecimal.ZERO, new Cart(List.of()).total());
    }
}
