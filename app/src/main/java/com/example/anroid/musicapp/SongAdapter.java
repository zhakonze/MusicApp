package com.example.anroid.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zhakonze on 2018/09/21.
 */

public class SongAdapter extends ArrayAdapter<Song>
{

    public SongAdapter(Activity context, ArrayList<Song> words)
    {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);

        TextView _titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        _titleTextView.setText(currentSong.getmTitle());

        TextView _ArtistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        _ArtistTextView.setText(currentSong.getmArtist());


        return listItemView;
    }

}
