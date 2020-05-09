package com.itcode.observer;

/**
 * Created by abouhdaoui on 08/05/2020
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
