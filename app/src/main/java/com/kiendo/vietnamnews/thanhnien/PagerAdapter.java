package com.kiendo.vietnamnews.thanhnien;

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
                frag = new ThanhnienFragment("vietnam");
                break;
            case 1:
                frag = new ThanhnienFragment("thegioi");
                break;
            case 2:
                frag = new ThanhnienFragment("vanhoa");
                break;
            case 3:
                frag = new ThanhnienFragment("thethao");
                break;
            case 4:
                frag = new ThanhnienFragment("doisong");
                break;
            case 5:
                frag = new ThanhnienFragment("kinhdoanh");
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
                title = "Việt Nam";
                break;
            case 1:
                title = "Thế giới";
                break;
            case 2:
                title = "Văn hóa";
                break;
            case 3:
                title = "Thể thao";
                break;
            case 4:
                title = "Đời sống";
                break;
            case 5:
                title = "Kinh doanh";
                break;
        }
        return title;
    }
}