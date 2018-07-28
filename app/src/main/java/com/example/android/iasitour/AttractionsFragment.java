package com.example.android.iasitour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create ArrayList
        ArrayList<Place> places = new ArrayList<Place>();

        //Insert Places in the ArrayList
      places.add(new Place(getString(R.string.copou_n), getString(R.string.copou_a), getString(R.string.copou_d), R.drawable.copoupark, getString(R.string.copou_w), getString(R.string.copou_l)));
      places.add(new Place(getString(R.string.palas_n), getString(R.string.palas_a), getString(R.string.palas_d), R.drawable.main, getString(R.string.palas_w), getString(R.string.palas_l)));
      places.add(new Place(getString(R.string.botanic_n), getString(R.string.botanic_a), getString(R.string.botanic_d), R.drawable.botanical, getString(R.string.botanical_w), getString(R.string.botanic_l)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}