package com.example.mohamed.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class FragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;

    FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MustVisitedFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new BeautifulTownsFragment();
            case 3:
                return new SecretsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.cat_1);
            case 1:
                return mContext.getString(R.string.cat_2);
            case 2:
                return mContext.getString(R.string.cat_3);
            case 3:
                return mContext.getString(R.string.cat_4);
            default:
                return null;
        }
    }
}
