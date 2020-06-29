package com.example.myhadarna.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myhadarna.Adapters.ViewPagerDataLearningAdapter;
import com.example.myhadarna.Adapters.ViewPagerTypeStudyAdapter;
import com.example.myhadarna.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class FirstStudyFragment extends Fragment {
    public static final String TAG = FirstStudyFragment.class.getSimpleName();
    View view;
    private ViewPager myViewpajer;
    private ViewPagerDataLearningAdapter viewPagerDataLearningAdapter;
    private ArrayList<Fragment>myListDataLernen = new ArrayList<>();
    private OnFragmentInteractionListener mListener;

    public FirstStudyFragment() {

    }


    public static FirstStudyFragment newInstance() {
        FirstStudyFragment fragment = new FirstStudyFragment();
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
        
        view=inflater.inflate(R.layout.fragment_first_study, container, false);
        initMyViewPageer();
        return view;
    }

    private void initMyViewPageer() {
        myViewpajer = view.findViewById(R.id.FFS_viewpager);
        viewPagerDataLearningAdapter = new ViewPagerDataLearningAdapter(getActivity().getSupportFragmentManager(),initMyListStudy(),getContext());
        myViewpajer.setAdapter(viewPagerDataLearningAdapter);
        TabLayout tabLayout = view.findViewById(R.id.FFS_tab_layout);
//        tabLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        tabLayout.setupWithViewPager(myViewpajer, true);
    }
    private ArrayList<Fragment> initMyListStudy() {
        myListDataLernen.add(shewLernenRvFragmen.newInstance());
        myListDataLernen.add(shewLernenRvFragmen.newInstance());
        myListDataLernen.add(shewLernenRvFragmen.newInstance());
        return myListDataLernen;

    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }




    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);

    }
}