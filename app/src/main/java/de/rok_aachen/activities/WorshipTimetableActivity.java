package de.rok_aachen.activities;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import de.rok_aachen.R;
import de.rok_aachen.adapter.MonthFragmentsAdapter;
import de.rok_aachen.capsule.TimePlan;
import de.rok_aachen.capsule.TimePlansContainer;
import de.rok_aachen.capsule.WorshipViewModel;
import de.rok_aachen.fragment.FirstMonthFragment;


public class WorshipTimetableActivity extends AppCompatActivity {
    private final String LOG = "LOG";
    private final String VAR = "VAR";

    private TabLayout.Tab firstMonthTab = null , secondMonthTab = null, thirdMonthTab = null;

    private TabLayout worshipTabLayout;
    private ViewPager viewPager;
    private MonthFragmentsAdapter monthFragmentsAdapter;

    private List<TimePlan> timePlanList = null;
    private TimePlansContainer[] timePlansContainerArray = null;

    private WorshipViewModel worshipVM = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worship_timetable);

        worshipVM = new ViewModelProvider(this).get(WorshipViewModel.class);
        worshipVM.initialize(getApplicationContext());
        timePlansContainerArray = worshipVM.getLiveData().getValue();

        worshipTabLayout = (TabLayout) findViewById(R.id.tabLay_worshipTimetable);
        viewPager = (ViewPager) findViewById(R.id.vPager_TimetableContent);

        monthFragmentsAdapter = new MonthFragmentsAdapter(
                getSupportFragmentManager(),
                getApplicationContext(),
                timePlansContainerArray);

        firstMonthTab = worshipTabLayout.newTab();
        secondMonthTab = worshipTabLayout.newTab();
        thirdMonthTab = worshipTabLayout.newTab();

        worshipTabLayout.addTab(firstMonthTab, 0, true);
        worshipTabLayout.addTab(secondMonthTab, 1, false);
        worshipTabLayout.addTab(thirdMonthTab, 2, false);

        viewPager.setAdapter(monthFragmentsAdapter);
        worshipTabLayout.setupWithViewPager(viewPager, true);

        Log.d(VAR, "onCreate : START =============================");
        Log.d(VAR, "onCreate : Size of TimePlansContainerArray ==> " + timePlansContainerArray.length);
        Log.d(VAR, "onCreate : Count of Tabs ==> " + worshipTabLayout.getTabCount());
        Log.d(VAR, "onCreate : Count of Fragments ==> " + FirstMonthFragment.countOfFragments);
        Log.d(VAR, "onCreate : END ===============================");
    }

    @Override
    protected void onStart() {
        super.onStart();

        worshipVM.getTimePlansContainerArray().observe(this, timePlansContainers -> {
            int countTabs = worshipTabLayout.getTabCount();

            for (int i = 0; i < countTabs; i++) {
                String month = timePlansContainers[i].getMonth();
                worshipTabLayout.getTabAt(i).setText(month);
            }
            timePlansContainerArray = timePlansContainers;
            monthFragmentsAdapter.notifyDataSetChanged();
            worshipTabLayout.refreshDrawableState();
            Log.d(VAR, "(observer) countTabs " + countTabs);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        worshipVM.closeDatabase();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

}