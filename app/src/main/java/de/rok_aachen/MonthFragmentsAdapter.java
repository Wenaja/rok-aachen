package de.rok_aachen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MonthFragmentsAdapter extends FragmentPagerAdapter {

    private int countMonths;
    private List<Fragment> fragments;

    public MonthFragmentsAdapter(@NonNull FragmentManager fm, int countMonths){
        super(fm);
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
