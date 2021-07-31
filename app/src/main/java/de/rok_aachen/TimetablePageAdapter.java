package de.rok_aachen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TimetablePageAdapter extends FragmentPagerAdapter {

    private int countMonths;
    private List<Fragment> fragments;

    public TimetablePageAdapter(@NonNull FragmentManager fm, int countMonths){
        super(fm);
        this.countMonths = countMonths;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (fragments == null) {
            this.fragments = new ArrayList<Fragment>();
            for (int i = 0; i < countMonths; i++) {
                fragments.add(new MonthFragment());
            }
        }

        return fragments.get(position);

    }

    @Override
    public int getCount() {
        return countMonths;
    }
}
