package com.example.android.musicalstructure;

/*
 * Created by Pufi on 3/30/2018.
 */

public class Song {
    // artist name who sing the Song
    private String mArtistName;

    // Song name
    private String mSongName;

    // time to play the Song
    private String mSongTime;

    // album name
    private String mAlbumName;

    /* Create a new Song object.
     * @param artistName is the name of person who's singing
     * @param songName is the name of Song
     * @param songTime is the time will take the Song to be played
     * @param albumName is the name of album
     */
    public Song(String artistName, String songName, String songTime, String albumName) {
        mArtistName = artistName;
        mSongName = songName;
        mSongTime = songTime;
        mAlbumName = albumName;
    }

    // Get the name of artist
    public String getArtistName() {
        return mArtistName;
    }

    // Get the name of Song
    public String getSongName() {
        return mSongName;
    }

    // Get the time of Song
    public String getSongTime(){ return mSongTime;}

    // Get the name of album
    public String getAlbumName() {return mAlbumName;}
}
