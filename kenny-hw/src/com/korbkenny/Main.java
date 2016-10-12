package com.korbkenny;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User kenny = new User("Kenny");
        Song tugboat = new Song("Tugboat", "Galaxie 500", "Today");
        Song nowhere = new Song("Nowhere Near", "Yo La Tengo", "Painful");
        Song bloodlines = new Song("Bloodlines", "Mimicking Birds", "Eons");
        Song eluardian = new Song("An Eluardian Instance", "of Montreal", "Skeletal Lamping");
        Song thursday = new Song("Thursday Afternoon", "Brian Eno", "Thursday Afternoon");

        Playlist chill = new Playlist("Chill");
        chill.addSong(nowhere);
        chill.addSong(thursday);

        Playlist happy = new Playlist("Happy");
        happy.addSong(bloodlines);
        happy.addSong(eluardian);
        happy.addSong(tugboat);

       // System.out.println(kenny.getAllPlaylistNames());

        tugboat.play();
        nowhere.play();
        bloodlines.play();
        eluardian.play();
        thursday.play();


    }
}
