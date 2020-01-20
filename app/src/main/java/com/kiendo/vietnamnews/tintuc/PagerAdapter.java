package com.kiendo.vietnamnews.tintuc;

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
                frag = new TintucFragment("tinmoi");
                break;
            case 1:
                frag = new TintucFragment("thoisu");
                break;
            case 2:
                frag = new TintucFragment("thegioi");
                break;
            case 3:
                frag = new TintucFragment("kinhte");
                break;
            case 4:
                frag = new TintucFragment("xahoi");
                break;
            case 5:
                frag = new TintucFragment("phapluat");
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
                title = "Tin mới";
                break;
            case 1:
                title = "Thời sự";
                break;
            case 2:
                title = "Thế giới";
                break;
            case 3:
                title = "Kinh tế";
                break;
            case 4:
                title = "Xã hội";
                break;
            case 5:
                title = "Pháp luật";
                break;
        }
        return title;
    }
}