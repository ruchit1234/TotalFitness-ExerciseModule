package com.example.ruchit.totalfitness;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class absadapter extends RecyclerView.Adapter<absadapter.exViewHolder> {

    List<abs.Ex> exList;
     Context mContext;



    absadapter(List exList,Context context) {
        this.exList= exList;
        this.mContext = context;

    }
    public static class exViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView exname;
        ImageView exlogo;


        exViewHolder(View itemView){
            super(itemView);
            cardView= itemView.findViewById(R.id.cardvw);
            exname= itemView.findViewById(R.id.ex_name);
            exlogo=itemView.findViewById(R.id.exlogo);


        }


    }
    @Override
    public absadapter.exViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View viewthigh= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_abslayout,parent,false);
        absadapter.exViewHolder evh=new absadapter.exViewHolder(viewthigh);
        return evh;


    }

    @Override
    public void onBindViewHolder(final absadapter.exViewHolder holder, final int position){
        holder.exname.setText(exList.get(position).name);
        holder.exlogo.setImageResource(exList.get(position).logoId);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.crunches);
                    i1.putExtra("text", R.string.crunches);
                    mContext.startActivity(i1);


                }
                if (position == 1) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.declinecrunch);
                    i1.putExtra("text", R.string.declinecrunch);
                    mContext.startActivity(i1);


                }
                if (position == 2) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.dumsidebend);
                    i1.putExtra("text", R.string.dumsidebend);
                    mContext.startActivity(i1);

                }
                if (position == 3) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.hanginglegraise);
                    i1.putExtra("text", R.string.hanglegraise);
                    mContext.startActivity(i1);

                }
                if (position == 4) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.lyinglegraise);
                    i1.putExtra("text", R.string.inclegraise);
                    mContext.startActivity(i1);
                }
                if (position == 5) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.drawable.kneelcabgif);
                    i1.putExtra("text", R.string.kneelcable);
                    mContext.startActivity(i1);
                }
                if (position == 6) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.lyinglegraise);
                    i1.putExtra("text", R.string.legraise);
                    mContext.startActivity(i1);
                }
                if (position == 7) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.flatbenchlegraise);
                    i1.putExtra("text", R.string.legraise);
                    mContext.startActivity(i1);
                }
                if (position == 8) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.jacknife);
                    i1.putExtra("text", R.string.jackknife);
                    mContext.startActivity(i1);
                }
                if (position == 9) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.hipraise);
                    i1.putExtra("text", R.string.twisthip);
                    mContext.startActivity(i1);
                }
                if (position == 10) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.weightcrunch);
                    i1.putExtra("text", R.string.weightcrunch);
                    mContext.startActivity(i1);
                }
                if (position == 11) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.plank);
                    i1.putExtra("text", R.string.plank);
                    mContext.startActivity(i1);
                }
                if (position == 12) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.sideplank);
                    i1.putExtra("text", R.string.sideplank);
                    mContext.startActivity(i1);
                }
                if (position == 13) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.superman);
                    i1.putExtra("text", R.string.superman);
                    mContext.startActivity(i1);
                }
                if (position == 14) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.twistcrunch);
                    i1.putExtra("text", R.string.twistcrunch);
                    mContext.startActivity(i1);
                }
            }
            });


    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }
    @Override
    public int getItemCount() {
        return  exList.size();
    }

}