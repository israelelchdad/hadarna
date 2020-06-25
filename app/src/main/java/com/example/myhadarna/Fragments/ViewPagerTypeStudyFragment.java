package com.example.myhadarna.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myhadarna.Adapters.ViewPagerTypeStudyAdapter;
import com.example.myhadarna.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class ViewPagerTypeStudyFragment extends Fragment {
    public static final String TAG = ViewPagerTypeStudyFragment.class.getSimpleName();
    View view;
    private ViewPager myViewpajer;
    private ViewPagerTypeStudyAdapter viewPagerTypeStudyAdapter;
    private ArrayList<Fragment> myListTypesStudy = new ArrayList<>();



    public ViewPagerTypeStudyFragment() {

    }


    public static ViewPagerTypeStudyFragment newInstance() {
        ViewPagerTypeStudyFragment fragment = new ViewPagerTypeStudyFragment();
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


        view =inflater.inflate(R.layout.fragment_view_pager_type_study, container, false);
        initViews();
        return view;
    }
    private void initViews() {
        myViewpajer = view.findViewById(R.id.FVPTS_viewpager);
        viewPagerTypeStudyAdapter= new ViewPagerTypeStudyAdapter(getActivity().getSupportFragmentManager(),initMyListStudy(),getContext());
        myViewpajer.setAdapter(viewPagerTypeStudyAdapter);
        TabLayout tabLayout = view.findViewById(R.id.FVPTS_tab_layout);
        tabLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        tabLayout.setupWithViewPager(myViewpajer, true);
    }

    private ArrayList<Fragment> initMyListStudy() {
        myListTypesStudy.add(FirstStudyFragment.newInstance());
        myListTypesStudy.add(FirstStudyFragment.newInstance());
        return myListTypesStudy;

    }
}