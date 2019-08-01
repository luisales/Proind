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
   private Integer cont =1 ;

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
                if (cont==3  )
                    iv1.setImageResource(R.drawable.color4);
                if (cont==4  )
                    iv1.setImageResource(R.drawable.color5);
                if (cont==5  )
                    iv1.setImageResource(R.drawable.color6);
                if (cont==6  )
                    iv1.setImageResource(R.drawable.color7);
                if (cont==7  )
                    iv1.setImageResource(R.drawable.color8);
                if (cont==8  )
                    iv1.setImageResource(R.drawable.color9);
                if (cont==9  )
                    iv1.setImageResource(R.drawable.color10);
                if (cont==10  )
                    iv1.setImageResource(R.drawable.color11);
                if (cont==11  )
                    iv1.setImageResource(R.drawable.color12);
                if (cont==12  )
                    iv1.setImageResource(R.drawable.color13);
                if (cont==13  )
                    iv1.setImageResource(R.drawable.color14);
                if (cont==14  )
                    iv1.setImageResource(R.drawable.color15);
                if (cont==15  )
                    iv1.setImageResource(R.drawable.color16);
                if (cont==16  )
                    iv1.setImageResource(R.drawable.color17);
                if (cont==17  )
                    iv1.setImageResource(R.drawable.color18);
                if (cont==18  )
                    iv1.setImageResource(R.drawable.color19);
                if (cont==19  )
                    iv1.setImageResource(R.drawable.color20);

                if (cont<=19)
                cont++;
                System.out.print(cont);
            }
        });
        bb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                if (cont==1 || cont==2 )
                    iv1.setImageResource(R.drawable.color1);
                if (cont==3 )
                    iv1.setImageResource(R.drawable.color2);
                if (cont==4 )
                    iv1.setImageResource(R.drawable.color3);
                if (cont==5 )
                    iv1.setImageResource(R.drawable.color4);
                if (cont==6 )
                    iv1.setImageResource(R.drawable.color5);
                if (cont==7 )
                    iv1.setImageResource(R.drawable.color6);
                if (cont==8 )
                    iv1.setImageResource(R.drawable.color7);
                if (cont==9 )
                    iv1.setImageResource(R.drawable.color8);
                if (cont==10 )
                    iv1.setImageResource(R.drawable.color9);
                if (cont==11 )
                    iv1.setImageResource(R.drawable.color10);
                if (cont==12 )
                    iv1.setImageResource(R.drawable.color11);
                if (cont==13 )
                    iv1.setImageResource(R.drawable.color12);
                if (cont==14 )
                    iv1.setImageResource(R.drawable.color13);
                if (cont==15 )
                    iv1.setImageResource(R.drawable.color14);
                if (cont==16 )
                    iv1.setImageResource(R.drawable.color15);
                if (cont==17 )
                    iv1.setImageResource(R.drawable.color16);
                if (cont==18 )
                    iv1.setImageResource(R.drawable.color17);
                if (cont==19 )
                    iv1.setImageResource(R.drawable.color18);
                if (cont==20 )
                    iv1.setImageResource(R.drawable.color19);
                if (cont>=2)
                cont --;
                System.out.print(cont);
            }
        });

            final MediaPlayer audio = MediaPlayer.create(this, R.raw.sonido1);
            Button btnaudio = (Button) this.findViewById(R.id.btn_audio);
            if (cont==1)
            {


            }
            btnaudio.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    audio.start();

                }

            });
            System.out.print(cont);



    }







}
