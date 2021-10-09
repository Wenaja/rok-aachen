package de.rok_aachen.capsule;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import de.rok_aachen.database.DBContracts;
import de.rok_aachen.database.DBHelper;

public class WorshipViewModel extends ViewModel {
    private Context context = null;
    private SQLiteDatabase database = null;
    private MutableLiveData<TimePlansContainer[]> liveData = null;

    public void initialize(Context context) {
        if (liveData == null) {
            liveData = new MutableLiveData<>();
            TimePlansContainer[] timePlansContainer = new TimePlansContainer[3];
            timePlansContainer[0] = new TimePlansContainer();
            timePlansContainer[1] = new TimePlansContainer();
            timePlansContainer[2] = new TimePlansContainer();
            liveData.setValue(timePlansContainer);
        }

        this.context = context;
    }

    public MutableLiveData<TimePlansContainer[]> getLiveData() {
        return liveData;
    }

    private TimePlansContainer[] getTimePlansContainers(){
        DBHelper dbHelper = new DBHelper(context, DBContracts.DATABASE_NAME, null, DBContracts.DATABASE_VERSION);
        database = dbHelper.getReadableDatabase();

        Cursor month_cursor = database.query(DBContracts.MONTH_TABLE_NAME, null, null, null, null, null, null);

        TimePlansContainer[] timePlansContainers = new TimePlansContainer[3];

        if (month_cursor.moveToFirst()) {
            int i = 0;
            int mId = month_cursor.getColumnIndex(DBContracts.Attributes.ID);
            int mName = month_cursor.getColumnIndex(DBContracts.Attributes.MONTH);

            do {
                if (i < timePlansContainers.length) {
                    timePlansContainers[i] = new TimePlansContainer(
                            month_cursor.getInt(mId),
                            month_cursor.getString(mName),
                            new ArrayList<TimePlan>()
                    );
                    i++;
                }
            }while (month_cursor.moveToNext());
        }

        month_cursor.close();

        return timePlansContainers;
    }

    public LiveData<TimePlansContainer[]> getTimePlansContainerArray() {
        TimePlansContainer[] timePlansContainers = getTimePlansContainers();
        Cursor tp_cursor = database.query(DBContracts.TP_TABLE_NAME, null, null, null, null, null, null);

        int iOver = tp_cursor.getColumnIndex(DBContracts.Attributes.OVERHEAD);
        int iTitle = tp_cursor.getColumnIndex(DBContracts.Attributes.TITLE);
        int iSub = tp_cursor.getColumnIndex(DBContracts.Attributes.SUBTITLE);
        int iTime = tp_cursor.getColumnIndex(DBContracts.Attributes.BEGINNING_TIME);
        int iDay = tp_cursor.getColumnIndex(DBContracts.Attributes.DAY);
        int iWeekday = tp_cursor.getColumnIndex(DBContracts.Attributes.WEEKDAY);
        int iMonth = tp_cursor.getColumnIndex(DBContracts.Attributes.MONTH);

        for (TimePlansContainer tpc : timePlansContainers) {
            if (tp_cursor.moveToFirst()){

                do{
                    if (tp_cursor.getInt(iMonth) == tpc.getId()){
                        tpc.getTimePlanList().add(
                                new TimePlan(
                                        tp_cursor.getString(iOver),
                                        tp_cursor.getString(iTitle),
                                        tp_cursor.getString(iSub),
                                        tp_cursor.getString(iTime),
                                        tp_cursor.getString(iDay),
                                        tp_cursor.getString(iWeekday)
                                )
                        );
                    }
                }while (tp_cursor.moveToNext());
            }
        }

        liveData.setValue(timePlansContainers);
        tp_cursor.close();

        return liveData;
    }

    public void closeDatabase(){
        if (database != null) {
            database.close();
        }
    }

    @Override
    public String toString() {
        return "WorshipViewModel{" +
                "database=" + database +
                ", timePlansContainerList=" + liveData.getValue().length + " Elements" +
                '}';
    }
}
