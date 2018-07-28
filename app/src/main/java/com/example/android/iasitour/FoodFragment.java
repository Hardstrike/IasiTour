package com.example.android.iasitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.iasitour.Place;
import com.example.android.iasitour.PlaceAdapter;
import com.example.android.iasitour.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create ArrayList
        ArrayList<Place> places = new ArrayList<Place>();

        //Insert Places in the ArrayList
        places.add(new Place(getString(R.string.foodcourt_n), getString(R.string.foodcourt_a), getString(R.string.foodcourt_d), R.drawable.foodcourt, getString(R.string.foodcourt_w), getString(R.string.foodcourt_l)));
        places.add(new Place(getString(R.string.bistro_n), getString(R.string.bistro_a), getString(R.string.bistro_d), R.drawable.bistro, getString(R.string.bistro_w), getString(R.string.bistro_l)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}