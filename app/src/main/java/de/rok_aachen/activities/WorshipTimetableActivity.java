package de.rok_aachen.activities;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
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

    private Toolbar toolbar = null;
    private TabLayout.Tab firstMonthTab = null , secondMonthTab = null, thirdMonthTab = null;
    private TabLayout worshipTabLayout;
    private ViewPager viewPager;

    private MonthFragmentsAdapter monthFragmentsAdapter;
    private List<TimePlan> timePlanList = null;
    //private TimePlansContainer[] timePlansContainerArray = null;

    private WorshipViewModel worshipVM = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worship_timetable);

        toolbar = (Toolbar) findViewById(R.id.worship_toolbar);
        worshipTabLayout = (TabLayout) findViewById(R.id.tabLay_worshipTimetable);
        viewPager = (ViewPager) findViewById(R.id.vPager_TimetableContent);

        setSupportActionBar(toolbar);
        toolbar.setTitle(getString(R.string.str_title_activity_worship_timetable));
        toolbar.setTitleTextColor(getColor(R.color.white));

        worshipVM = new ViewModelProvider(this).get(WorshipViewModel.class);
        worshipVM.initialize(getApplicationContext());

        worshipVM.getTimePlansContainerArray().observe(this, timePlansContainers -> {
            monthFragmentsAdapter = new MonthFragmentsAdapter(
                    getSupportFragmentManager(),
                    getApplicationContext(),
                    timePlansContainers);

            firstMonthTab = worshipTabLayout.newTab();
            secondMonthTab = worshipTabLayout.newTab();
            thirdMonthTab = worshipTabLayout.newTab();

            worshipTabLayout.addTab(firstMonthTab, 0, true);
            worshipTabLayout.addTab(secondMonthTab, 1, false);
            worshipTabLayout.addTab(thirdMonthTab, 2, false);

            viewPager.setAdapter(monthFragmentsAdapter);
            worshipTabLayout.setupWithViewPager(viewPager, true);

            TimePlansContainer tpc = timePlansContainers[0];
            firstMonthTab.setText(tpc.getMonth());

            tpc = timePlansContainers[1];
            secondMonthTab.setText(tpc.getMonth());

            tpc = timePlansContainers[2];
            thirdMonthTab.setText(tpc.getMonth());
        });
        //timePlansContainerArray = worshipVM.getLiveData().getValue();

        Log.d(VAR, "onCreate : START =============================");
        //Log.d(VAR, "onCreate : Size of TimePlansContainerArray ==> " + timePlansContainerArray.length);
        Log.d(VAR, "onCreate : Count of Tabs ==> " + worshipTabLayout.getTabCount());
        Log.d(VAR, "onCreate : Count of Fragments ==> " + FirstMonthFragment.countOfFragments);
        Log.d(VAR, "onCreate : END ===============================");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //worshipVM.closeDatabase();
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