package com.example.gspl.imageslide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    int[] images={

            R.mipmap.im,
            R.mipmap.pr,
            R.mipmap.lake,
            R.mipmap.nature,
            R.mipmap.bl,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper=findViewById(R.id.views);
        for (int i=0;i<images.length;i++){
            flip_image(images[i]);
        }

    }

    public void flip_image(int i){

        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(i);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
