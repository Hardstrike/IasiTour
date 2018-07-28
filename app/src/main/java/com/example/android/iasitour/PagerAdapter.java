package com.example.android.iasitour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.iasitour.ServicesFragment;


public class PagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new AttractionsFragment();
        }
        else if (position == 1){
            return new FoodFragment();
        }
        else if (position == 2){
            return new HotelsFragment();
        }
        else{
            return new ServicesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.Attractions);
        }
        else if (position == 1){
            return mContext.getString(R.string.Food);
        }
        else if (position == 2){
            return mContext.getString(R.string.Hotels);
        }
        else {
            return mContext.getString(R.string.Services);
        }
    }
}