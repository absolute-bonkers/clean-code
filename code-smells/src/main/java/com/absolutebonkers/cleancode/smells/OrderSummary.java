package com.absolutebonkers.cleancode.smells;

import java.util.Objects;

public record OrderSummary(Customer customer, Address shippingAddress, Money total) {
    public OrderSummary {
        Objects.requireNonNull(customer, "customer");
        Objects.requireNonNull(shippingAddress, "shippingAddress");
        Objects.requireNonNull(total, "total");
    }

    public String describe() {
        return "%s <%s> — ship to %s, %s %s — total $%s".formatted(
                customer.name(),
                customer.email(),
                shippingAddress.street(),
                shippingAddress.city(),
                shippingAddress.postalCode(),
                total.amount());
    }
}
