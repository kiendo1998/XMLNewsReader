package com.kiendo.vietnamnews.ngoisao;

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
                frag = new NgoisaoFragment("vietnam");
                break;
            case 1:
                frag = new NgoisaoFragment("aumy");
                break;
            case 2:
                frag = new NgoisaoFragment("chaua");
                break;
            case 3:
                frag = new NgoisaoFragment("thoitrang");
                break;
            case 4:
                frag = new NgoisaoFragment("miss");
                break;
            case 5:
                frag = new NgoisaoFragment("buonchuyen");
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
                title = "việt nam";
                break;
            case 1:
                title = "âu mỹ";
                break;
            case 2:
                title = "Châu á";
                break;
            case 3:
                title = "Thời trang";
                break;
            case 4:
                title = "Miss";
                break;
            case 5:
                title = "Buôn chuyện";
                break;
        }
        return title;
    }
}