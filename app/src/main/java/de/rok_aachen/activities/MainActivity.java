package de.rok_aachen.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import de.rok_aachen.R;
import de.rok_aachen.RokAachenApp;
import de.rok_aachen.capsule.TimePlansContainer;
import de.rok_aachen.database.DBContracts;
import de.rok_aachen.database.DBHelper;
import de.rok_aachen.rest.CallbackRok;
import de.rok_aachen.rest.RokRESTClient;
import de.rok_aachen.rest.json.Root;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private final String LOG = "LOG";
    private final String VAR = "VAR";
    private final String ERR = "ERR";

    private Document document = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG, "MainActivity::onCreate (before)");

        Button btn = (Button) findViewById(R.id.btn_show_worship);
        btn.setOnClickListener(this::onClick);

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
            database.close();

        } catch (SQLiteException e) {
            Log.e("LOG", e.getMessage());
        }
    }

    public void onClick(View v){
        Intent intent = new Intent(this, WorshipTimetableActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "MainActivity::onStart");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LOG, "MainActivity::onPostCreate");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "MainActivity::onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "MainActivity::onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "MainActivity::onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG, "MainActivity::onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "MainActivity::onDestroy");
    }

}