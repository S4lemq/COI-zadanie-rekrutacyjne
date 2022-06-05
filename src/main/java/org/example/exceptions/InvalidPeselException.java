package org.example.exceptions;

import org.example.enums.PeselMessageEnum;

public class InvalidPeselException extends RuntimeException{

    public InvalidPeselException() {
        super(PeselMessageEnum.INVALID_PESEL.getMessage());
    }
}
