package com.kiendo.vietnamnews.vnexpress;

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
                frag = new VnexpressFragment("thoisu");
                break;
            case 1:
                frag = new VnexpressFragment("sohoa");
                break;
            case 2:
                frag = new VnexpressFragment("giadinh");
                break;
            case 3:
                frag = new VnexpressFragment("kinhdoanh");
                break;
            case 4:
                frag = new VnexpressFragment("thethao");
                break;
            case 5:
                frag = new VnexpressFragment("phapluat");
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
                title = "Số hóa";
                break;
            case 2:
                title = "Đời sống";
                break;
            case 3:
                title = "Kinh doanh";
                break;
            case 4:
                title = "Thể thao";
                break;
            case 5:
                title = "Pháp luật";
                break;
        }
        return title;
    }
}