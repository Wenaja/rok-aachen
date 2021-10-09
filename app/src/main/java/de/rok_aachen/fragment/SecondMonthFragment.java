package de.rok_aachen.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import de.rok_aachen.activities.DayDetailActivity;
import de.rok_aachen.adapter.ListViewAdapter;
import de.rok_aachen.R;
import de.rok_aachen.capsule.TimePlan;

public class SecondMonthFragment extends Fragment {
    private int listViewId;
    private int secondFragmentLayout;
    private Context context;
    private List<TimePlan> timePlanList = null;

    public SecondMonthFragment(int listViewId, int secondFragmentLayout, Context context, List<TimePlan> timePlanList) {
        this.listViewId = listViewId;
        this.secondFragmentLayout = secondFragmentLayout;
        this.context = context;
        this.timePlanList = timePlanList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ListViewAdapter listViewAdapter = new ListViewAdapter(R.layout.single_calendar_entry, context, timePlanList);

        View view = inflater.inflate(secondFragmentLayout, container, false);
        ListView listView = (ListView) view.findViewById(listViewId);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
            Intent intent = new Intent(getContext(), DayDetailActivity.class);
            startActivity(intent);
        });

        return view;
    }
}