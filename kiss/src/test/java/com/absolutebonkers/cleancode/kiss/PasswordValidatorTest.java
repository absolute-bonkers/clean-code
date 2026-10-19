package com.absolutebonkers.cleancode.kiss;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void acceptsPasswordMeetingTheDocumentedRequirements() {
        assertTrue(validator.isValid("Bonkers2026!"));
    }

    @Test
    void rejectsMissingOrTooShortPasswords() {
        assertFalse(validator.isValid(null));
        assertFalse(validator.isValid("Short7"));
    }
}
