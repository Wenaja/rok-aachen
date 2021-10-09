package de.rok_aachen.capsule;

import java.util.Objects;

public class TimePlan {
    private String induction;
    private String title;
    private String subtitle;
    private String day;
    private String weekday;
    private String start_time;
    private String pText;

    public TimePlan(String pText){
        this.pText = pText;
    }

    public TimePlan(String overhead, String title, String subtitle, String start_time, String day, String weekday){
        this.induction = overhead;
        this.title = title;
        this.subtitle = subtitle;
        this.start_time = start_time;
        this.day = day;
        this.weekday = weekday;

    }
    /*
    * TODO: für sBuilder3 und sBuilder4 Verwendung finden
     */
    private void normalize(String sBuilder0, String sBuilder1, String sBuilder2, String sBuilder3, String sBuilder4){
        int idx, t;

        idx = day.indexOf(" ");
        this.day = day.substring(0, idx);

        idx = sBuilder0.indexOf(",");
        weekday = sBuilder0.substring(idx + 2);

        t = pText.indexOf(":");
        start_time = pText.substring(t -2, t + 3).trim();

        if(sBuilder1.contains("Неделя")){
            induction = sBuilder1;
            title = sBuilder2;
            subtitle = "Утреня, Часы и Божественная Литургия";

        }else{
            induction = "Седмица";
            title = sBuilder1;
            subtitle = sBuilder2;
        }
    }

    public void initialize() {
        int counter = 0;
        char c;
        char[] cArray = pText.toCharArray();

        StringBuilder builder = new StringBuilder();
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder stringBuilder4 = new StringBuilder();

        for (int i = 0; i < cArray.length; i++) {
            c = cArray[i];
            builder.setLength(0); // clear builder
            builder.append(c);
            String singleChar = builder.toString();

            if(singleChar.equals(".")){
                counter++;
                continue;
            }

            switch (counter){
                case 0:
                    stringBuilder0.append(cArray[i]);
                    break;
                case 1:
                    stringBuilder1.append(cArray[i]);
                    break;
                case 2:
                    stringBuilder2.append(cArray[i]);
                    break;
                case 3:
                    stringBuilder3.append(cArray[i]);
                    break;
                default:
                    stringBuilder4.append(cArray[i]);
                    break;
            }
        }

        normalize(stringBuilder0.toString().trim(), stringBuilder1.toString().trim(), stringBuilder2.toString().trim(), stringBuilder3.toString().trim(), stringBuilder4.toString().trim());

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

    public String getpText() {
        return pText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimePlan that = (TimePlan) o;
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
