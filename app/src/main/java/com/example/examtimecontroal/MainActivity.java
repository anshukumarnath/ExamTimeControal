package com.example.examtimecontroal;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1= MediaPlayer.create(this,R.raw.three);
        t1= findViewById(R.id.mnumber);
         t2= findViewById(R.id.done);
        new CountDownTimer(120000,1000){
            public void  onTick(long millisecondsUnitDone){
                t1.setText("Time:"+String.valueOf(millisecondsUnitDone/1000));
            }
            public void onFinish(){
                t2.setText("Done !!");
                m1.start();
            }
        }.start();
    }
}