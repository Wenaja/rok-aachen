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
import de.rok_aachen.capsule.TimePlan;

public class ListViewAdapter extends ArrayAdapter<TimePlan> {
    private int layoutId;
    private Context context = null;
    private List<TimePlan> timePlans = null;

    public ListViewAdapter(int layoutId, Context context, List<TimePlan> timePlans){
        super(context, layoutId, timePlans);
        this.layoutId = layoutId;
        this.context = context;
        this.timePlans = timePlans;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layoutId, parent, false);

        TextView day = (TextView) view.findViewById(R.id.txtView_day_of_month);
        TextView weekday = (TextView) view.findViewById(R.id.txtView_weekday);
        TextView overhead = (TextView) view.findViewById(R.id.txtView_overhead);
        TextView title = (TextView) view.findViewById(R.id.txtView_title);
        TextView subtitle = (TextView) view.findViewById(R.id.txtView_subtitle);
        TextView start_time = (TextView) view.findViewById(R.id.txtView_start_time);

        TimePlan timePlan = timePlans.get(position);

        day.setText(timePlan.getDay());
        weekday.setText(timePlan.getWeekday());
        overhead.setText(timePlan.getInduction());
        title.setText(timePlan.getTitle());
        subtitle.setText(timePlan.getSubtitle());
        start_time.setText(timePlan.getStart_time());

        return view;
    }

    @Override
    public String toString() {
        return "ListViewAdapter{" +
                "layoutId=" + layoutId +
                ", context=" + context +
                ", timePlans=" + ((timePlans == null) ? "null" : timePlans.size()) + " Elemnts" +
                '}';
    }
}
