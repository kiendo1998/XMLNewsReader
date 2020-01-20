package com.kiendo.vietnamnews.bao24h;

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
                frag = new Bao24hFragment("oto");
                break;
            case 1:
                frag = new Bao24hFragment("dulich");
                break;
            case 2:
                frag = new Bao24hFragment("bongda");
                break;
            case 3:
                frag = new Bao24hFragment("thoitrang");
                break;
            case 4:
                frag = new Bao24hFragment("tintuctrongngay");
                break;
            case 5:
                frag = new Bao24hFragment("amthuc");
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
                title = "Ô tô";
                break;
            case 1:
                title = "Du lịch";
                break;
            case 2:
                title = "Bóng đá";
                break;
            case 3:
                title = "Thời trang";
                break;
            case 4:
                title = "Tin tức trong ngày";
                break;
            case 5:
                title = "Ẩm thực";
                break;
        }
        return title;
    }
}