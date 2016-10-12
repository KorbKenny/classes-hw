package com.korbkenny;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KorbBookProReturns on 10/11/16.
 */
public class Playlist {
    private String mName;
    private List<Song> mSongs;

    public Playlist(String name){
        mName = name;
        mSongs = new ArrayList<>();
    }

    public String getName(){
        return mName;
    }

    public void addSong(Song song){
        mSongs.add(song);
    }

    public void playAll(){
        for (int i = 0; i < mSongs.size(); i++) {
            mSongs.get(i).play();
        }
    }
}
