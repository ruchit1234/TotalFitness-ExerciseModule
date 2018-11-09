package com.example.ruchit.totalfitness;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class triceps
        extends AppCompatActivity
{
    Context context;
    private List<Ex> exlist;
    RecyclerView recyclerView;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);
        recyclerView = findViewById(R.id.recvw);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(localLinearLayoutManager);
        initializeData();
        initializeAdapter();
    }
    private void initializeData()
    {
        exlist = new ArrayList();
        exlist.add(new Ex("Cable Kickbacks", R.drawable.cablekickbacks));
        exlist.add(new Ex("Close Grip Push Ups", R.drawable.clsgrippushups));
        exlist.add(new Ex("Rope Push-Downs", R.drawable.ropepushdown));
        exlist.add(new Ex("Reverse Single Cable Push Down", R.drawable.revcbpushdwn));
        exlist.add(new Ex("Seated Over-Head Rope Extension", R.drawable.seatedoverheadropeext));
        exlist.add(new Ex("V-Bar Push Down", R.drawable.vbarpush));
        exlist.add(new Ex("Seated Over-Head Dumbell Extension", R.drawable.stovdumext));
        exlist.add(new Ex("Weighted Bench Dips", R.drawable.weightbnchdip));
        exlist.add(new Ex("Close Grip Bench Press", R.drawable.clsgripbnchprs));
        exlist.add(new Ex("Lying Barbell Triceps Extension", R.drawable.lyinbartriext));
        exlist.add(new Ex("Triceps Kickback", R.drawable.trikickback));
        exlist.add(new Ex("One Arm Dumbell Triceps Extension", R.drawable.onearmdumtriext));
        exlist.add(new Ex("Diamond Push-Ups", R.drawable.diamondpushups));
    }

    public void initializeAdapter()
    {
        tricepsadapter tricepsadapter = new tricepsadapter(exlist,triceps.this);
        recyclerView.setAdapter(tricepsadapter);
    }

    class Ex {
        String name;
        int logoId;

        Ex(String name, int logoId) {
            this.name = name;
            this.logoId = logoId;
        }
    }

}