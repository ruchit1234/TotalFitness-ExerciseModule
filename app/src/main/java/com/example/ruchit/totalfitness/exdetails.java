package com.example.ruchit.totalfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class exdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exdetails);
        GifImageView localGifImageView = (GifImageView)findViewById(R.id.gifview);
        Intent localIntent = getIntent();
        TextView localTextView = (TextView)findViewById(R.id.exdesc);
        localTextView.setMovementMethod(new ScrollingMovementMethod());
        localGifImageView.setBackgroundResource(localIntent.getIntExtra("img", 0));
        localTextView.setText(localIntent.getIntExtra("text", 0));
    }
}
