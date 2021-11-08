package com.example.bigpizzashop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<RecyclerItem> itemArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(initializeArrayList(), this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    public ArrayList<RecyclerItem> initializeArrayList() {

        itemArrayList.add(new RecyclerItem(R.drawable.la_pyets, Util.NAME_OF_PIZZA1,
                Util.DESCRIPTION_OF_PIZZA1, 187, Util.PROTEINS_OF_PIZZA1, Util.CARBOHYDRATES_OF_PIZZA1,
                Util.FATS_OF_PIZZA1, Util.CALORIC_CONTENT_OF_PIZZA1));
        itemArrayList.add(new RecyclerItem(R.drawable.tsezario, Util.NAME_OF_PIZZA2,
                Util.DESCRIPTION_OF_PIZZA2, 212, Util.PROTEINS_OF_PIZZA2, Util.CARBOHYDRATES_OF_PIZZA2,
                Util.FATS_OF_PIZZA2, Util.CALORIC_CONTENT_OF_PIZZA2));
        itemArrayList.add(new RecyclerItem(R.drawable.kvatro, Util.NAME_OF_PIZZA3,
                Util.DESCRIPTION_OF_PIZZA3, 202, Util.PROTEINS_OF_PIZZA3, Util.CARBOHYDRATES_OF_PIZZA3,
                Util.FATS_OF_PIZZA3, Util.CALORIC_CONTENT_OF_PIZZA3));
        itemArrayList.add(new RecyclerItem(R.drawable.capricciosa, Util.NAME_OF_PIZZA4,
                Util.DESCRIPTION_OF_PIZZA4, 171, Util.PROTEINS_OF_PIZZA4, Util.CARBOHYDRATES_OF_PIZZA4,
                Util.FATS_OF_PIZZA4, Util.CALORIC_CONTENT_OF_PIZZA4));
        itemArrayList.add(new RecyclerItem(R.drawable.peperoni, Util.NAME_OF_PIZZA5,
                Util.DESCRIPTION_OF_PIZZA5, 170, Util.PROTEINS_OF_PIZZA6, Util.CARBOHYDRATES_OF_PIZZA6,
                Util.FATS_OF_PIZZA6, Util.CALORIC_CONTENT_OF_PIZZA6));
        itemArrayList.add(new RecyclerItem(R.drawable.carbonara, Util.NAME_OF_PIZZA6,
                Util.DESCRIPTION_OF_PIZZA6, 172, Util.PROTEINS_OF_PIZZA6, Util.CARBOHYDRATES_OF_PIZZA6,
                Util.FATS_OF_PIZZA6, Util.CALORIC_CONTENT_OF_PIZZA6));
        itemArrayList.add(new RecyclerItem(R.drawable.panchetta, Util.NAME_OF_PIZZA7,
                Util.DESCRIPTION_OF_PIZZA7, 163, Util.PROTEINS_OF_PIZZA7, Util.CARBOHYDRATES_OF_PIZZA7,
                Util.FATS_OF_PIZZA7, Util.CALORIC_CONTENT_OF_PIZZA7));
        itemArrayList.add(new RecyclerItem(R.drawable.salyami, Util.NAME_OF_PIZZA8,
                Util.DESCRIPTION_OF_PIZZA8, 161, Util.PROTEINS_OF_PIZZA8, Util.CARBOHYDRATES_OF_PIZZA8,
                Util.FATS_OF_PIZZA8, Util.CALORIC_CONTENT_OF_PIZZA8));
        itemArrayList.add(new RecyclerItem(R.drawable.diabola, Util.NAME_OF_PIZZA9,
                Util.DESCRIPTION_OF_PIZZA9, 157, Util.PROTEINS_OF_PIZZA9, Util.CARBOHYDRATES_OF_PIZZA9,
                Util.FATS_OF_PIZZA9, Util.CALORIC_CONTENT_OF_PIZZA9));
        itemArrayList.add(new RecyclerItem(R.drawable.parma_3, Util.NAME_OF_PIZZA10,
                Util.DESCRIPTION_OF_PIZZA10, 196, Util.PROTEINS_OF_PIZZA10, Util.CARBOHYDRATES_OF_PIZZA10,
                Util.FATS_OF_PIZZA10, Util.CALORIC_CONTENT_OF_PIZZA10));

        return itemArrayList;
    }
}
