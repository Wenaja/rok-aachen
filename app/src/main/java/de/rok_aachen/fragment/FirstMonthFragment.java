package de.rok_aachen.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import de.rok_aachen.activities.DayDetailActivity;
import de.rok_aachen.adapter.ListViewAdapter;
import de.rok_aachen.R;
import de.rok_aachen.capsule.TimePlan;

public class FirstMonthFragment extends Fragment {
    private int firstFragmentLayout;
    private Context context;
    private List<TimePlan> timePlanList = null;

    public static int countOfFragments = 0;

    public FirstMonthFragment(int firstFragmentLayout,  Context context, List<TimePlan> timePlanList){
        this.firstFragmentLayout = firstFragmentLayout;
        this.context = context;
        this.timePlanList = timePlanList;
        countOfFragments++;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ListViewAdapter listViewAdapter = new ListViewAdapter(R.layout.single_calendar_entry, context, timePlanList);

        View view = inflater.inflate(firstFragmentLayout, container, false);
        ListView listView = (ListView) view.findViewById(R.id.lstView_for_first_fragment);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
                Intent intent = new Intent(getContext(), DayDetailActivity.class);
                startActivity(intent);
        });

        return view;
    }

    @Override
    public String toString() {
        return "FirstMonthFragment{" +
                "firstFragmentLayout=" + firstFragmentLayout +
                ", context=" + context +
                ", timePlanList=" + timePlanList.size() + " Elements" +
                '}';
    }
}