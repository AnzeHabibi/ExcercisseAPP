package com.example.excercisse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class workout extends AppCompatActivity {

    LinearLayout fit1, fit2, fit3, fit4, fit1_1, fit2_2, fit3_3, fit4_4;
    TextView title, title2, sub, sub2, btn_start;
    View view,  view2;
    Animation img_move, btt, btt2, btt3, btt4, btt5, btt6, view1, view_2, btn, view2_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        img_move = AnimationUtils.loadAnimation(this, R.anim.img_move);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        btt2 = AnimationUtils.loadAnimation(this, R.anim.btt2);
        btt3 = AnimationUtils.loadAnimation(this, R.anim.btt3);
        btt4 = AnimationUtils.loadAnimation(this, R.anim.btt4);
        btt5 = AnimationUtils.loadAnimation(this, R.anim.btt5);
        btt6 = AnimationUtils.loadAnimation(this, R.anim.btt6);
        view1 = AnimationUtils.loadAnimation(this, R.anim.view1);
        view_2 = AnimationUtils.loadAnimation(this, R.anim.view_2);
        btn = AnimationUtils.loadAnimation(this, R.anim.btn);
        view2_2=AnimationUtils.loadAnimation(this, R.anim.view2_2);

        fit1=findViewById(R.id.fit1);
        fit2=findViewById(R.id.fit2);
        fit3=findViewById(R.id.fit3);
        fit4=findViewById(R.id.fit4);
        fit1_1=findViewById(R.id.fit1_1);
        fit2_2=findViewById(R.id.fit2_2);
        fit3_3=findViewById(R.id.fit3_3);
        fit4_4=findViewById(R.id.fit4_4);

        title=findViewById(R.id.title);
        title2=findViewById(R.id.title2);
        sub=findViewById(R.id.sub);
        sub2=findViewById(R.id.sub2);
        btn_start=findViewById(R.id.btn_start);

        view = findViewById(R.id.view);
        view2 = findViewById(R.id.view2);

        title.startAnimation(btt);
        sub.startAnimation(btt);
        view.startAnimation(btt);

        title2.startAnimation(btt2);
        sub2.startAnimation(btt2);

        fit1.startAnimation(btt3);

        fit2.startAnimation(btt4);

        fit3.startAnimation(btt5);

        fit4.startAnimation(btt6);

        view2.startAnimation(view2_2);
        btn_start.startAnimation(btn);

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(workout.this, workout2.class);
                startActivity(gotonext);
            }
        });

        fit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(workout.this, workout2.class);
                startActivity(gotonext);
            }
        });
        fit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(workout.this, workout3.class);
                startActivity(gotonext);
            }
        });
        fit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(workout.this, workout4.class);
                startActivity(gotonext);
            }
        });
        fit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(workout.this, workout5.class);
                startActivity(gotonext);
            }
        });

    }
}
