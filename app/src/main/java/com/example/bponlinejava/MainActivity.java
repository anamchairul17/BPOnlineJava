package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvProgramPaket = (TextView) findViewById(R.id.tvProgramPacket);
    ImageView ivSlideUiItb = (ImageView) findViewById(R.id.slideUiItb);
    ImageView ivSlideGetPtn = (ImageView) findViewById(R.id.slideGetPTN);
    ImageView ivSlideAkm11 = (ImageView) findViewById(R.id.slideAKM11);
    ImageView ivSlideMasterStudi = (ImageView) findViewById(R.id.slideMasterStudy);
    ImageView ivSlideNextSchool = (ImageView) findViewById(R.id.slideNextSchool);
    ImageView ivSlideAKM48 = (ImageView) findViewById(R.id.slidAKM48);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvProgramPaket.setOnClickListener(this);
        ivSlideUiItb.setOnClickListener(this);
        ivSlideGetPtn.setOnClickListener(this);
        ivSlideAkm11.setOnClickListener(this);
        ivSlideMasterStudi.setOnClickListener(this);
        ivSlideNextSchool.setOnClickListener(this);
        ivSlideAKM48.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = null;
        if(v == tvProgramPaket){
            i = new Intent(getApplicationContext(), MainActivity.class);
        }
    }
}