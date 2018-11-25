package com.example.root.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GallaryFragment extends Fragment {

    public GallaryFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // set rootView
        View rootView = inflater.inflate(R.layout.fragment_gallary, container, false);

        // get reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        // set layoutManager
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));

        // input data for recycler view
        List<Image> images = new ArrayList<>();
        for (int i=0;i<9;i++) {
            images.add(new Image(R.drawable.a));
        }

        // adaptor
        ImageAdapter adapter = new ImageAdapter(images);

        // set adaptor
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
