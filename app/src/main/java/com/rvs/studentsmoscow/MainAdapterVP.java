package com.rvs.studentsmoscow;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rvs.studentsmoscow.main_fragments.feed.FeedFragment;

public class MainAdapterVP extends FragmentPagerAdapter {
    public MainAdapterVP(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return (3);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            default:
                return FeedFragment.newInstance();
        }

    }
}
