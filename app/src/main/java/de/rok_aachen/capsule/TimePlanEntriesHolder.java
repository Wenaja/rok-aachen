package de.rok_aachen.capsule;

import java.util.Objects;

public class TimePlanEntriesHolder {
    private String induction;
    private String title;
    private String subtitle;
    private String day;
    private String weekday;
    private String start_time;
    private String month;

    public TimePlanEntriesHolder(){

    }

    public TimePlanEntriesHolder(String induction, String title, String subtitle, String day, String weekday, String start_time, String month){
        this.induction = induction;
        this.title = title;
        this.subtitle = subtitle;
        this.day = day;
        this.weekday = weekday;
        this.start_time = start_time;
        this.month = month;

    }

    public String getInduction() {
        return induction;
    }

    public void setInduction(String induction) {
        this.induction = induction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimePlanEntriesHolder that = (TimePlanEntriesHolder) o;
        return Objects.equals(induction, that.induction) && Objects.equals(title, that.title) && Objects.equals(subtitle, that.subtitle) && Objects.equals(day, that.day) && Objects.equals(weekday, that.weekday) && Objects.equals(start_time, that.start_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(induction, title, subtitle, day, weekday, start_time);
    }

    @Override
    public String toString() {
        return "TimePlanEntriesHolder{" +
                "induction='" + induction + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", day='" + day + '\'' +
                ", weekday='" + weekday + '\'' +
                ", start_time='" + start_time + '\'' +
                '}';
    }
}
