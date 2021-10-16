package de.rok_aachen.adapter;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import de.rok_aachen.capsule.TimePlansContainer;
import de.rok_aachen.fragment.FirstMonthFragment;
import de.rok_aachen.R;

public class MonthFragmentsAdapter extends FragmentPagerAdapter {

    private int countMonths;
    private Context context = null;
    private List<Fragment> fragments = null;
    private TimePlansContainer[] timePlansContainerArray;

    public MonthFragmentsAdapter(@NonNull FragmentManager fm, Context context, TimePlansContainer[] timePlansContainerArray){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        this.context = context;
        this.timePlansContainerArray = timePlansContainerArray;
        this.countMonths = timePlansContainerArray.length;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (fragments == null) {
            this.fragments = new ArrayList<>();
        }

        if (fragments.isEmpty()) {
            for (TimePlansContainer tpc : timePlansContainerArray) {
                fragments.add(new FirstMonthFragment(tpc.getTimePlanList()));
            }
            Log.v("LOG", "MonthFragmentsAdapter : getItem() : IS EMPTY");
        }

        Log.d("VAR", "MonthFragmentsAdapter : getItem() : ===== START =============");
        Log.d("VAR", "MonthFragmentsAdapter : getItem() : size of Fragments List ==> " + fragments.size());
        Log.d("VAR", "MonthFragmentsAdapter : getItem() : position " + position);
        Log.d("VAR", "MonthFragmentsAdapter : getItem() : ===== END ===============");

        return fragments.get(position);

    }

    @Override
    public int getCount() {
        return countMonths;
    }

    @Override
    public String toString() {
        return "MonthFragmentsAdapter{" +
                "countMonths=" + countMonths +
                ", context=" + context +
                ", fragments=" + fragments +
                ", timePlansContainersList=" + timePlansContainerArray.length + " Elements" +
                '}';
    }
}
