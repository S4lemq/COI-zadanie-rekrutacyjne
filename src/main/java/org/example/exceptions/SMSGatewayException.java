package org.example.exceptions;

import org.example.enums.SMSGatewayEnum;

public class SMSGatewayException extends Exception{

    public SMSGatewayException() {
        super(SMSGatewayEnum.GATE_OVERLOADED.getMessage());
    }
}
