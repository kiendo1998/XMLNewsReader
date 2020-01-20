package com.kiendo.vietnamnews.dautu;

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
                frag = new DautuFragment("dautu");
                break;
            case 1:
                frag = new DautuFragment("dauthaudaugia");
                break;
            case 2:
                frag = new DautuFragment("doanhnhan");
                break;
            case 3:
                frag = new DautuFragment("nganhang");
                break;
            case 4:
                frag = new DautuFragment("batdongsan");
                break;
            case 5:
                frag = new DautuFragment("tieudung");
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
                title = "Đầu tư";
                break;
            case 1:
                title = "Đấu thầu";
                break;
            case 2:
                title = "Doanh nhân";
                break;
            case 3:
                title = "Ngân hàng";
                break;
            case 4:
                title = "Bất động sản";
                break;
            case 5:
                title = "Tiêu dùng";
                break;
        }
        return title;
    }
}