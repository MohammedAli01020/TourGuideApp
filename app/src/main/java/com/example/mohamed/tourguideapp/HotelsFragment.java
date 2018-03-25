package com.example.mohamed.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mohamed.tourguideapp.data.DataModel;
import com.example.mohamed.tourguideapp.data.DataModelAdapter;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_generic, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_generic);
        ArrayList<DataModel> dataModels = new ArrayList<>();

        dataModels.add(new DataModel(getString(R.string.hotels_title_1), R.drawable.hotels_1,
                getString(R.string.hotels_description_1)));
        dataModels.add(new DataModel(getString(R.string.hotels_title_2), R.drawable.hotels_2,
                getString(R.string.hotels_description_2)));
        dataModels.add(new DataModel(getString(R.string.hotels_title_3), R.drawable.hotels_3,
                getString(R.string.hotels_description_3)));
        dataModels.add(new DataModel(getString(R.string.hotels_title_4), R.drawable.hotels_4,
                getString(R.string.hotels_description_4)));

        DataModelAdapter adapter = new DataModelAdapter(getContext(), 0, dataModels);
        listView.setAdapter(adapter);
        return rootView;
    }
}
