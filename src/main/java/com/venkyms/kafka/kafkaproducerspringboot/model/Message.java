package com.venkyms.kafka.kafkaproducerspringboot.model;

public class Message {
    private String PCC;
    private String pnrLocator;

    public Message(String PCC, String pnrLocator) {
        this.PCC = PCC;
        this.pnrLocator = pnrLocator;
    }

    public String getPCC() {
        return PCC;
    }

    public void setPCC(String PCC) {
        this.PCC = PCC;
    }

    public String getPnrLocator() {
        return pnrLocator;
    }

    public void setPnrLocator(String pnrLocator) {
        this.pnrLocator = pnrLocator;
    }
}
