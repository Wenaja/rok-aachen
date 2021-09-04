package de.rok_aachen.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import de.rok_aachen.activities.DayDetailActivity;
import de.rok_aachen.adapter.ListViewAdapter;
import de.rok_aachen.R;

public class ThirdMonthFragment extends Fragment {
    private List<String> timePlanList = null;
    private String[] titles = {"Священномученика Иринея, епископа Лионского.", "Усекновение главы Пророка, Предтечи и Крестителя Господня Иоанна", "Перенесение мощей святого благоверного Великого князя Александра Невского", "Церковное Новолетие (начало индикта)", "Воспоминание чуда архистратига Михаила в Хонех", "РОЖДЕСТВО ПРЕСВЯТОЙ БОГОРОДИЦЫ", "Мучеников Илии, Зотика, Лукиана и Валериана", "ВОЗДВИЖЕНИЕ КРЕСТА ГОСПОДНЯ", "Святых мучениц Веры, Надежды, Любови и матери их Софии"};
    private String[] days = {"5", "11", "12", "14", "19", "21", "26", "27", "30"};
    private String[] weekdays = {"воскресенье", "суббота", "воскресенье", "вторник", "воскресенье", "вторник", "воскресенье", "понедельник", "четверг"};
    private String[] overheads = {"Неделя 11-я по Пятидесятнице", "Седмица", "Неделя 12-я по Пятидесятнице", "Седмица", "Неделя 13-я по Пятидесятнице", "Седмица", "Неделя 14-я по Пятидесятнице", "Седмица", "Седмица"};
    private String[] subtitles = {"Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Молебен на начало учебного года", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия"};
    private String[] start_times = {"9:30", "9:30", "9:30", "11:00", "9:30", "9:30", "9:30", "9:30", "9:30"};

    public ThirdMonthFragment(List<String> timePlanList){
        this.timePlanList = timePlanList;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third_month, container, false);
        ListView listView = (ListView) view.findViewById(R.id.lstView_timetable_third_month);
        ListViewAdapter listViewAdapter = new ListViewAdapter(getContext(), timePlanList);

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), DayDetailActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}