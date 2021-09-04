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
    private List<String> timePlanList = new ArrayList<String>();

    public MonthFragmentsAdapter(int countMonths, @NonNull FragmentManager fm){
        super(fm);
        //this.timePlanEntries = timePlanEntries;
        this.countMonths = countMonths;
timePlanList.add("Position 0");
        timePlanList.add("Position 1");
        timePlanList.add("Position 2");
        timePlanList.add("Position 3");
        timePlanList.add("Position 4");

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (fragments == null) {
            this.fragments = new ArrayList<Fragment>();

            fragments.add(new FirstMonthFragment(timePlanList));
            fragments.add(new SecondMonthFragment(timePlanList));
            fragments.add(new ThirdMonthFragment(timePlanList));
        }

        return fragments.get(position);

    }

    @Override
    public int getCount() {
        return countMonths;
    }
}
