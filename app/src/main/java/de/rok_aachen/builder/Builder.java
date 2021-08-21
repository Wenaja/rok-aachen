package de.rok_aachen.builder;

import java.util.ArrayList;
import java.util.List;

import de.rok_aachen.capsule.TempFirstMonthDataHolder;
import de.rok_aachen.capsule.TempSecondMonthDataHolder;
import de.rok_aachen.capsule.TempThirdMonthDataHolder;
import de.rok_aachen.capsule.TimePlanEntriesHolder;
import de.rok_aachen.capsule.TimePlanHolder;

public abstract class Builder {
    TempFirstMonthDataHolder firstMonthData = new TempFirstMonthDataHolder();
    TempSecondMonthDataHolder secondMonthData = new TempSecondMonthDataHolder();
    TempThirdMonthDataHolder thirdMonthData = new TempThirdMonthDataHolder();

    public void method(){

    }
}
