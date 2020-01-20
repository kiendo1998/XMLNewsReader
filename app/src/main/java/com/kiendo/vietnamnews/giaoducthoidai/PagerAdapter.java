package com.kiendo.vietnamnews.giaoducthoidai;

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
                frag = new GiaoducthoidaiFragment("thoisu");
                break;
            case 1:
                frag = new GiaoducthoidaiFragment("giaoduc");
                break;
            case 2:
                frag = new GiaoducthoidaiFragment("bandoc");
                break;
            case 3:
                frag = new GiaoducthoidaiFragment("ketnoi");
                break;
            case 4:
                frag = new GiaoducthoidaiFragment("traodoi");
                break;
            case 5:
                frag = new GiaoducthoidaiFragment("khoahoc");
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
                title = "Giáo dục";
                break;
            case 2:
                title = "Bạn đọc";
                break;
            case 3:
                title = "Kết nối";
                break;
            case 4:
                title = "Trao đổi";
                break;
            case 5:
                title = "Khoa học";
                break;
        }
        return title;
    }
}