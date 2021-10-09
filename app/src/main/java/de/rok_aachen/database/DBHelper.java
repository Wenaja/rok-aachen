package de.rok_aachen.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context,
                    @Nullable String name,
                    @Nullable SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL("CREATE TABLE " + DBContracts.MONTH_TABLE_NAME + " (" +
                DBContracts.Attributes.ID + " integer primary key autoincrement, " +
                DBContracts.Attributes.MONTH + " text)");

        database.execSQL("CREATE TABLE " + DBContracts.TP_TABLE_NAME + "(" +
                DBContracts.Attributes.ID + " integer primary key autoincrement, " +
                DBContracts.Attributes.OVERHEAD + " text, " +
                DBContracts.Attributes.TITLE + " text, " +
                DBContracts.Attributes.SUBTITLE + " text, " +
                DBContracts.Attributes.BEGINNING_TIME + " text, " +
                DBContracts.Attributes.DAY + " text, " +
                DBContracts.Attributes.WEEKDAY + " text, " +
                DBContracts.Attributes.MONTH + " integer, " +
                "FOREIGN KEY (" + DBContracts.Attributes.MONTH + ") REFERENCES " + DBContracts.MONTH_TABLE_NAME + " (" + DBContracts.Attributes.ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {
        database.execSQL("DROP TABLE IF EXISTS " + DBContracts.TP_TABLE_NAME);
        database.execSQL("DROP TABLE IF EXISTS " + DBContracts.MONTH_TABLE_NAME);
        onCreate(database);
    }
}
