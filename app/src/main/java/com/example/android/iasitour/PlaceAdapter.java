package com.example.android.iasitour;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private Context context = getContext();

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        String name = currentPlace.getName();
        String address = currentPlace.getAddress();
        String description = currentPlace.getDescription();
        int imageID = currentPlace.getImageResourceID();
        String siteURL = currentPlace.getSiteURL();
        String location = currentPlace.getLocation();

        final ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        itemImageView.setImageResource(imageID);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        nameTextView.setText(name);

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.list_item_address);
        addressTextView.setText(address);

        final Intent itemIntent = new Intent(context, PlaceInfo.class);

        itemIntent.putExtra(context.getString(R.string.name_var), name);
        itemIntent.putExtra(context.getString(R.string.address_var), address);
        itemIntent.putExtra(context.getString(R.string.desc_var), description);
        itemIntent.putExtra(context.getString(R.string.img_var), imageID);
        itemIntent.putExtra(context.getString(R.string.site_var), siteURL);
        itemIntent.putExtra(context.getString(R.string.loc_var), location);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }
}