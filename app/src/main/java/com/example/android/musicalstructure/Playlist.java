package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Pufi on 3/28/2018.
 */

public class Playlist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.song_list);

        //create an arrayList of songs
        ArrayList<song> songArrayList = new ArrayList<song>();

        // initialize the elements of the ArrayList
        songArrayList.add(new song("@string/artist_name1","@string/song_name2", "@string/song_time2",""));
        songArrayList.add(new song("@string/artist_name1","@string/song_name1","@string/song_time1",""));
        songArrayList.add(new song("@string/artist_name2","@string/song_name3","@string/song_name3",""));
        songArrayList.add(new song("@string/artist_name2","@string/song_name4","@string/song_time4",""));
        songArrayList.add(new song("@string/artist_name3","@string/song_name5","@string/song_time5",""));
        songArrayList.add(new song("@string/artist_name3","@string/song_name6","@string/song_name6",""));
        songArrayList.add(new song("@string/artist_name3","@string/song_name7","@string/song_time7",""));


        // Create an ArrayAdapter, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // playing_now.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        PlaylistAdapter adapter2 = new PlaylistAdapter(this, songArrayList);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter2);



    }
}


