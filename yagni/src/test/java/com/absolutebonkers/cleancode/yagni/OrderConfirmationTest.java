package com.absolutebonkers.cleancode.yagni;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class OrderConfirmationTest {
    @Test
    void sendsTheConfirmationNeededByTheCurrentRequirement() {
        var sent = new String[2];
        var confirmation = new OrderConfirmation((address, message) -> {
            sent[0] = address;
            sent[1] = message;
        });

        confirmation.send("customer@example.com", "A-42");

        assertEquals("customer@example.com", sent[0]);
        assertEquals("Your order A-42 is confirmed.", sent[1]);
    }

    @Test
    void rejectsMissingOrderInformation() {
        var confirmation = new OrderConfirmation((address, message) -> {});

        assertThrows(IllegalArgumentException.class, () -> confirmation.send("", "A-42"));
    }
}
