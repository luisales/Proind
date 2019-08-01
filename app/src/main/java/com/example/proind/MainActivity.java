package com.example.proind;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    Button bb, bn;
    ImageView iv1;
    Integer cont =1 ;

    protected void onCreate(Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.activity_main);
        bn = (Button) findViewById(R.id.btn_next);
        bb = (Button) findViewById(R.id.btn_back);
        iv1 = (ImageView) findViewById(R.id.imageView2);

        bn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                if (cont==1  )
                    iv1.setImageResource(R.drawable.color2);
                if (cont==2  )
                    iv1.setImageResource(R.drawable.color3);
                cont++;
            }
        });
        bb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                if (cont==1 || cont==2 )
                    iv1.setImageResource(R.drawable.color1);
                if (cont==3 )
                    iv1.setImageResource(R.drawable.color2);
                cont --;
            }
        });
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.sonido1);
        Button btnaudio = (Button) this.findViewById(R.id.btn_audio);
        btnaudio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                audio.start();


            }
        });
    }







}
