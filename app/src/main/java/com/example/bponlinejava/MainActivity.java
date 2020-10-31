package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvProgramPaket;
    ImageView ivSlideUiItb, ivSlideGetPtn, ivSlideAkm11, ivSlideMasterStudi, ivSlideNextSchool, ivSlideAKM48;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvProgramPaket = (TextView) findViewById(R.id.tvProgramPacket);
        ivSlideUiItb = (ImageView) findViewById(R.id.slideUiItb);
        ivSlideGetPtn = (ImageView) findViewById(R.id.slideGetPTN);
        ivSlideAkm11 = (ImageView) findViewById(R.id.slideAKM11);
        ivSlideMasterStudi = (ImageView) findViewById(R.id.slideMasterStudy);
        ivSlideNextSchool = (ImageView) findViewById(R.id.slideNextSchool);
        ivSlideAKM48 = (ImageView) findViewById(R.id.slidAKM48);

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
        if(v == tvProgramPaket){ i = new Intent(getApplicationContext(), LoginActivity.class); }
        if(v == ivSlideUiItb){ i = new Intent(getApplicationContext(), DescriptionUiItbActivity.class); }
        if(v == ivSlideGetPtn){ i = new Intent(getApplicationContext(), SuksesTembusPtnActivity.class); }
        if(v == ivSlideAkm11){ i = new Intent(getApplicationContext(), ProgramSuksesAkm11Sma.class); }
        if(v == ivSlideMasterStudi){ i = new Intent(getApplicationContext(), JagoBidangStudiActivity.class); }
        if(v == ivSlideNextSchool){ i = new Intent(getApplicationContext(), SuksesTembusSeklanFavoritActivity.class); }
        if(v == ivSlideAKM48){ i = new Intent(getApplicationContext(), SuksesAkm4Sd8SmpActivity.class); }
    }
}