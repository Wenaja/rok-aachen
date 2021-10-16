package de.rok_aachen.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import de.rok_aachen.activities.DayDetailActivity;
import de.rok_aachen.adapter.ListViewAdapter;
import de.rok_aachen.R;
import de.rok_aachen.capsule.FirstFragmentViewModel;
import de.rok_aachen.capsule.TimePlan;
import de.rok_aachen.capsule.WorshipViewModel;

public class FirstMonthFragment extends Fragment {
    private FirstFragmentViewModel viewModel = null;
    private List<TimePlan> timePlanList = null;

    public static int countOfFragments = 0;

    public FirstMonthFragment(){
        super(R.layout.fragment_first_month);
        Log.v("LOG", "FirstMonthFRAGMENT : Default constructor");
    }

    public FirstMonthFragment(List<TimePlan> timePlanList){
        super(R.layout.fragment_first_month);

        this.timePlanList = timePlanList;
        countOfFragments++;
        Log.d("VAR", "FirstMonthFragment : countOfFragments == > " + countOfFragments);
        Log.v("LOG", "FirstMonthFragment : Custom Constructor");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context context = getContext();

        if (viewModel == null) {
            viewModel = new ViewModelProvider(this).get(FirstFragmentViewModel.class);
        }

        if (timePlanList == null) {
            timePlanList = viewModel.getTimePlanList();

        }else {
            viewModel.setTimePlanList(timePlanList);
        }

        ListViewAdapter listViewAdapter = new ListViewAdapter(R.layout.single_calendar_entry, context, timePlanList);

        View view = inflater.inflate(R.layout.fragment_first_month, container, false);
        ListView listView = (ListView) view.findViewById(R.id.lstView_for_first_fragment);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener((parent, view1, position, id) -> {
                Intent intent = new Intent(getContext(), DayDetailActivity.class);
                startActivity(intent);
        });

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public String toString() {
        return "FirstMonthFragment{" +
                ", timePlanList=" + timePlanList.size() + " Elements" +
                '}';
    }
}