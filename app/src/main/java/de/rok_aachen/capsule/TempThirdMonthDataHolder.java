package de.rok_aachen.capsule;

public class TempThirdMonthDataHolder {
    String[] titles = {"Священномученика Иринея, епископа Лионского.", "Усекновение главы Пророка, Предтечи и Крестителя Господня Иоанна", "Перенесение мощей святого благоверного Великого князя Александра Невского", "Церковное Новолетие (начало индикта)", "Воспоминание чуда архистратига Михаила в Хонех", "РОЖДЕСТВО ПРЕСВЯТОЙ БОГОРОДИЦЫ", "Мучеников Илии, Зотика, Лукиана и Валериана", "ВОЗДВИЖЕНИЕ КРЕСТА ГОСПОДНЯ", "Святых мучениц Веры, Надежды, Любови и матери их Софии"};
    String[] days = {"5", "11", "12", "14", "19", "21", "26", "27", "30"};
    String[] weekdays = {"воскресенье", "суббота", "воскресенье", "вторник", "воскресенье", "вторник", "воскресенье", "понедельник", "четверг"};
    String[] overheads = {"Неделя 11-я по Пятидесятнице", "Седмица", "Неделя 12-я по Пятидесятнице", "Седмица", "Неделя 13-я по Пятидесятнице", "Седмица", "Неделя 14-я по Пятидесятнице", "Седмица", "Седмица"};
    String[] subtitles = {"Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Молебен на начало учебного года", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия", "Утреня, Часы и Божественная Литургия"};
    String[] start_times = {"9:30", "9:30", "9:30", "11:00", "9:30", "9:30", "9:30", "9:30", "9:30"};

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
