package com.example.myhadarna.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myhadarna.R;


public class shewLernenRvFragmen extends Fragment {




    public shewLernenRvFragmen() {

    }


    public static shewLernenRvFragmen newInstance() {
        shewLernenRvFragmen fragment = new shewLernenRvFragmen();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shew_lernen_rv, container, false);
    }
}