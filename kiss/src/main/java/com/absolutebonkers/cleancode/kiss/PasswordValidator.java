package com.absolutebonkers.cleancode.kiss;

public final class PasswordValidator {
    public boolean isValid(String password) {
        return password != null
                && password.length() >= 12
                && password.chars().anyMatch(Character::isUpperCase)
                && password.chars().anyMatch(Character::isLowerCase)
                && password.chars().anyMatch(Character::isDigit);
    }
}
