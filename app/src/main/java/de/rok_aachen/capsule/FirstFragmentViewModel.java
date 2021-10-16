package de.rok_aachen.capsule;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class FirstFragmentViewModel extends ViewModel {
    private List<TimePlan> timePlanList = null;

    public void setTimePlanList(List<TimePlan> timePlanList){
        this.timePlanList = timePlanList;
    }

    public List<TimePlan> getTimePlanList() {
        if (timePlanList == null) {
            timePlanList = new ArrayList<>();
        }

        return timePlanList;
    }
}
