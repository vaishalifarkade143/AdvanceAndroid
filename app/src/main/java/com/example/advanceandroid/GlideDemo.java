package com.example.advanceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.GenericTransitionOptions;
import com.bumptech.glide.Glide;

public class GlideDemo extends AppCompatActivity {

    ImageView img_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_demo);

        img_one = (ImageView) findViewById(R.id.img_one);

    }
    public  void  openUsingGlide(View view)
    {
        String url =  "https://m.media-amazon.com/images/I/51A5zw8t14L._UY550_.jpg";

        //Glide.with(this).load(url).into(img_one);

        Glide.with(this)
                .load(url)
                .error(R.drawable.error)//if url wrong then it shows the error
                .transition(GenericTransitionOptions.with(android.R.anim.slide_in_left))
                .placeholder(R.drawable.loading )
                .into(img_one);


    }
}