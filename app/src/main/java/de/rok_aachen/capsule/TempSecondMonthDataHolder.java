package de.rok_aachen.capsule;

public class TempSecondMonthDataHolder {
    private String[] titles = {"Святых Отцев 6-ти первых Вселенских Соборов", "Священномученика Ермолая", "Великомученика и целителя Пантелеимона", "Происхождение Честных Древ Животворящего Креста Господня (Первый Спас)", "Архидиакона Стефана", "Преображения Господня", "ПРЕОБРАЖЕНИЕ ГОСПОДНЕ (Второй Спас)", "Святого апостола Матфия", "УСПЕНИЕ ПРЕСВЯТОЙ БОГОРОДИЦЫ", "Перенесение Нерукотворного Образа Господа (Убруса) из Эдессы в Константинополь (3-й Спас)"};
    private String[] days = {"1", "8", "9", "14", "15", "18", "19", "22", "28", "29"};
    private String[] weekdays = {"воскресенье", "воскресенье", "понедельник", "суббота", "воскресенье", "среда", "четверг", "воскресенье", "суббота", "воскресенье"};
    private String[] overheads = {"Неделя 6-я по Пятидесятнице", "Неделя 7-я по Пятидесятнице", "Седмица", "Седмица", "Неделя 8-я по Пятидесятнице", "Седмица", "Седмица", "Неделя 9-я по Пятидесятнице", "Седмица", "Неделя 10-я по Пятидесятнице"};
    private String[] subtitles = {"", "", "", "", "", "", "", "", "", ""};
    private String[] start_times = {"9:30", "9:30", "9:30", "9:30", "9:30", "9:30", "18:00", "9:30", "9:30", "9:30"};

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
