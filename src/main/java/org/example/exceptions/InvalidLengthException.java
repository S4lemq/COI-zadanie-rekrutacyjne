package org.example.exceptions;

import org.example.enums.PeselMessageEnum;

public class InvalidLengthException extends RuntimeException{

    public InvalidLengthException() {
        super(PeselMessageEnum.WRONG_LENGTH.getMessage());
    }
}
