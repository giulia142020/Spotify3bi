package com.example.spotify3bi_giulia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.Glide;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img.findViewById(R.id.img_musica);
        Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSPuvNi9yBZ98a4_zCNDA2JFPBnl8WQmhIXDg&usqp=CAU").into(img);

        player = MediaPlayer.create(getApplicationContext(), R.raw.poeiradas);
    }
    protected void onResume(){
        super.onResume();
    }

    public void play(View view){
        player.start();
    }
}