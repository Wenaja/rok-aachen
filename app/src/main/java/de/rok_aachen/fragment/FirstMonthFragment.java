package de.rok_aachen.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import de.rok_aachen.DayDetailActivity;
import de.rok_aachen.adapter.ListViewAdapter;
import de.rok_aachen.R;

public class FirstMonthFragment extends Fragment {

    /*
    *  TODO: Diese alle Arrays dienen jetzt als Platzhalter und müssen später mit echten Daten gefüllt werden
     */
    private String[] titles = {"Преподобных Сергия и Германа Валаамских Чудотворцев", "Святых славных и всехвальных и первоверховных апостолов ПЕТРА И ПАВЛА", "Преподобного Афанасия Афонского", "Явление Казанской иконы Божией Матери", "Мучеников Прокла и Илария", "Святого равноапостольного великого князя Владимира"};
    private String[] days = {"11", "12", "18", "21", "25", "28"};
    private String[] weekdays = {"воскресенье", "понедельник", "воскресенье", "среда", "воскресенье", "среда"};
    private String[] overheads = {"Неделя 3-я по Пятидесятнице", "Седмица", "Неделя 4-я по Пятидесятнице", "Седмица", "Неделя 5-я по Пятидесятнице", "Седмица"};
    private String[] subtitles = {"Утреня, Часы и Божественная Литургия", "Утреня, Часы и Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия","Молебен и акафист великому князю"};
    private String[] start_times = {"9:30", "9:30", "9:30", "9:30", "9:30", "15:00"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_month, container, false);

        ListView listView = (ListView) view.findViewById(R.id.lstView_timetable_entry);
        ListViewAdapter listViewAdapter = new ListViewAdapter(getContext(), titles, days, weekdays, overheads, subtitles, start_times);
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