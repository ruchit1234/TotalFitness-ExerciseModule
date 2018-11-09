package com.example.ruchit.totalfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    }
    public void abs(View view)
    {

        startActivity(new Intent(this, abs.class));
    }


    public void bicepsinfo(View view) {
        startActivity(new Intent(this, biceps.class));
    }

    public void tricepsinfo(View view) {
        startActivity(new Intent(this, triceps.class));
    }

}
