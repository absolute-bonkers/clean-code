package com.absolutebonkers.cleancode.yagni;

import java.util.Objects;

public final class OrderConfirmation {
    private final EmailSender emailSender;

    public OrderConfirmation(EmailSender emailSender) {
        this.emailSender = Objects.requireNonNull(emailSender, "emailSender");
    }

    public void send(String customerEmail, String orderNumber) {
        if (customerEmail == null || customerEmail.isBlank()
                || orderNumber == null || orderNumber.isBlank()) {
            throw new IllegalArgumentException("Email and order number are required");
        }
        emailSender.send(customerEmail, "Your order %s is confirmed.".formatted(orderNumber));
    }
}
