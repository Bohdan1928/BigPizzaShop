package com.example.bigpizzashop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerItem> itemArrayList = new ArrayList<>();

        itemArrayList.add(new RecyclerItem(R.drawable.la_pyets,
                Util.NAME_OF_PIZZA1, Util.DESCRIPTION_OF_PIZZA1, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.tsezario, Util.NAME_OF_PIZZA2,
                Util.DESCRIPTION_OF_PIZZA2, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.kvatro, Util.NAME_OF_PIZZA3,
                Util.DESCRIPTION_OF_PIZZA3, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.capricciosa, Util.NAME_OF_PIZZA4,
                Util.DESCRIPTION_OF_PIZZA4, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.peperoni, Util.NAME_OF_PIZZA5,
                Util.DESCRIPTION_OF_PIZZA5, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.carbonara, Util.NAME_OF_PIZZA6,
                Util.DESCRIPTION_OF_PIZZA6, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.panchetta, Util.NAME_OF_PIZZA7,
                Util.DESCRIPTION_OF_PIZZA7, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.salyami, Util.NAME_OF_PIZZA8,
                Util.DESCRIPTION_OF_PIZZA8, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.diabola, Util.NAME_OF_PIZZA9,
                Util.DESCRIPTION_OF_PIZZA9, 187));
        itemArrayList.add(new RecyclerItem(R.drawable.parma_3, Util.NAME_OF_PIZZA10,
                Util.DESCRIPTION_OF_PIZZA10, 187));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
