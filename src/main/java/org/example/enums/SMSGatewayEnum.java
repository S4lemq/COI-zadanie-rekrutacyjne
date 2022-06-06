package org.example.enums;

public enum SMSGatewayEnum {
    GATE_OVERLOADED("bramka przeciążona");

    private final String message;

    SMSGatewayEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
