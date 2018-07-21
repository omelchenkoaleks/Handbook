package com.omelchenkoaleks.handbook.adapter;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.omelchenkoaleks.handbook.fragment.CurrentTaskFragment;
import com.omelchenkoaleks.handbook.fragment.DoneTaskFragment;

public class TabAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public static final int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static final int DONE_TASK_FRAGMENT_POSITION = 1;

    private CurrentTaskFragment mCurrentTaskFragment;
    private DoneTaskFragment mDoneTaskFragment;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        mCurrentTaskFragment = new CurrentTaskFragment();
        mDoneTaskFragment = new DoneTaskFragment();
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return mCurrentTaskFragment;
            case 1:
                return mDoneTaskFragment;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
