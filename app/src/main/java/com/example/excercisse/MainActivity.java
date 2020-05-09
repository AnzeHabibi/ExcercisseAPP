package com.example.excercisse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView title, sub, btn_exc;
    View view, view2;
    Animation img_move, btt, btt2, view1, view_2, btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_move = AnimationUtils.loadAnimation(this, R.anim.img_move);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);
        btt2 = AnimationUtils.loadAnimation(this, R.anim.btt2);
        view1 = AnimationUtils.loadAnimation(this, R.anim.view1);
        view_2 = AnimationUtils.loadAnimation(this, R.anim.view_2);
        btn = AnimationUtils.loadAnimation(this, R.anim.btn);

        img = findViewById(R.id.img);
        title = findViewById(R.id.title);
        sub = findViewById(R.id.sub);
        btn_exc = findViewById(R.id.btn_exc);
        view = findViewById(R.id.view);
        view2 = findViewById(R.id.view2);

        img.startAnimation(img_move);
        title.startAnimation(btt);
        sub.startAnimation(btt2);
        view.startAnimation(view1);
        view2.startAnimation(view_2);
        btn_exc.startAnimation(btn);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(MainActivity.this, workout.class);
                startActivity(gotonext);
            }
        });

    }
}
