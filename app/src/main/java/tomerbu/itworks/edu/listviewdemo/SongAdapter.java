package tomerbu.itworks.edu.listviewdemo;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dev on 09/02/2016.
 */
public class SongAdapter extends BaseAdapter {
    private final ArrayList<Song> data;
    private final LayoutInflater inflater;

    public SongAdapter(ArrayList<Song> data, LayoutInflater inflater){
        this.data = data;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position,
                        View convertView,
                        ViewGroup parent) {

        View songView = inflater.inflate(
                R.layout.song_list_item,
                parent,
                false);

        Song s  = data.get(position);

        ImageView ivArtist = (ImageView) songView.findViewById(R.id.imageView);
        TextView tvArtist =   (TextView) songView.findViewById(R.id.tvArtist);
        TextView tvDuration =   (TextView) songView.findViewById(R.id.tvDuration);
        TextView tvSongTitle =   (TextView) songView.findViewById(R.id.tvSongTitle);

        ivArtist.setImageResource(s.imageResID);
        tvArtist.setText(s.artist);
        tvDuration.setText(s.duration);
        tvSongTitle.setText(s.title);

        return songView;
    }
}
