package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/11/16.
 */
public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song(String songName, String artistName, String albumName){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play(){
        System.out.println("Playing "+mSongName+"\nby "+mArtistName+"\noff the album "+mAlbumName);
    }
}
