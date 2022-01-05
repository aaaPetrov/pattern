package com.solvd.pattern.listener;

public class Player implements StatusChangable {

    private String nickName;
    private boolean canPlay;

    public Player(String nickName) {
        this.nickName = nickName;
        this.canPlay = true;
    }

    @Override
    public void onStatusChanged(Status status) {
        switch (status) {
            case ONLINE:
                this.canPlay = true;
                System.out.printf("%s, server is %s.%n", nickName, status.name());
                break;
            case OFFLINE:
                this.canPlay = false;
                System.out.printf("%s, server is %s.%n", nickName, status.name());
                break;
            case UPDATE_NEEDED:
                this.canPlay = false;
                System.out.printf("%s, download update to play at server.%n", nickName);
                break;
            default:
                break;
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
