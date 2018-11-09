package com.example.ruchit.totalfitness;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class biceps
        extends AppCompatActivity
{
    Context context;
    private List<Ex> exlist;
    RecyclerView recyclerView;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
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
        exlist.add(new Ex("Barbell Curl", R.drawable.barbellcurlwelcome));
        exlist.add(new Ex("Alternate Dumbell Hammer Curl", R.drawable.alternatehammer));
        exlist.add(new Ex("Dumbell Incline Curl", R.raw.duminccurl));
        exlist.add(new Ex("Barbell Preacher Curl", R.drawable.brprcrl));
        exlist.add(new Ex("Dumbell Concentration curl", R.drawable.dmconcrl));
        exlist.add(new Ex("Reverse Dumbell Curl", R.drawable.revdmcrl));
        exlist.add(new Ex("Seated Dumbell Curl", R.drawable.stdmcrl));
        exlist.add(new Ex("Cable Biceps Curl", R.drawable.cbcrl));
        exlist.add(new Ex("Low Pulley Curl", R.drawable.lwplcrl));
        exlist.add(new Ex("E-Z Bar Curl", R.drawable.ezbarcrl));
        exlist.add(new Ex("Barbell Close Grip Preacher Curl", R.drawable.clsgripprcrl));
        exlist.add(new Ex("Biceps Machine Curl", R.drawable.bicepsmachine));
        exlist.add(new Ex("Biceps Preacher Machine Curl", R.drawable.brprcrl));
    }

    public void initializeAdapter()
    {
        bicepsadapter bicepsadapter = new bicepsadapter(exlist,biceps.this);
        recyclerView.setAdapter(bicepsadapter);
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