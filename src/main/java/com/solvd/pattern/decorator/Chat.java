package com.solvd.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IChatAction {

    private List<ChatUser> users;

    @Override
    public void readMessage(ChatUser user) {
        if (this.users.contains(user)) {
            int userIndex = this.users.indexOf(user);
            String nickName = this.users.get(userIndex).getNickName();
            String message = this.users.get(userIndex).getReceivedMessages().get(this.users.get(userIndex).getReceivedMessages().size() - 1);
            System.out.printf("%s receive: %s%n", nickName, message);
        }
    }

    @Override
    public void sendMessage(ChatUser fromUser, ChatUser toUser, String message) {
        if (this.users.contains(fromUser) && this.users.contains(toUser)) {
            this.users.get(this.users.indexOf(fromUser)).getSentMessages().add(message);
            this.users.get(this.users.indexOf(toUser)).getReceivedMessages().add(message);
        }
    }

    public Chat() {
        this.users = new ArrayList<>();
    }

    public void register(ChatUser user) {
        if (!this.users.contains(user)) {
            this.users.add(user);
        }
    }

    public void remove(ChatUser user) {
        this.users.remove(user);
    }

    public List<ChatUser> getUsers() {
        return this.users;
    }

    public void setUsers(List<ChatUser> users) {
        this.users = users;
    }

}
