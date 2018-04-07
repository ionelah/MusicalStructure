package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * Created by Pufi on 3/30/2018.
 */

public class ArtistAdapter extends ArrayAdapter<Song> {

        /* we create our constructor. The context is used to inflate the layout file.
         * The list is the data we want to populate the lists
         * @param context used to inflate the layout file
         * @param Song a list of Song objects
         */
        public ArtistAdapter(Activity context, ArrayList<Song> Song) {super(context, 0, Song);
        }

        /* Provides a view for an AdapterView (ListView, GridView...)
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
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_artist_list, parent, false);
            }
            //get the Song object located at the position in the list
            Song currentSong = getItem(position);

            //find the TextView in the album_artist_list.xml layout with the ID first_name_text_view (I will store artist name)
            TextView artistTextView = (TextView) listItemView.findViewById(R.id.first_name_text_view);
            //get the artist name for the current Song object and set it on the first name TextView
            artistTextView.setText(currentSong.getArtistName());

            //find the TextView in the album_artist_list.xml layout with the ID second_name_text_view(I will store Song name)
            TextView songTextView = (TextView) listItemView.findViewById(R.id.second_name_text_view);
            //get the Song name for the current Song and set this text on the second text view
            songTextView.setText(currentSong.getSongName());

            return listItemView;
        }
    }

