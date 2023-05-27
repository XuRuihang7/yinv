package com.example.yanjiegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class kaichang extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView imageView1;
    private TextView textView1;
    private Button button1;
    private LinearLayout linearLayout;
    private int number1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaichang);
        imageView1=(ImageView)findViewById(R.id.img1);
        textView1=(TextView) findViewById(R.id.text1);
        linearLayout = (LinearLayout)  findViewById(R.id.linearlayout1);
        number1 = 0;
        button1=(Button) findViewById(R.id.button_duihua);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                number1++;
                //Toast.makeText(kaichang.this, "你点击了按钮1", Toast.LENGTH_SHORT).show();
                switch(number1){
                    case 0:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("所以说，是巨龙把你们拆散的？");
                        break;
                    case 1:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("没错。我们相遇相知相恋，一起踏上人生的旅途。我们走过很多地方，遇到了很多人和事，我们是彼此最重要的人。");
                        break;
                    case 2:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("你们......");
                        break;
                    case 3:
                        linearLayout.setBackgroundResource(R.drawable.julongfeizou);
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("直到我们遇到了它，未知的巨龙。我的恋人，我最重要的他，为了保护我，被巨龙抓去了很远的地方。");
                        break;
                    case 4:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("我能理解，你一定很想找到他吧...");
                        break;
                    case 5:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("那条巨龙，不管多远，不论千难万险，我都一定要找到它，击败它，然后救出他。");
                        break;
                    case 6:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("嗯，我会和你一起......");
                        break;
                    case 7:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("你有名字吗？");
                        break;
                    case 8:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("是你救了我，要不是你，我恐怕已经迷失在深山里了，所以，你给我取名字吧。");
                        break;
                    case 9:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("嗯......你长的好像星星，又这么可爱，就叫你星言儿好了。");
                        break;
                    case 10:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("好好听的名字，我喜欢这个名字。");
                        break;
                    case 11:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("那么，星言儿，我们出发吧！");
                        break;
                    default:
                        Intent intent1=new Intent(kaichang.this,zhujiemian.class);
                        startActivity(intent1);
                        //变量值不是以上任何值时，执行这里
                }

            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        mediaPlayer = MediaPlayer.create(this,R.raw.heartbeats);
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