package com.example.dockngo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.viewpagerindicator.IconPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter{

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getIconResId(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Fragment getItem(int position) 
    {
        Fragment frag = new MapsActivity();
        switch(position){
        case 0:
            frag = new MapsActivity();
            break;
        case 1:
            frag = new SecondActivity();
            break;
        case 2:
            frag = new ThirdActivity();
            break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }
    
    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch(position){
        case 0:
            title = "Maps";
            break;
        case 1:
            title = "Music";
            break;
        case 2:
            title = "Phone";
            break;
        }
        return title;
    }

}