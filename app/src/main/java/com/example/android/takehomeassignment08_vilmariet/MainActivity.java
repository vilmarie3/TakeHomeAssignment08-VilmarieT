package com.example.android.takehomeassignment08_vilmariet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List <Royals> royals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RoyalAdapter (royals, this));
    }

    private void initialData(){
        royals = new ArrayList<>();
        royals.add(new Royals(R.string.queen_elizabeth, R.string.blurb_queen_elizabeth, R.drawable.queenelizabeth, true));
        royals.add(new Royals(R.string.prince_philip, R.string.blurb_prince_philip, R.drawable.princephilip, true));
        royals.add(new Royals(R.string.prince_charles, R.string.blurb_prince_charles, R.drawable.princecharles, false));
        royals.add(new Royals(R.string.prince_william, R.string.blurb_prince_william, R.drawable.princewilliam, true));
        royals.add(new Royals(R.string.duchess_catherine, R.string.blurb_duchess_catherine, R.drawable.katemiddleton, true));
        royals.add(new Royals(R.string.prince_harry, R.string.blurb_prince_harry, R.drawable.princeharry, true));
        royals.add(new Royals(R.string.fergie, R.string.blurb_fergie, R.drawable.fergie, false));

    }
}
