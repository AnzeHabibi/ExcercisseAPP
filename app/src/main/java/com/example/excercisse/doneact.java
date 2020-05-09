package com.example.excercisse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class doneact extends AppCompatActivity {

    View view2;
    TextView textView, textView2, btn2;
    ImageView icon_Succes;
    Animation btn, alpha_time, bttnew, btt, view2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doneact);

        view2=findViewById(R.id.view2);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        btn2=findViewById(R.id.btn_start);
        icon_Succes=findViewById(R.id.icon_suc);

        bttnew= AnimationUtils.loadAnimation(this, R.anim.bttnew);
        btt= AnimationUtils.loadAnimation(this, R.anim.btt);
        btn= AnimationUtils.loadAnimation(this, R.anim.btn);
        alpha_time= AnimationUtils.loadAnimation(this, R.anim.alpha_time);
        view2_2= AnimationUtils.loadAnimation(this, R.anim.view2_2);

        icon_Succes.startAnimation(bttnew);
        textView.startAnimation(btt);
        textView2.startAnimation(btt);
        view2.startAnimation(view2_2);
        btn2.startAnimation(btn);

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonext = new Intent(doneact.this, MainActivity.class);
                startActivity(gotonext);
            }
        });


    }
}
