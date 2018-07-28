package com.example.android.iasitour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlaceInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);

        Bundle b = getIntent().getExtras();
        String placeName = b.getString(getString(R.string.name_var));
        String placeAddress = b.getString(getString(R.string.address_var));
        String placeDescription = b.getString(getString(R.string.desc_var));
        int placeImage = b.getInt(getString(R.string.img_var));
        final String placeSite = b.getString(getString(R.string.site_var));
        final String placeLocation = b.getString(getString(R.string.loc_var));

        this.setTitle(placeName);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView = (ImageView) findViewById(R.id.detailed_image);
        imageView.setImageResource(placeImage);

        TextView nameTextView = (TextView) findViewById(R.id.detailed_name);
        nameTextView.setText(placeName);

        TextView addressTextView = (TextView) findViewById(R.id.detailed_address);
        addressTextView.setText(placeAddress);

        TextView descriptionTextView = (TextView) findViewById(R.id.detailed_desc);
        descriptionTextView.setText(placeDescription);

        LinearLayout linkView = (LinearLayout) findViewById(R.id.link_webpage);
        linkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri webpage = Uri.parse(placeSite);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

        LinearLayout mapView = (LinearLayout) findViewById(R.id.link_map);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri geoLocation = Uri.parse("geo:" + placeLocation + "?z=16");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
        // Source where I learned how to use Google Maps Intents: https://developers.google.com/maps/documentation/urls/android-intents
        // Descriptions were taken from wikipedia
        // Images from google image search
    }
}