package de.rok_aachen;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

public class WorshipTimetableActivity extends AppCompatActivity {

    private TabLayout worshipTabLayout;
    private TabItem firstMonth, secondMonth, thirdMonth;
    private TimetablePageAdapter timetablePageAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worship_timetable);

        this.worshipTabLayout = findViewById(R.id.tabLay_worshipTimetable);
        this.viewPager = (ViewPager) findViewById(R.id.vPager_TimetableContent);

        TabLayout.Tab firstMonth = worshipTabLayout.newTab();
        TabLayout.Tab secondMonth = worshipTabLayout.newTab();
        TabLayout.Tab thirdMonth = worshipTabLayout.newTab();

        worshipTabLayout.addTab(firstMonth, 0, true);
        worshipTabLayout.addTab(secondMonth, 1, false);
        worshipTabLayout.addTab(thirdMonth, 2, false);

        this.timetablePageAdapter = new TimetablePageAdapter(getSupportFragmentManager(), worshipTabLayout.getTabCount());
        viewPager.setAdapter(timetablePageAdapter);

        worshipTabLayout.setupWithViewPager(viewPager);

        firstMonth.setText("Август");
        secondMonth.setText("Сентябрь");
        thirdMonth.setText("Октябрь");

    }

}