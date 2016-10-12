package com.korbkenny;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by KorbBookProReturns on 10/11/16.
 */
public class User {
    private String mName;
    private HashMap<String, Playlist> mPlaylists;

    public User(String name){
        mName = name;
        HashMap<String, Playlist> mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist){
        mPlaylists.put(playlist.getName(), playlist);
    }

    //~~~~~can't figure this one out
//    public Collection<String> getAllPlaylistNames() {
//        if (mPlaylists.equals(null)) {
//            System.out.println("What");
//            return null;
//        } else {
//            return mPlaylists.keySet();
//        }
//    }

    public Playlist getPlaylistByName(String name){
        if(mPlaylists.get(name).toString().equals("")) {
            return null;
        } else{
            return mPlaylists.get(name);
        }
    }
}
