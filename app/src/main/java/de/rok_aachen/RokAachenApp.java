package de.rok_aachen;

import android.app.Application;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.rok_aachen.capsule.TimePlansContainer;
import de.rok_aachen.database.DBContracts;
import de.rok_aachen.database.DBHelper;
import de.rok_aachen.rest.RokRESTClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RokAachenApp extends Application {
    private final String LOG = "LOG";
    private final String VAR = "VAR";

    @Override
    public void onCreate() {
        super.onCreate();
/*
        DBHelper helper = new DBHelper(getApplicationContext(), DBContracts.DATABASE_NAME, null, DBContracts.DATABASE_VERSION);
        SQLiteDatabase database;

        try {
            database = helper.getWritableDatabase();
            helper.onUpgrade(database, 1, 1);

            ContentValues values = new ContentValues();
            values.put(DBContracts.Attributes.MONTH, "Октябрь");
            database.insert(DBContracts.MONTH_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.MONTH, "Ноябрь");
            database.insert(DBContracts.MONTH_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.MONTH, "Декабрь");
            database.insert(DBContracts.MONTH_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 5-я");
            values.put(DBContracts.Attributes.TITLE, "СПАС");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "02");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 1);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 6-я");
            values.put(DBContracts.Attributes.TITLE, "КРЕЩЕНИЕ");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "07");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 1);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 7-я");
            values.put(DBContracts.Attributes.TITLE, "РОЖДЕСТВО");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "11");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 1);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 8-я");
            values.put(DBContracts.Attributes.TITLE, "ЯВЛЕНИЕ");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "12");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 1);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 9-я");
            values.put(DBContracts.Attributes.TITLE, "ПАСХА");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "15");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 1);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            // === Second Month ==========

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 5-я");
            values.put(DBContracts.Attributes.TITLE, "СПАС");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "02");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 2);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 6-я");
            values.put(DBContracts.Attributes.TITLE, "КРЕЩЕНИЕ");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "07");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 2);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 7-я");
            values.put(DBContracts.Attributes.TITLE, "РОЖДЕСТВО");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "11");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 2);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 8-я");
            values.put(DBContracts.Attributes.TITLE, "ЯВЛЕНИЕ");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "12");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 2);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 9-я");
            values.put(DBContracts.Attributes.TITLE, "ПАСХА");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "15");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 2);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();


            // ======== THIRD MONTH ===========

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 5-я");
            values.put(DBContracts.Attributes.TITLE, "СПАС");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "02");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 3);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 6-я");
            values.put(DBContracts.Attributes.TITLE, "КРЕЩЕНИЕ");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "07");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 3);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 7-я");
            values.put(DBContracts.Attributes.TITLE, "РОЖДЕСТВО");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "11");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 3);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 8-я");
            values.put(DBContracts.Attributes.TITLE, "ЯВЛЕНИЕ");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "12");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 3);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();

            values.put(DBContracts.Attributes.OVERHEAD, "Неделя 9-я");
            values.put(DBContracts.Attributes.TITLE, "ПАСХА");
            values.put(DBContracts.Attributes.SUBTITLE, "Утреня, Часы и Божественная Литургия");
            values.put(DBContracts.Attributes.BEGINNING_TIME, "9:30");
            values.put(DBContracts.Attributes.DAY, "15");
            values.put(DBContracts.Attributes.WEEKDAY, "Воскресенье");
            values.put(DBContracts.Attributes.MONTH, 3);

            database.insert(DBContracts.TP_TABLE_NAME, null, values);
            values.clear();
            database.close();

        } catch (SQLiteException e) {
            Log.e("LOG", e.getMessage());
        }*/
    }
}
