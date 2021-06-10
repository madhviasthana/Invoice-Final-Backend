package com.example.Invoice.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Message {
    private final int invoice_id;
    private final String chatmsg;
    private final Timestamp	 timestamp;
    private final boolean is_approver;

    public Message(@JsonProperty("invoiceid") int invoice_id,
                   @JsonProperty("chatmsg") String chatmsg, @JsonProperty("timeStamp") Timestamp timestamp,
                   @JsonProperty("approverstatus") boolean is_approver) {
        this.invoice_id = invoice_id;
        this.chatmsg = chatmsg;
        this.timestamp = timestamp;
        this.is_approver = is_approver;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public String getChatmsg() {
        return chatmsg;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public boolean isIs_approver() {
        return is_approver;
    }
}
