package com.itcode.observer;

/**
 * Created by abouhdaoui on 08/05/2020
 */
public class Follower implements Observer{
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        System.out.println("The Channel is " + status);
    }

    public void play() {
        System.out.println("Play channel");
    }
}
