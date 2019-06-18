package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(getString(R.string.kanchanjunga),getString(R.string.kanchanjunga_description),R.drawable.kanchanjunga));
        infos.add(new Info(getString(R.string.tinchuley_village),getString(R.string.tinchuley_description),R.drawable.teesta_meets_its_tributary));
        infos.add(new Info(getString(R.string.tea_garden),getString(R.string.te_garden_description),R.drawable.tea_garden));
        infos.add(new Info(getString(R.string.obsevatory),getString(R.string.obsevatory_description),R.drawable.obsevatory_hill));
        infos.add(new Info(getString(R.string.suntalekhola),getString(R.string.suntalekhola_description),R.drawable.suntalekhola));
        infos.add(new Info(getString(R.string.chattakpur),getString(R.string.chattakpur_description),R.drawable.chattakpur));
        infos.add(new Info(getString(R.string.bindu_dam),getString(R.string.bindudam_description),R.drawable.bindu_dam));
        infos.add(new Info(getString(R.string.st_marrys_hill),getString(R.string.ST_MARRYS_DESCRIPTION),R.drawable.st_mary_s_hill));
        infos.add(new Info(getString(R.string.SENCHAL_LAKE),getString(R.string.senchal_lake_description),R.drawable.senchal_lake));

        // Create an {@link InfoAdapter}, whose source is a list of items
        // adapter knows how to create list items for each item in the list

        InfoAddapter adapter = new InfoAddapter(this, infos, R.color.attractivePlaces);

        //Find the object inthe view hiearchy of the {@link Activity}
        // There should be a {@link listView} with the view ID called list,
        // which is declared in the info list file

        ListView listView = (ListView)findViewById(R.id.info_list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the

        // {@link ListView} will display list items for each {@link Word} in the list.

        listView.setAdapter(adapter);





    }
}
