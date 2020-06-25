package com.example.myhadarna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.myhadarna.Adapters.ViewPagerTypeStudyAdapter;
import com.example.myhadarna.Fragments.FirstStudyFragment;
import com.example.myhadarna.Fragments.ViewPagerTypeStudyFragment;
import com.example.myhadarna.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FirstStudyFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFragment(ViewPagerTypeStudyFragment.newInstance(),ViewPagerTypeStudyFragment.TAG);




    }
    public void openFragment(Fragment myfragment, String tag){
        getSupportFragmentManager().beginTransaction().replace(R.id.MA_frameLayout,myfragment)
                .addToBackStack(tag)
                .commit();

    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}