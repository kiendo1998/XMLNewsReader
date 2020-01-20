package com.kiendo.vietnamnews.tuoitre;

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
                frag = new TuoitreFragment("congnghe");
                break;
            case 1:
                frag = new TuoitreFragment("giaitri");
                break;
            case 2:
                frag = new TuoitreFragment("giaoduc");
                break;
            case 3:
                frag = new TuoitreFragment("suckhoe");
                break;
            case 4:
                frag = new TuoitreFragment("khoahoc");
                break;
            case 5:
                frag = new TuoitreFragment("thethao");
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
                title = "Công nghệ";
                break;
            case 1:
                title = "giải trí";
                break;
            case 2:
                title = "Giáo dục";
                break;
            case 3:
                title = "Sức khỏe";
                break;
            case 4:
                title = "Khoa học";
                break;
            case 5:
                title = "Thể thao";
                break;
        }
        return title;
    }
}