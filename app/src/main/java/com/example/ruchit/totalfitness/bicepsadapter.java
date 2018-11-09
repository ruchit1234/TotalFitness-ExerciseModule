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


public class bicepsadapter extends RecyclerView.Adapter<bicepsadapter.exViewHolder> {

    List<biceps.Ex> exList;
    Context mContext;



    bicepsadapter(List exList,Context context) {
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
    public bicepsadapter.exViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View viewthigh= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_biceps,parent,false);
        bicepsadapter.exViewHolder evh=new bicepsadapter.exViewHolder(viewthigh);
        return evh;


    }

    @Override
    public void onBindViewHolder(final bicepsadapter.exViewHolder holder, final int position){
        holder.exname.setText(exList.get(position).name);
        holder.exlogo.setImageResource(exList.get(position).logoId);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.barcurl);
                    i1.putExtra("text", R.string.barcurl);
                    mContext.startActivity(i1);


                }
                if (position == 1) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.dumhammercurk);
                    i1.putExtra("text", R.string.altdumhammercurl);
                    mContext.startActivity(i1);


                }
                if (position == 2) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.inclinedumcurl);
                    i1.putExtra("text", R.string.duminccrl);
                    mContext.startActivity(i1);

                }
                if (position == 3) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.preacherbarcurl);
                    i1.putExtra("text", R.string.barprchcrl);
                    mContext.startActivity(i1);

                }
                if (position == 4) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.concentrationcurl);
                    i1.putExtra("text", R.string.dmconcrl);
                    mContext.startActivity(i1);
                }
                if (position == 5) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.revdmcrl);
                    i1.putExtra("text", R.string.revdumcrl);
                    mContext.startActivity(i1);
                }
                if (position == 6) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.stdmcrl);
                    i1.putExtra("text", R.string.stdmcrl);
                    mContext.startActivity(i1);
                }
                if (position == 7) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.cablebicepscurl);
                    i1.putExtra("text", R.string.cbbiccrl);
                    mContext.startActivity(i1);
                }
                if (position == 8) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.cablebicepscurl);
                    i1.putExtra("text", R.string.lowpullcurl);
                    mContext.startActivity(i1);
                }
                if (position == 9) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.barcurl);
                    i1.putExtra("text", R.string.ezbarcrl);
                    mContext.startActivity(i1);
                }
                if (position == 10) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.preacherbarcurl);
                    i1.putExtra("text", R.string.clsgripprchcrl);
                    mContext.startActivity(i1);
                }
                if (position == 11) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.bicepsmaccrl);
                    i1.putExtra("text", R.string.bicmaccrl);
                    mContext.startActivity(i1);
                }
                if (position == 12) {
                    Intent i1 = new Intent(mContext, exdetails.class);
                    i1.putExtra("img", R.raw.bicepsmaccrl);
                    i1.putExtra("text", R.string.bicprmaccrl);
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