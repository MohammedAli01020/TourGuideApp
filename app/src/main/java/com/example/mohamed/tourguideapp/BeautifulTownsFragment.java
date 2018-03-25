package com.example.mohamed.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mohamed.tourguideapp.data.DataModel;
import com.example.mohamed.tourguideapp.data.DataModelAdapter;

import java.util.ArrayList;


public class BeautifulTownsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_generic, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list_generic);
        ArrayList<DataModel> dataModels = new ArrayList<>();

        dataModels.add(new DataModel(getString(R.string.beautiful_towns_title_1), R.drawable.beautiful_towns_1,
                getString(R.string.beautiful_towns_description_1)));
        dataModels.add(new DataModel(getString(R.string.beautiful_towns_title_2), R.drawable.beautiful_towns_2,
                getString(R.string.beautiful_towns_description_2)));
        dataModels.add(new DataModel(getString(R.string.beautiful_towns_title_3), R.drawable.beautiful_towns_3,
                getString(R.string.beautiful_towns_description_3)));
        dataModels.add(new DataModel(getString(R.string.beautiful_towns_title_4), R.drawable.beautiful_towns_4,
                getString(R.string.beautiful_towns_description_4)));
        dataModels.add(new DataModel(getString(R.string.beautiful_towns_title_5), R.drawable.beautiful_towns_5,
                getString(R.string.beautiful_towns_description_5)));

        DataModelAdapter adapter = new DataModelAdapter(getContext(), 0, dataModels);
        listView.setAdapter(adapter);
        return rootView;
    }
}
