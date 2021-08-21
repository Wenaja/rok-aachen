package de.rok_aachen.capsule;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TimePlanHolder {
    private String month;
    private List<TimePlanEntriesHolder> timePlanList;

    public TimePlanHolder(String moths){
        this.month = month;

    }

    public TimePlanHolder(String month, List<TimePlanEntriesHolder> timePlanList){
        this.month = month;
        this.timePlanList = timePlanList;

    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<TimePlanEntriesHolder> getTimePlanList() {
        return timePlanList;
    }

    public void setTimePlanList(List<TimePlanEntriesHolder> timePlanList) {
        this.timePlanList = timePlanList;
    }

    public TimePlanEntriesHolder removeTimePlanEntry(TimePlanEntriesHolder entry){
        if(getTimePlanList() == null){
            this.timePlanList = new ArrayList<TimePlanEntriesHolder>();
        }

        int i = timePlanList.indexOf(entry);

        return timePlanList.remove(i);

    }

    public void setNewTimePlanEntry(TimePlanEntriesHolder timePlanEntry){
        if (getTimePlanList() == null){
            this.timePlanList = new ArrayList<TimePlanEntriesHolder>();
        }

        this.timePlanList.add(timePlanEntry);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimePlanHolder that = (TimePlanHolder) o;
        return month.equals(that.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month);
    }

    @Override
    public String toString() {
        return "TimePlanHolder[" +
                "month='" + month + '\'' +
                ']';
    }
}
