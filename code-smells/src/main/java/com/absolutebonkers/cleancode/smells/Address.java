package com.absolutebonkers.cleancode.smells;

import java.util.Objects;

public record Address(String street, String city, String postalCode) {
    public Address {
        Objects.requireNonNull(street, "street");
        Objects.requireNonNull(city, "city");
        Objects.requireNonNull(postalCode, "postalCode");
        if (street.isBlank() || city.isBlank() || postalCode.isBlank()) {
            throw new IllegalArgumentException("Address fields are required");
        }
    }
}
