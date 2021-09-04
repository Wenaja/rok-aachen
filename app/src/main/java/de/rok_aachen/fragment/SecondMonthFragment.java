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

public class SecondMonthFragment extends Fragment {
    private List<String> timePlanList = null;
    private String[] titles = {"Святых Отцев 6-ти первых Вселенских Соборов", "Священномученика Ермолая", "Великомученика и целителя Пантелеимона", "Происхождение Честных Древ Животворящего Креста Господня (Первый Спас)", "Архидиакона Стефана", "Преображения Господня", "ПРЕОБРАЖЕНИЕ ГОСПОДНЕ (Второй Спас)", "Святого апостола Матфия", "УСПЕНИЕ ПРЕСВЯТОЙ БОГОРОДИЦЫ", "Перенесение Нерукотворного Образа Господа (Убруса) из Эдессы в Константинополь (3-й Спас)"};
    private String[] days = {"1", "8", "9", "14", "15", "18", "19", "22", "28", "29"};
    private String[] weekdays = {"воскресенье", "воскресенье", "понедельник", "суббота", "воскресенье", "среда", "четверг", "воскресенье", "суббота", "воскресенье"};
    private String[] overheads = {"Неделя 6-я по Пятидесятнице", "Неделя 7-я по Пятидесятнице", "Седмица", "Седмица", "Неделя 8-я по Пятидесятнице", "Седмица", "Седмица", "Неделя 9-я по Пятидесятнице", "Седмица", "Неделя 10-я по Пятидесятнице"};
    private String[] subtitles = {"", "", "", "", "", "", "", "", "", ""};
    private String[] start_times = {"9:30", "9:30", "9:30", "9:30", "9:30", "9:30", "18:00", "9:30", "9:30", "9:30"};

    public SecondMonthFragment(List<String> timePlanList){
        this.timePlanList = timePlanList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_month, container, false);
        ListView listView = (ListView) view.findViewById(R.id.lstView_timetable_second_month);
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