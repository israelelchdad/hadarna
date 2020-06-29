package com.example.myhadarna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.os.Bundle;

import com.example.myhadarna.Fragments.FirstStudyFragment;
import com.example.myhadarna.Fragments.TypeStudyFragment;

public class MainActivity extends AppCompatActivity implements FirstStudyFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFragment(TypeStudyFragment.newInstance(), TypeStudyFragment.TAG);




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