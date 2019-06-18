package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(getString(R.string.momos), getString(R.string.food_description), R.drawable.momo));
        infos.add(new Info(getString(R.string.thukpa), getString(R.string.food_description), R.drawable.thukpa));
        infos.add(new Info(getString(R.string.alu_dam), getString(R.string.food_description), R.drawable.aludam));
        infos.add(new Info(getString(R.string.nepali_thali), getString(R.string.food_description), R.drawable.nepali_thali));
        infos.add(new Info(getString(R.string.dalle), getString(R.string.food_description), R.drawable.dalle_pickels));
        infos.add(new Info(getString(R.string.kakra_ko_achar), getString(R.string.food_description), R.drawable.kenema));
        infos.add(new Info(getString(R.string.naga_cuisine), getString(R.string.food_description), R.drawable.naga_cuisine));
        infos.add(new Info(getString(R.string.naga_platter), getString(R.string.food_description), R.drawable.naga_platter));
        // Create an {@link InfoAdapter}, whose source is a list of items
        // adapter knows how to create list items for each item in the list

        InfoAddapter adapter = new InfoAddapter(this, infos, R.color.foods);

        //Find the object inthe view hiearchy of the {@link Activity}
        // There should be a {@link listView} with the view ID called list,
        // which is declared in the info list file

        ListView listView = (ListView) findViewById(R.id.info_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Word} in the list.

        listView.setAdapter(adapter);


    }
}
