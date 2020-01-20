package com.kiendo.vietnamnews.nguoilaodong;

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
                frag = new NguoilaodongFragment("thoisu");
                break;
            case 1:
                frag = new NguoilaodongFragment("congdoan");
                break;
            case 2:
                frag = new NguoilaodongFragment("bandoc");
                break;
            case 3:
                frag = new NguoilaodongFragment("kinhte");
                break;
            case 4:
                frag = new NguoilaodongFragment("suckhoe");
                break;
            case 5:
                frag = new NguoilaodongFragment("giaoduc");
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
                title = "Thời sự";
                break;
            case 1:
                title = "Công đoàn";
                break;
            case 2:
                title = "Bạn đọc";
                break;
            case 3:
                title = "Kinh tế";
                break;
            case 4:
                title = "Sức khỏe";
                break;
            case 5:
                title = "Giáo dục";
                break;
        }
        return title;
    }
}