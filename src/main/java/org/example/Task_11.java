package org.example;

import org.example.exceptions.SMSGatewayException;

public class Task_11 {

    SmsGateway smsGateway = new SmsGateway();
    Sms sms = new Sms();
    static int k = 0;
    public void wyslijSms(Integer numerTel, String trescSms) throws SMSGatewayException {
         k++;
         if(k>10) throw new SMSGatewayException();
        smsGateway.send(new Sms(numerTel, trescSms));
    }

    public static void main(String[] args)  {
        Task_11 task11 = new Task_11();
        Integer numerTel = 000000000;
        String trescSms = "text";
        for (int i = 0; i < 11; i++) {
            try {
                task11.wyslijSms(numerTel,trescSms);
            } catch (SMSGatewayException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Sms{
    private Integer numerTel;
    private String TrescSms;
    SmsGateway smsGateway = new SmsGateway();

    public Sms(){}

    public Sms(Integer numerTel, String trescSms) {
        this.numerTel = numerTel;
        TrescSms = trescSms;
    }
}

class SmsGateway{
    public void send(Sms sms) throws SMSGatewayException {
    }
}
