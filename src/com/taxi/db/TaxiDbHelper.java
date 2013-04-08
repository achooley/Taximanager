package com.taxi.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created with IntelliJ IDEA.
 * User: anton
 * Date: 08.04.13
 * Time: 14:18
 * To change this template use File | Settings | File Templates.
 */
public class TaxiDbHelper extends SQLiteOpenHelper {

    public static final String TAG = TaxiDbHelper.class.getSimpleName();
    public static final String DATABASE_NAME = "taxi.db";
    public static final int DATABASE_VERSION = 1;

    public TaxiDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(TaxiTables.Taxi.getCreateTableString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void AddTaxi(){
        SQLiteDatabase sd = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(TaxiTables.Taxi.Name, "allo");
        cv.put(TaxiTables.Taxi.Phone, "098-345-543-5");
        cv.put(TaxiTables.Taxi.Comment, "Hello friiend");
        sd.insert(TaxiTables.Taxi.Table_Name, null, cv);

    }

}
