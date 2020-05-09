package com.example.excercisse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class workout4 extends AppCompatActivity {

    TextView title2, sub2, time, btn_start;
    LinearLayout fit1;
    ImageView imageView;
    View view2, view;
    Animation btn, alpha_time, bttnew, bttnew2, view2_2;


    private static final long START_TIME_IN_MILLIS = 62000;
    private CountDownTimer countDownTimer;
    private boolean TimerRun;
    private long TimerRunning = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout4);

        title2 = findViewById(R.id.title2);
        sub2 = findViewById(R.id.sub2);
        time = findViewById(R.id.time);
        btn_start = findViewById(R.id.btn_start);

        imageView=findViewById(R.id.imageView);
        fit1=findViewById(R.id.fit1);

        view=findViewById(R.id.view);
        view2=findViewById(R.id.view2);

        bttnew= AnimationUtils.loadAnimation(this, R.anim.bttnew);
        bttnew2= AnimationUtils.loadAnimation(this, R.anim.bttnew2);
        btn= AnimationUtils.loadAnimation(this, R.anim.btn_1);
        alpha_time= AnimationUtils.loadAnimation(this, R.anim.alpha_time);
        view2_2= AnimationUtils.loadAnimation(this, R.anim.view_new);

        startTimer();

        view2.setVisibility(View.GONE);
        btn_start.setVisibility(View.GONE);

        fit1.startAnimation(bttnew);
        title2.startAnimation(bttnew);
        sub2.startAnimation(bttnew2);
        view.startAnimation(bttnew2);

        time.startAnimation(alpha_time);
        imageView.startAnimation(alpha_time);

        view2.startAnimation(view2_2);

        btn_start.startAnimation(btn);

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(workout4.this, workout5.class);
                startActivity(gotonext);
            }
        });
    }
    private void startTimer() {
        countDownTimer = new CountDownTimer(TimerRunning, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimerRunning = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Congratulation!", Toast.LENGTH_SHORT).show();


                view2.startAnimation(view2_2);
                btn_start.startAnimation(btn);

                view2.setVisibility(View.VISIBLE);
                btn_start.setVisibility(View.VISIBLE);
            }
        }.start();
        TimerRun = true;
    }
    private  void  updateCountDownText(){
        int minute = (int) (TimerRunning/1000)/60;
        int secon = (int) (TimerRunning/1000)%60;

        String timeleft = String.format(Locale.getDefault(), "%02d:%02d", minute, secon);
        time.setText(timeleft);
    }
}



