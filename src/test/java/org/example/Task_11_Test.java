package org.example;

import org.example.enums.SMSGatewayEnum;
import org.example.exceptions.SMSGatewayException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task_11_Test {

    private Task_11 task11;

    @BeforeEach
    public void setup(){
        task11 = new Task_11();
    }


    @Test
    public void should_throw_SMSGatewayException_when_gate_is_overloaded(){
        //given
        //when
        SMSGatewayException result = assertThrows(SMSGatewayException.class,
                this::testGateway);
        //then
        assertEquals(SMSGatewayEnum.GATE_OVERLOADED.getMessage(), result.getMessage());
    }


    private void testGateway() throws SMSGatewayException {
        while(true){
            task11.wyslijSms(000111222, "text");
        }
    }

}
