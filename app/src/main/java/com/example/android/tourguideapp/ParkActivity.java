package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(getString(R.string.nightangle_park), getString(R.string.nightangle_park_description), R.drawable.shrubbery_park3));
        infos.add(new Info(getString(R.string.surya_sen_park), getString(R.string.surya_sen_description), R.drawable.suryasen_park));
        infos.add(new Info(getString(R.string.madhuban_park), getString(R.string.madhubanpark_description), R.drawable.madhuban_park));
        infos.add(new Info(getString(R.string.gangamaya_park), getString(R.string.gangamaya_description), R.drawable.gangamaya_park));
        infos.add(new Info(getString(R.string.national_park), getString(R.string.national_park_description), R.drawable.neora_valley_park));
        infos.add(new Info(getString(R.string.ROCK_GARDEN), getString(R.string.rock_garden_description), R.drawable.rock_garden));
        infos.add(new Info(getString(R.string.Botanical_garden), getString(R.string.botanical_garden_description), R.drawable.botanical_garden));
        // Create an {@link InfoAdapter}, whose source is a list of items
        // adapter knows how to create list items for each item in the list

        InfoAddapter adapter = new InfoAddapter(this, infos, R.color.parkGarden);

        //Find the object inthe view hiearchy of the {@link Activity}
        // There should be a {@link listView} with the view ID called list,
        // which is declared in the info list file

        ListView listView = (ListView) findViewById(R.id.info_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Word} in the list.

        listView.setAdapter(adapter);

    }
}
