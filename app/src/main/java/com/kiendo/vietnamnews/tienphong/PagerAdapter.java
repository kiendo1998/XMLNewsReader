package com.kiendo.vietnamnews.tienphong;

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
                frag = new TienphongFragment("xahoi");
                break;
            case 1:
                frag = new TienphongFragment("kinhte");
                break;
            case 2:
                frag = new TienphongFragment("diaoc");
                break;
            case 3:
                frag = new TienphongFragment("thegioi");
                break;
            case 4:
                frag = new TienphongFragment("vanhoa");
                break;
            case 5:
                frag = new TienphongFragment("gioitre");
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
                title = "Xã hội";
                break;
            case 1:
                title = "Kinh tế";
                break;
            case 2:
                title = "Địa ốc";
                break;
            case 3:
                title = "Thế giới";
                break;
            case 4:
                title = "Văn hóa";
                break;
            case 5:
                title = "Giới trẻ";
                break;
        }
        return title;
    }
}