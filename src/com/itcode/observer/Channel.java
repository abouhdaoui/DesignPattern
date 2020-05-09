package com.itcode.observer;

import java.util.Set;

/**
 * Created by abouhdaoui on 08/05/2020
 */
public class Channel implements Subject{
    private String channelName;
    private String status;
    private Set<Observer> observers;

    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer follower : observers) {
            follower.update(this.status);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
