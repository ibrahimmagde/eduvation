package org.mat.eduvation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.mat.eduvation.ScheduleFragment.Day1;
import org.mat.eduvation.ScheduleFragment.Day2;

/**
 * Created by ahmed on 7/18/2016.
 */
public class scheduleAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public scheduleAdapter (FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:

                return new Day1();
            case 1:

                return new Day2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}