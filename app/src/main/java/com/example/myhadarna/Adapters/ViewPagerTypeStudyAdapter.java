package com.example.myhadarna.Adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.myhadarna.R;

import java.util.ArrayList;

public class ViewPagerTypeStudyAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> myList;
    Context context;
    public ViewPagerTypeStudyAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> myList, Context context) {
        super(fm);
        this.myList = myList;
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return myList.get(position);
    }

    @Override
    public int getCount() {
        return myList.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = context.getString(R.string.firstStudy);
            int i =2;
        }
        else if (position == 1)
        {
          title ="TOWW";

        }


        return title;
    }
}
