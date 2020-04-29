package com.itcode.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

    private String playlistName;
    private ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        for (IComponent song : playlist) {
            song.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent song : playlist) {
            song.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }

   public void add(IComponent component) {
        if (component != null) {
            playlist.add(component);
        }
   }

   public void remove (IComponent component) {
        if (component != null) {
            playlist.remove(component);
        }
   }


}
