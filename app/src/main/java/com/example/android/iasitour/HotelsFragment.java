package com.example.android.iasitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create ArrayList
        ArrayList<Place> places = new ArrayList<Place>();

        //Insert Places in the ArrayList
        places.add(new Place(getString(R.string.primo_n), getString(R.string.primo_a), getString(R.string.primo_d), R.drawable.primo, getString(R.string.primo_w), getString(R.string.primo_l)));
        places.add(new Place(getString(R.string.dorobanti_n), getString(R.string.dorobanti_a), getString(R.string.primo_d), R.drawable.dorobanti, getString(R.string.dorobanti_w), getString(R.string.dorobanti_l)));
        places.add(new Place(getString(R.string.moldova_n), getString(R.string.moldova_a), getString(R.string.primo_d), R.drawable.moldova, getString(R.string.moldova_w), getString(R.string.moldova_l)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}