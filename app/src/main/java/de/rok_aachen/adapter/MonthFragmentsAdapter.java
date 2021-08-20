package de.rok_aachen.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.rok_aachen.capsule.TimePlanEntriesHolder;
import de.rok_aachen.fragment.FirstMonthFragment;
import de.rok_aachen.fragment.SecondMonthFragment;
import de.rok_aachen.fragment.ThirdMonthFragment;

public class MonthFragmentsAdapter extends FragmentPagerAdapter {

    private int countMonths;
    private List<Fragment> fragments;
    // private Map<String, List<TimePlanEntriesHolder>> timePlanEntries;

    public MonthFragmentsAdapter(int countMonths, @NonNull FragmentManager fm){
        super(fm);
        //this.timePlanEntries = timePlanEntries;
        this.countMonths = countMonths;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (fragments == null) {
            this.fragments = new ArrayList<Fragment>();

            fragments.add(new FirstMonthFragment());
            fragments.add(new SecondMonthFragment());
            fragments.add(new ThirdMonthFragment());
        }

        return fragments.get(position);

    }

    @Override
    public int getCount() {
        return countMonths;
    }
}
