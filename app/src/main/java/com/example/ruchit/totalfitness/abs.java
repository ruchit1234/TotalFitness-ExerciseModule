package com.example.ruchit.totalfitness;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class abs
        extends AppCompatActivity
{
    Context context;
    private List<Ex> exlist;
    RecyclerView recyclerView;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
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
        exlist.add(new Ex("Crunches", R.drawable.crunches));
        exlist.add(new Ex("Decline Crunch", R.drawable.declinecrunch));
        exlist.add(new Ex("Dumbell Side Bends", R.drawable.dumbbellsidebend));
        exlist.add(new Ex("Hanging Leg Raises", R.drawable.hanginglegraises));
        exlist.add(new Ex("Incline Leg Raises", R.drawable.inclinelegraises));
        exlist.add(new Ex("Kneeling Cable Crunch", R.drawable.cablecrunch));
        exlist.add(new Ex("Legs Raises", R.drawable.legraises));
        exlist.add(new Ex("Flat Bench Lying Leg Raises", R.drawable.legraises));
        exlist.add(new Ex("Seated Jack Knife", R.drawable.seatedjackknife));
        exlist.add(new Ex("Twisting Hip Raise", R.drawable.twisthip));
        exlist.add(new Ex("Weighted Crunch", R.drawable.weightedcrunch));
        exlist.add(new Ex("Plank", R.drawable.plank));
        exlist.add(new Ex("Side Plank", R.drawable.sideplank));
        exlist.add(new Ex("Superman", R.drawable.superman));
        exlist.add(new Ex("Twist Crunch", R.drawable.twistcrunch));
    }

    public void initializeAdapter()
    {
        absadapter localabsadapter = new absadapter(exlist,abs.this);
        recyclerView.setAdapter(localabsadapter);
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