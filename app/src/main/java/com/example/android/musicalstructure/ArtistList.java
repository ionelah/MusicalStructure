package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/*
 * Created by Pufi on 3/28/2018.
 */

public class ArtistList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.song_list);

        //create an arrayList of songs
        ArrayList<Song> songArrayList = new ArrayList<Song>();
        // initialize the elements of the ArrayList
        songArrayList.add(new Song(getString(R.string.artist_name1),getString(R.string.song_name2), getString(R.string.song_time2),""));
        songArrayList.add(new Song(getString(R.string.artist_name1),getString(R.string.song_name1),getString(R.string.song_time1),""));
        songArrayList.add(new Song(getString(R.string.artist_name2),getString(R.string.song_name3),getString(R.string.song_time3),""));
        songArrayList.add(new Song(getString(R.string.artist_name2),getString(R.string.song_name4),getString(R.string.song_time4),""));
        songArrayList.add(new Song(getString(R.string.artist_name3),getString(R.string.song_name5),getString(R.string.song_time5),""));
        songArrayList.add(new Song(getString(R.string.artist_name3),getString(R.string.song_name6),getString(R.string.song_time6),""));
        songArrayList.add(new Song(getString(R.string.artist_name3),getString(R.string.song_name7),getString(R.string.song_time7),""));

        // Create an ArrayAdapter, whose data source is a list of Strings.
        ArtistAdapter adapter = new ArtistAdapter(this, songArrayList);
        /* Find the ListView object in the view hierarchy of the Activity.
         * There should be a ListView with the view ID called list, which is declared in the song_list.xml file.
         */
        ListView listView = (ListView) findViewById(R.id.list);
        /* Make the ListView use the ArrayAdapter we created above, so that the
         * ListView will display list items for each word in the list of songs
         */
        listView.setAdapter(adapter);
    }
}

