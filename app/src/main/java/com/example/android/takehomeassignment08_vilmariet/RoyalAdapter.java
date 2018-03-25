package com.example.android.takehomeassignment08_vilmariet;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;



class RoyalAdapter extends RecyclerView.Adapter<RoyalViewHolder> {

    private List<Royals> royals;
    private Context context;

    public RoyalAdapter(List<Royals> royals, Context context) {
        this.royals = royals;
        this.context = context;
    }

    @Override
    public RoyalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_royals, parent, false);
        return new RoyalViewHolder(view, context);

    }

    @Override
    public void onBindViewHolder(RoyalViewHolder holder, int position) {
        Royals royal = royals.get(position);
        holder.royalName.setText(royal.name);
        holder.royalBlurb.setText(royal.professionalBlurb);
        holder.royalPic.setImageResource(royal.pictureId);
        holder.isAccepted = royal.isAcceptedByPeople;

        if(position%2 == 0){
            holder.itemView.setBackgroundColor(Color.parseColor("#dbe0d9"));
        } else{
            holder.itemView.setBackgroundColor(Color.parseColor("#f1e1df"));
        }
    }

    @Override
    public int getItemCount() {
        return royals.size();
    }
}
