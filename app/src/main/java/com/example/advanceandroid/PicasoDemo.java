package com.example.advanceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicasoDemo extends AppCompatActivity {

    ImageView img_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picaso_demo);

        img_two = (ImageView) findViewById(R.id.img_two);
    }



    public void openUsingPicaso(View view)
    {
        String url = "https://blog.depositphotos.com/wp-content/uploads/2017/07/Soothing-nature-backgrounds-2-1024x684.jpg";
        Picasso
                .get()
                .load(url)
                .error(R.drawable.error)
                .placeholder(R.drawable.loading)
                .into(img_two);
    }
}