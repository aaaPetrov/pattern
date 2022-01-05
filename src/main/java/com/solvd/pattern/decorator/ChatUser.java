package com.solvd.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class ChatUser {

    private String nickName;
    private List<String> sentMessages;
    private List<String> receivedMessages;

    public ChatUser() {
        this.sentMessages = new ArrayList<>();
        this.receivedMessages = new ArrayList<>();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<String> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<String> sentMessages) {
        this.sentMessages = sentMessages;
    }

    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(List<String> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }
}
