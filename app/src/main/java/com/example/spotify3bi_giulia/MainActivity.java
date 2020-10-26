package com.example.spotify3bi_giulia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.Glide;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    MediaPlayer tocador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img.findViewById(R.id.img_musica);
        Glide.with(this).load("https://img.youtube.com/vi/CIFrr1dqj5M/0.jpg").into(img);

        tocador = MediaPlayer.create(getApplicationContext(), R.raw.house);
    }
    protected void onResume(){
        super.onResume();
    }

    public void play(View view){
        tocador.start();
    }
}