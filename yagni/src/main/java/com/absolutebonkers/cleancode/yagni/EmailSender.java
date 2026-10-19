package com.absolutebonkers.cleancode.yagni;

@FunctionalInterface
public interface EmailSender {
    void send(String address, String message);
}
