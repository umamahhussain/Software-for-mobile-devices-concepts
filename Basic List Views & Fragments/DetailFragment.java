package com.example.listviewandfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailFragment extends Fragment {

    TextView tv;
    ArrayList <String> nameDetails = new ArrayList<>();


    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        tv = view.findViewById(R.id.tv);
        return view;
    }

    public void updateText(int index) {
        if (tv != null) {
            tv.setText(nameDetails.get(index)); // Set text based on clicked position
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nameDetails.add("Ali Details");
        nameDetails.add("Umamah Details");
        nameDetails.add("Mama Details");
        nameDetails.add("Papa Details");
        nameDetails.add("Bhaiyya Details");
    }
}