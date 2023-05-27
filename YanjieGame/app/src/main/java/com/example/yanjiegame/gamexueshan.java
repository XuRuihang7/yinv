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

public class gamexueshan extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView imageView1;
    private TextView textView1;
    private Button button1;
    private LinearLayout linearLayout;
    private int number1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamexueshan);
        imageView1=(ImageView)findViewById(R.id.img1);
        textView1=(TextView) findViewById(R.id.text1);
        //linearLayout = (LinearLayout)  findViewById(R.id.button_xueshan);
        number1 = 1;
        button1=(Button) findViewById(R.id.button_duihua);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里写响应程序
                number1++;
                switch(number1){
                    case 0:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("");
                        break;
                    case 1:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("这里好冷，白皑皑的。");
                        break;
                    case 2:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("星言儿，你还好吗？");
                        break;
                    case 3:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("我很好的，为了完成你的心愿，再大的困难我都不怕！");
                        break;
                    case 4:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("你走不动的话，就让我背你吧。");
                        break;
                    case 5:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("我可没那么脆弱！");
                        break;
                    case 6:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("我们继续前进吧！");
                        break;
                    case 7:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("呀，这是什么！");
                        break;
                    case 8:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("星言儿，快到我身后来！");
                        break;
                    case 9:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("唉？这是，稻草人路牌。");
                        break;
                    case 10:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("什么嘛，吓了我一跳，可是，路牌为什么要做成人的形状呢？");
                        break;
                    case 11:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("雪山里人迹罕至，做成这样，可能是为了给人指引和希望吧！");
                        break;
                    case 12:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("你说的好有道理，有了希望，人就会变得更坚强吧！");
                        break;
                    case 13:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("是的，希望是人最宝贵的东西，哪怕是仅存一丝希望，我也不会放弃！");
                        break;
                    case 14:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("你的他......");
                        break;
                    case 15:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("没事，前面的路还远，我们走吧！");
                        break;
                    case 16:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("小心！");
                        break;
                    case 17:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("还好，只是滑了一跤。");
                        break;
                    case 18:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("雪山的路也太难走了！");
                        break;
                    case 19:
                        imageView1.setImageResource(R.drawable.shaonv);
                        textView1.setText("我们小心一点，争取在天黑之前走出雪山。");
                        break;
                    case 20:
                        imageView1.setImageResource(R.drawable.xingyaner);
                        textView1.setText("嗯......");
                        break;
                    default:
                        Intent intent1=new Intent(gamexueshan.this,gamecaodi.class);
                        startActivity(intent1);
                        //变量值不是以上任何值时，执行这里
                }

            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        mediaPlayer = MediaPlayer.create(this,R.raw.numb);
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