package com.example.yanjiegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class zhujiemian extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhujiemian);
        ImageButton button1=(ImageButton)findViewById(R.id.button_xueshan);
        ImageButton button2=(ImageButton)findViewById(R.id.button_caodi);
        ImageButton button3=(ImageButton)findViewById(R.id.button_hupo);
        ImageButton button4=(ImageButton)findViewById(R.id.button_chengbao);
        ImageButton button5=(ImageButton)findViewById(R.id.button_senlin);
        ImageButton button6=(ImageButton)findViewById(R.id.button_zhaoze);
        ImageButton button7=(ImageButton)findViewById(R.id.button_julong);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                //Toast.makeText(zhujiemian.this, "你点击了雪山", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(zhujiemian.this,gamexueshan.class);//当前活动，下个活动
                startActivity(intent1);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                //Toast.makeText(zhujiemian.this, "你点击了草地", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(zhujiemian.this,gamecaodi.class);//当前活动，下个活动
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                //Toast.makeText(zhujiemian.this, "你点击了湖泊", Toast.LENGTH_SHORT).show();
                Intent intent3=new Intent(zhujiemian.this,gamehupo.class);//当前活动，下个活动
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                //Toast.makeText(zhujiemian.this, "你点击了城堡", Toast.LENGTH_SHORT).show();
                Intent intent4=new Intent(zhujiemian.this,gamechengbao.class);//当前活动，下个活动
                startActivity(intent4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                //Toast.makeText(zhujiemian.this, "你点击了森林", Toast.LENGTH_SHORT).show();
                Intent intent5=new Intent(zhujiemian.this,gamesenlin.class);//当前活动，下个活动
                startActivity(intent5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                //Toast.makeText(zhujiemian.this, "你点击了沼泽", Toast.LENGTH_SHORT).show();
                Intent intent6=new Intent(zhujiemian.this,gamezhaoze.class);//当前活动，下个活动
                startActivity(intent6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                //Toast.makeText(zhujiemian.this, "你点击了巨龙", Toast.LENGTH_SHORT).show();
                Intent intent7=new Intent(zhujiemian.this,gamejulong.class);//当前活动，下个活动
                startActivity(intent7);
            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();
        mediaPlayer = MediaPlayer.create(this,R.raw.canon);
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