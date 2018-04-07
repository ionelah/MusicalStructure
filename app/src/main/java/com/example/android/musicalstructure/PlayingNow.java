package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

import static com.example.android.musicalstructure.MainActivity.INTENT_KEY_ARTIST_NAME;
import static com.example.android.musicalstructure.MainActivity.INTENT_KEY_SONG_DURATION;
import static com.example.android.musicalstructure.MainActivity.INTENT_KEY_SONG_NAME;

/*
 * Created by Pufi on 3/28/2018.
 */

public class PlayingNow extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.playing_now);

        //find the TextView in the playing_now.xml layout with the ID artist_name_text_view
        TextView artistTextView = (TextView) findViewById(R.id.artist_name_text_view);
        //get the artist name for the current Song object(where we gave click) and set this text on the text view
        if (getIntent().hasExtra(INTENT_KEY_ARTIST_NAME)) {
            artistTextView.setText(getIntent().getStringExtra(INTENT_KEY_ARTIST_NAME));
        }
        //find the TextView in the playing_now.xml layout with the ID song_name_text_view
        TextView songTextView = (TextView) findViewById(R.id.song_name_text_view);
        //get the Song name for the current Song object(where we gave click) and set this text on the TextView
        if (getIntent().hasExtra(INTENT_KEY_SONG_NAME)) {
            songTextView.setText(getIntent().getStringExtra(INTENT_KEY_SONG_NAME));
        }
        //find the TextView in the playing_now.xml layout with the id time_text_view
        TextView timeTextView = (TextView) findViewById(R.id.time_text_view);
        //get the time for the current Song (where we gave click) and set this on the time text view
        if (getIntent().hasExtra(INTENT_KEY_SONG_DURATION)) {
            timeTextView.setText(getIntent().getStringExtra(INTENT_KEY_SONG_DURATION));
        }
    }
}
