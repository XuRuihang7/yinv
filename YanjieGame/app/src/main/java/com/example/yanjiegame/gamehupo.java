package com.example.yanjiegame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class gamehupo extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamehupo);
    }
    @Override
    protected void onResume(){
        super.onResume();
        mediaPlayer = MediaPlayer.create(this,R.raw.soundofsilence);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}