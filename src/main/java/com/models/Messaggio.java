package com.models;

import java.time.LocalDate;

public class Messaggio {
    private int id;
    private String sender_message;
    private String msg;
    private Date timestamp;

}

public Messaggio(int id,String sender_message,String msg,Date timestamp) {
    this.id =id;
    this.sender_message= sender_message;
    this.msg=msg;
    this.timestamp=timestamp;
}

// Getters
public String getSenderMessage() {
    return sender_message;
}

public String getMsg() {
    return msg;
}

public Date getTimestamp() {
    return timestamp;
}

// Setters
public void setSenderMessage(String sender_message) {
    this.sender_message = sender_message;
}

public void setMsg(String msg) {
    this.msg = msg;
}

public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
}
