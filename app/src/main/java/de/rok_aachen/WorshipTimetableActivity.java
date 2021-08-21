package de.rok_aachen;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import de.rok_aachen.adapter.MonthFragmentsAdapter;
import de.rok_aachen.capsule.TimePlanEntriesHolder;
import de.rok_aachen.capsule.TimePlanHolder;

public class WorshipTimetableActivity extends AppCompatActivity {

    private TabLayout worshipTabLayout;
    private ViewPager viewPager;
    private MonthFragmentsAdapter monthFragmentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worship_timetable);

        this.worshipTabLayout = findViewById(R.id.tabLay_worshipTimetable);
        this.viewPager = (ViewPager) findViewById(R.id.vPager_TimetableContent);

        //List<TimePlanHolder> timePlanList = prepareTimePlanList();
        int countTabs = 3;

        TabLayout.Tab firstMonth;
        TabLayout.Tab secondMonth;
        TabLayout.Tab thirdMonth;

        firstMonth = worshipTabLayout.newTab();
        secondMonth = worshipTabLayout.newTab();
        thirdMonth = worshipTabLayout.newTab();

        worshipTabLayout.addTab(firstMonth, 0, true);
        worshipTabLayout.addTab(secondMonth, 1, false);
        worshipTabLayout.addTab(thirdMonth, 2, false);

        this.monthFragmentsAdapter = new MonthFragmentsAdapter(countTabs, getSupportFragmentManager());
        viewPager.setAdapter(monthFragmentsAdapter);

        worshipTabLayout.setupWithViewPager(viewPager);

        firstMonth.setText("Июль");
        secondMonth.setText("Август");
        thirdMonth.setText("Сентябрь");

    }

}