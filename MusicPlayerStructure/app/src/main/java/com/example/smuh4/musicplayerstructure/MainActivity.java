package com.example.smuh4.musicplayerstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nowPlaying = (Button) findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);

            }
        });

        TextView trendingAlbum1 = (TextView) findViewById(R.id.trending_album_1);

        trendingAlbum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });

        TextView trendingAlbum2 = (TextView) findViewById(R.id.trending_album_2);

        trendingAlbum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });

        TextView recentAlbum1 = (TextView) findViewById(R.id.recent_album_1);

        recentAlbum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });

        TextView recentAlbum2 = (TextView) findViewById(R.id.recent_album_2);

        recentAlbum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });

        TextView Album2 = (TextView) findViewById(R.id.album_2);

        Album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });

        TextView Album1 = (TextView) findViewById(R.id.album_1);

        Album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });


    }


}
