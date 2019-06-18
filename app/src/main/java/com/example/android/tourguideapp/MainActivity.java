package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the Text View Attractive Places
        TextView attractivePlaces = (TextView) findViewById(R.id.attractive_places);
        // Set a on click listner to that text view
        attractivePlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesIntent = new Intent(MainActivity.this, PlaceActivity.class);
                startActivity(placesIntent);
            }
        });
        // Find the Text View Park and Garden
        TextView parkTextView = (TextView) findViewById(R.id.parks_gardens);
        // Set a on click listner to that text view
        parkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parkIntent = new Intent(MainActivity.this, ParkActivity.class);
                startActivity(parkIntent);
            }
        });
        // Find the Text View Resturants and Hotels
        TextView hotelTextView = (TextView) findViewById(R.id.hotels_resturant);
        // Set a on click listner to that text view
        hotelTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(hotelIntent);
            }
        });
        // Find the Text View Foods
        TextView foodTextView = (TextView) findViewById(R.id.foods);
        // Set a on click listner to that text view
        foodTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });
    }
}
