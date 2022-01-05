package com.solvd.pattern.decorator;

public class EncryptedChat extends Chat implements IEncrypt {

    private final Chat chat;

    public EncryptedChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(ChatUser fromUser, ChatUser toUser, String message) {
        message = encrypt(message);
        this.chat.sendMessage(fromUser, toUser, message);
    }

    @Override
    public void readMessage(ChatUser chatUser) {
        if (this.chat.getUsers().contains(chatUser)) {
            int userIndex = this.chat.getUsers().indexOf(chatUser);
            String message = this.chat.getUsers().get(userIndex).getReceivedMessages().get(this.chat.getUsers().get(userIndex).getReceivedMessages().size() - 1);
            message = decrypt(message);
            this.chat.getUsers().get(userIndex).getReceivedMessages().set(this.chat.getUsers().get(userIndex).getReceivedMessages().size() - 1, message);
        }
        this.chat.readMessage(chatUser);

    }

    @Override
    public String encrypt(String message) {
        System.out.println("Message encryption.");
        return message;
    }

    @Override
    public String decrypt(String message) {
        System.out.println("Message decryption.");
        return message;
    }

    @Override
    public void register(ChatUser user) {
        if (!this.chat.getUsers().contains(user)) {
            this.chat.getUsers().add(user);
        }
    }

    @Override
    public void remove(ChatUser user) {
            this.chat.getUsers().remove(user);
    }

}
