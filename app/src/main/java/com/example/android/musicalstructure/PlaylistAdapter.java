package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Pufi on 3/30/2018.
 */

public class PlaylistAdapter extends ArrayAdapter<song> {

    /** we create our constructor. The context is used to inflate the layout file.
     * The list is the data we want to populate the lists
     * @param context used to inflate the layout file
     * @param Song a list of song objects
     */
    public PlaylistAdapter(Activity context, ArrayList<song> Song)
    {super(context, 0, Song);   }

    /** Provides a view for an AdapterView (ListView, GridView...)
     *
     * @param position - the position in the list of data that should be displayed in the list item view
     * @param convertView - the recycled view to populate
     * @param parent - the parent ViewGroup that is used for inflation
     * @return - the View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.playlist, parent, false);
        }
        song currentSong = getItem(position);

        //find the TextView in the playlist.xml layout with the ID artist_from_playlist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_from_playlist_text_view);
        //get the artist name for the current song object and set it on the name TextView
        artistTextView.setText(currentSong.getArtistName());

        //find the TextView in the playlist.xml layout with the ID song_name_from_playlist
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name_from_playlist);
        //get the song name for the current song and set this text on the song name text view
        songTextView.setText(currentSong.getSongName());

        //find the TextView in the playing_now.xml layout with the id time_text_view
        //TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        //get the time for the current song and set this on the time text view
        // timeTextView.setText(currentSong.getSongTime());
        //return the whole list item layout

        // Lookup view for data population
        Button playButton = (Button) convertView.findViewById(R.id.button_play);

        // Cache row position inside the button using `setTag`
        //playButton.setTag(position);

        // Attach the click event handler
        if (playButton != null) {
            Toast.makeText(this, "here", Toast.LENGTH_SHORT).show();
            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playingNowIntent1 = new Intent(Playlist.this, PlayingNow.class);
                    //start the new activty
                    playingNowIntent1.putExtra("EXTRA_STUFF", "Nirvana");
                    //startActivity(playingNowIntent1);
                }
            });
        }
        return listItemView;
            }
        }
