package de.rok_aachen.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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

    private Toolbar toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(LOG, "MainActivity::onCreate()");

        toolbar = (Toolbar) findViewById(R.id.main_activity_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getString(R.string.str_title_activity_main));
        toolbar.setTitleTextColor(getColor(R.color.white));

        Button btn = (Button) findViewById(R.id.btn_show_worship);
        btn.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        Intent intent = new Intent(this, WorshipTimetableActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(LOG, "MainActivity::onStart");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.v(LOG, "MainActivity::onPostCreate");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(LOG, "MainActivity::onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(LOG, "MainActivity::onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(LOG, "MainActivity::onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(LOG, "MainActivity::onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(LOG, "MainActivity::onDestroy()");
    }

}