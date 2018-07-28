package com.example.android.iasitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ServicesFragment extends Fragment {

    public ServicesFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create ArrayList
        ArrayList<Place> places = new ArrayList<Place>();

        //Insert Places in the ArrayList
        places.add(new Place(getString(R.string.RATP_n), getString(R.string.RATP_a), getString(R.string.primo_d), R.drawable.ratp, getString(R.string.RATP_w), getString(R.string.RATP_l)));
        places.add(new Place(getString(R.string.center_n), getString(R.string.center_a), getString(R.string.primo_d), R.drawable.center, getString(R.string.center_w), getString(R.string.center_l)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}