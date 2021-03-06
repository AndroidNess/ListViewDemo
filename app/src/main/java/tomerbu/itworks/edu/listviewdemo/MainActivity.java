package tomerbu.itworks.edu.listviewdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Song> songs = getSongs();
        ListView lvSongs = (ListView) findViewById(R.id.lvSongs);

        SongAdapter adapter = new SongAdapter(songs, getLayoutInflater());
        lvSongs.setAdapter(adapter);
    }


    public ArrayList<Song> getSongs(){
        ArrayList<Song> data=  new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            data.add(
                    new Song("What's my Name",
                            "Rihanna", "3:47",
                            R.drawable.rihanna)
            );
            data.add(
                    new Song("Hello",
                            "Adele", "4:47",
                            R.drawable.adele)
            );
            data.add(
                    new Song("Shir shel paam",
                            "Chava Albrestein", "4:47",
                            R.drawable.chava)
            );
        }
        return data;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
