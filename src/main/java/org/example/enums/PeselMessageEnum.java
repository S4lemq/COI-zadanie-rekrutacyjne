package org.example.enums;

public enum PeselMessageEnum {

    INVALID_PESEL("invalid pesel"),
    WRONG_LENGTH("invalid pesel length");

    private final String message;

    PeselMessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
