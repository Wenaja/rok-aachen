package de.rok_aachen.capsule;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TimePlansContainer {
    private int id;
    private String month = null;
    private List<TimePlan> timePlanList = null;

    public TimePlansContainer() {
        id = -1;
    }

    public TimePlansContainer(int id, String month, List<TimePlan> timePlanList){
        this.id = id;
        this.month = month;
        this.timePlanList = timePlanList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        if (month == null) {
            month = "Илурий";
        }

        return month;
    }

    public List<TimePlan> getTimePlanList() {
        if(timePlanList == null){
            timePlanList = new ArrayList<>();
        }

        return timePlanList;
    }

    public void setTimePlanList(List<TimePlan> timePlanList) {
        this.timePlanList = timePlanList;
    }

    private void normalizeMonths(){
        String normMonth;
        String[] split = new String[0];

        if(month.contains(" ")){
            split = month.split(" ");
            normMonth = split[0];
        }else {
            normMonth = month;
        }

        switch (normMonth){
            case "Января":
                month = "Январь";
                break;
            case "Февраля":
                month = "Февраль";
                break;
            case "Марта":
                month = "Март";
                break;
            case "Апреля":
                month = "Апрель";
                break;
            case "Мая":
                month = "Май";
                break;
            case "Июня":
                month = "Июнь";
                break;
            case "Июля":
                month = "Июль";
                break;
            case "Августа":
                month = "Август";
                break;
            case "Сентября":
                month = "Сентябрь";
                break;
            case "Октября":
                month = "Октябрь";
                break;
            case "Ноября":
                month = "Ноябрь";
                break;
            case "Декабря":
                month = "Декабрь";
                break;
            default:
                month = (split.length >0) ? split[0] : "no agreement";
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimePlansContainer that = (TimePlansContainer) o;
        return id == that.id && month.equals(that.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month);
    }

    @Override
    public String toString() {
        return "TimePlansContainer{" +
                "id=" + id +
                ", month='" + month + '\'' +
                '}';
    }
}
