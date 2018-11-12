package com.example.anroid.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LoadMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_music);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("How do you know","Whitney"));
        songs.add(new Song("King of Kings","Cece Weanas"));
        songs.add(new Song("Kiki","Drake"));
        songs.add(new Song("6 foot, 7 foot","Lil Wayne"));
        songs.add(new Song("With You","Chris Brown"));
        songs.add(new Song("Fada fada","Phyno"));
        songs.add(new Song("Assurance","Davio"));
        songs.add(new Song("Act right","Yo Gotti"));
        songs.add(new Song("Amen","Drake ft Meek Mill"));
        songs.add(new Song("I'm a boss","Rick Ross"));
        songs.add(new Song("Make it rain","Fat joe"));
        songs.add(new Song("Candy bar","50 cent"));
        songs.add(new Song("Drop it like its hot","Snoop Dogg"));
        songs.add(new Song("Billy Jean","Micheal Jackson"));



        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
