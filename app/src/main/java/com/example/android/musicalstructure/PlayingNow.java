package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Pufi on 3/28/2018.
 */

public class PlayingNow extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.playing_now);



        //find the TextView in the album_artist_list.xml layout with the ID second_name_text_view
        TextView artistTextView = (TextView) findViewById(R.id.artist_name_text_view);
        //get the artist name for the current song and set this text on the second text view
        artistTextView.setText(getIntent().getStringExtra("EXTRA_STUFF"));

        //TextView songTextView = (TextView) findViewById(R.id.song_name_text_view);
        //get the album name for the current song object and set this text on the first TextView
        //songTextView.setText(currentSong.getAlbumName());

        //find the TextView in the playing_now.xml layout with the id time_text_view
        //TextView timeTextView = (TextView) findViewById(R.id.time_text_view);
        //get the time for the current song and set this on the time text view
        //timeTextView.setText(currentSong.getSongTime());

    }
}
