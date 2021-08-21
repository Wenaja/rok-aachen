package de.rok_aachen.capsule;

public class TempFirstMonthDataHolder {
    private String[] titles = {"Преподобных Сергия и Германа Валаамских Чудотворцев", "Святых славных и всехвальных и первоверховных апостолов ПЕТРА И ПАВЛА", "Преподобного Афанасия Афонского", "Явление Казанской иконы Божией Матери", "Мучеников Прокла и Илария", "Святого равноапостольного великого князя Владимира"};
    private String[] days = {"11", "12", "18", "21", "25", "28"};
    private String[] weekdays = {"воскресенье", "понедельник", "воскресенье", "среда", "воскресенье", "среда"};
    private String[] overheads = {"Неделя 3-я по Пятидесятнице", "Седмица", "Неделя 4-я по Пятидесятнице", "Седмица", "Неделя 5-я по Пятидесятнице", "Седмица"};
    private String[] subtitles = {"Утреня, Часы и Божественная Литургия", "Утреня, Часы и Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия","Молебен и акафист великому князю"};
    private String[] start_times = {"9:30", "9:30", "9:30", "9:30", "9:30", "15:00"};

    public String[] getTitles() {
        return titles;
    }

    public void addTitle(String title) {
        int length = titles.length;
        this.titles[length] = title;
    }

    public String[] getDays() {
        return days;
    }

    public void addDay(String day) {
        int length = days.length;
        this.days[length] = day;
    }

    public String[] getWeekdays() {
        return weekdays;
    }

    public void addWeekday(String weekday) {
        int length = weekdays.length;
        this.weekdays[length] = weekday;
    }

    public String[] getOverheads() {
        return overheads;
    }

    public void addOverhead(String overhead) {
        this.overheads[overheads.length] = overhead;
    }

    public String[] getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitle) {
        int length = subtitles.length;
        this.subtitles[length] = subtitle;
    }

    public String[] getStart_times() {
        return start_times;
    }

    public void addStart_time(String start_time) {
        int length = start_times.length;
        this.start_times[length] = start_time;
    }
}
