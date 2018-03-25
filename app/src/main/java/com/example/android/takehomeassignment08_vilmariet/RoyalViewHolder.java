package com.example.android.takehomeassignment08_vilmariet;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RoyalViewHolder extends RecyclerView.ViewHolder{

    public CardView cardView;
    public TextView royalName;
    public TextView royalBlurb;
    public ImageView royalPic;
    public boolean isAccepted;


    public RoyalViewHolder(View itemView, final Context context) {
        super(itemView);

        cardView = (CardView) itemView.findViewById(R.id.card_view);
        royalName = (TextView) itemView.findViewById(R.id.royal_name);
        royalBlurb = (TextView) itemView.findViewById(R.id.royal_blurb);
        royalPic = (ImageView) itemView.findViewById(R.id.royal_pic);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int messageResId = 0;

                if(isAccepted){
                    messageResId = R.string.accepted_toast;
                } else {
                    messageResId = R.string.not_accepted_toast;
                }
                Toast.makeText(context, messageResId, Toast.LENGTH_SHORT).show();
            }


        });
    }
}
