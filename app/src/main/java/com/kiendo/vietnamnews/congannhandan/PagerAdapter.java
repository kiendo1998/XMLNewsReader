package com.kiendo.vietnamnews.congannhandan;

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
                frag = new CongannhandanFragment("khoahocquansu");
                break;
            case 1:
                frag = new CongannhandanFragment("xahoi");
                break;
            case 2:
                frag = new CongannhandanFragment("guongsang");
                break;
            case 3:
                frag = new CongannhandanFragment("giaothong");
                break;
            case 4:
                frag = new CongannhandanFragment("thethao");
                break;
            case 5:
                frag = new CongannhandanFragment("yte");
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
                title = "Khoa học quân sự";
                break;
            case 1:
                title = "Xã hội";
                break;
            case 2:
                title = "Gương sáng";
                break;
            case 3:
                title = "Giao thông";
                break;
            case 4:
                title = "Thể thao";
                break;
            case 5:
                title = "Y tế";
                break;
        }
        return title;
    }
}