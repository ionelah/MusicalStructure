package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows playing now category
        TextView playingNow = (TextView) findViewById(R.id.play);
        // Set a click listener on that View
        playingNow.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playing Now View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new intent to open the link Playing Now
                Intent playingNowIntent = new Intent(MainActivity.this, PlayingNow.class);
                //start the new activty
                startActivity(playingNowIntent);
            }
        });

        // Find the View that shows the album list
        TextView albumList = (TextView) findViewById(R.id.albums);
        // Set a click listener on that View
        albumList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album list is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Album List activity
                Intent albumListIntent = new Intent(MainActivity.this, AlbumList.class);
                // Start the new activity
                startActivity(albumListIntent);
            }
        });

        // Find the View that shows playlist
        TextView playlist = (TextView) findViewById(R.id.playlist);
        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the playlist activity
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows artist list
        TextView artistList = (TextView) findViewById(R.id.artist);
        // Set a click listener on that View
        artistList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist list is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Artist List Activity
                Intent artistListIntent = new Intent(MainActivity.this, ArtistList.class);
                // Start the new activity
                startActivity(artistListIntent);
            }
        });
    }
}





