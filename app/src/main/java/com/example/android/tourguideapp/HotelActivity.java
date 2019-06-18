package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(getString(R.string.sonams_kitchen), getString(R.string.sonams_description), R.drawable.sonam_kitchen));
        infos.add(new Info(getString(R.string.gattys_caffe), getString(R.string.gattys_caffe_descripton), R.drawable.gatty_cafe));
        infos.add(new Info(getString(R.string.kunga_resturant), getString(R.string.kunga_description), R.drawable.kunga_restaurant));
        infos.add(new Info(getString(R.string.nathmull_tea), getString(R.string.nathmull_decription), R.drawable.nathmull_tea));
        infos.add(new Info(getString(R.string.glenarys), getString(R.string.glenarys_description), R.drawable.glenary));
        infos.add(new Info(getString(R.string.tom_jerry), getString(R.string.tom_jerry_description), R.drawable.tomjerry));
        infos.add(new Info(getString(R.string.keventers), getString(R.string.hotel_description), R.drawable.keventers));
        infos.add(new Info(getString(R.string.park_restaurant), getString(R.string.hotel_description), R.drawable.the_park_resturant));
        infos.add(new Info(getString(R.string.hotel_lunar), getString(R.string.hotel_description), R.drawable.hotel_lunar));
        infos.add(new Info(getString(R.string.java_cafe), getString(R.string.hotel_description), R.drawable.himalayan_java));
        infos.add(new Info(getString(R.string.joys_pub), getString(R.string.hotel_description), R.drawable.joys_pub));
        // Create an {@link InfoAdapter}, whose source is a list of items
        // adapter knows how to create list items for each item in the list

        InfoAddapter adapter = new InfoAddapter(this, infos, R.color.hotel);

        //Find the object inthe view hiearchy of the {@link Activity}
        // There should be a {@link listView} with the view ID called list,
        // which is declared in the info list file

        ListView listView = (ListView) findViewById(R.id.info_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Word} in the list.

        listView.setAdapter(adapter);


    }
}
