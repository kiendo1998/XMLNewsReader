package com.kiendo.vietnamnews.vietnamnet;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new VietnamnetFragment("chinhtri");
                break;
            case 1:
                frag = new VietnamnetFragment("talk");
                break;
            case 2:
                frag = new VietnamnetFragment("thoisu");
                break;
            case 3:
                frag = new VietnamnetFragment("kinhdoanh");
                break;
            case 4:
                frag = new VietnamnetFragment("giaitri");
                break;
            case 5:
                frag = new VietnamnetFragment("giaoduc");
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 6;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "chính trị";
                break;
            case 1:
                title = "Talk show";
                break;
            case 2:
                title = "thời sự";
                break;
            case 3:
                title = "Kinh doanh";
                break;
            case 4:
                title = "Giải trí";
                break;
            case 5:
                title = "Giáo dục";
                break;
        }
        return title;
    }
}