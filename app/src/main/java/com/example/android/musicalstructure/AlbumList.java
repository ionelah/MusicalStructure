package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/*
 * Created by Pufi on 3/28/2018.
 */

public class AlbumList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.song_list);

        //create an arrayList of songs
        ArrayList<Song> songArrayList = new ArrayList<Song>();
        // initialize the elements of the ArrayList
        songArrayList.add(new Song(getString(R.string.artist_name1),"", "",getString(R.string.album_name1)));
        songArrayList.add(new Song(getString(R.string.artist_name1),"","",getString(R.string.album_name2)));
        songArrayList.add(new Song(getString(R.string.artist_name2),"","",getString(R.string.album_name3)));
        songArrayList.add(new Song(getString(R.string.artist_name2),"","",getString(R.string.album_name4)));
        songArrayList.add(new Song(getString(R.string.artist_name3),"","",getString(R.string.album_name5)));
        songArrayList.add(new Song(getString(R.string.artist_name3),"","",getString(R.string.album_name6)));

        /* Create an ArrayAdapter, whose data source is a list of Strings. The
         * adapter knows how to create layouts for each item in the list, using the
         * album_artist_list.xml layout resource defined in the Android framework.
         * This list item layout contains a single TextView, which the adapter will set to display a single Song.
         */
        AlbumAdapter adapter = new AlbumAdapter(this, songArrayList);
        /* Find the ListView object in the view hierarchy of the Activity.
         * There should be a ListView with the view ID called list, which is declared in the song_list.xml file.
         */
        ListView listView = (ListView) findViewById(R.id.list);
        /* Make the ListView use the ArrayAdapter, so the ListView will display list items for each Song in the list of songs
         * Do this by calling the setAdapter method on the ListView object and pass in 1 argument-the ArrayAdapter
         */
        listView.setAdapter(adapter);
            }
}

