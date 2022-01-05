package com.solvd.pattern.decorator;

public interface IChatAction {

    void sendMessage(ChatUser fromUser, ChatUser toUser, String message);

    void readMessage(ChatUser chatUser);

}
