package de.rok_aachen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.rok_aachen.R;

public class ListViewAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] titles, days, weekdays, overheads, subtitles, start_times;

    public ListViewAdapter(Context context, String[] titles, String[] days, String[] weekdays, String[] overheads, String[] subtitles, String[] start_times){
        super(context, R.layout.include_calendar_entry, titles);
        this.context = context;
        this.days = days;
        this.weekdays = weekdays;
        this.overheads = overheads;
        this.subtitles = subtitles;
        this.start_times = start_times;
        this.titles = titles;
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

        day.setText(days[position]);
        weekday.setText(weekdays[position]);
        overhead.setText(overheads[position]);
        title.setText(titles[position]);
        subtitle.setText(subtitles[position]);
        start_time.setText(start_times[position]);

        return view;
    }
}
