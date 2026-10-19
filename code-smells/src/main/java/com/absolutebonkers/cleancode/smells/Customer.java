package com.absolutebonkers.cleancode.smells;

import java.util.Objects;

public record Customer(String name, String email) {
    public Customer {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(email, "email");
        if (name.isBlank() || email.isBlank()) {
            throw new IllegalArgumentException("Customer name and email are required");
        }
    }
}
