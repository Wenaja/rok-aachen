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
    }
}
