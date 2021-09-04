package de.rok_aachen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import de.rok_aachen.R;

public class ListViewAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] titles, days, weekdays, overheads, subtitles, start_times;
    List<String> timePlanList;

    public ListViewAdapter(Context context, List<String> timePlanList){
        super(context, R.layout.include_calendar_entry, timePlanList);
        this.context = context;
        //this.days = days;
        //this.weekdays = weekdays;
        //this.overheads = overheads;
        //this.subtitles = subtitles;
        //this.start_times = start_times;
        //this.titles = titles;
        this.timePlanList = timePlanList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.include_calendar_entry, parent, false);

        TextView day = (TextView) view.findViewById(R.id.txtView_day_of_month);
        TextView weekday = (TextView) view.findViewById(R.id.txtView_weekday);
        TextView overhead = (TextView) view.findViewById(R.id.txtView_overhead);
        TextView title = (TextView) view.findViewById(R.id.txtView_title);
        TextView subtitle = (TextView) view.findViewById(R.id.txtView_subtitle);
        TextView start_time = (TextView) view.findViewById(R.id.txtView_start_time);
/*
        day.setText(days[position]);
        weekday.setText(weekdays[position]);
        overhead.setText(overheads[position]);
        title.setText(titles[position]);
        subtitle.setText(subtitles[position]);
        start_time.setText(start_times[position]);
*/
        String s = timePlanList.get(position);
        day.setText(s);
        weekday.setText(s);
        overhead.setText(s);
        title.setText(s);
        subtitle.setText(s);
        start_time.setText(s);

        return view;
    }
}
