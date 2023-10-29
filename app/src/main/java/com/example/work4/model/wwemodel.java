package com.example.work4.model;

public class wwemodel {
    String playername;
    int playerimage;

    public wwemodel(String playername, int playerimage) {
        this.playername = playername;
        this.playerimage = playerimage;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getPlayerimage() {
        return playerimage;
    }

    public void setPlayerimage(int playerimage) {
        this.playerimage = playerimage;
    }
}
