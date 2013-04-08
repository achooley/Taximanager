package com.taxi.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created with IntelliJ IDEA.
 * User: anton
 * Date: 08.04.13
 * Time: 17:51
 * To change this template use File | Settings | File Templates.
 */
public class TaxiDBManager {
    TaxiDbHelper Dbhelper;

    private TaxiDBManager(Context context) {

        Dbhelper = new TaxiDbHelper(context);
    }

    public void AddNewTaxi(String Name, String Phone, String Comment){
        SQLiteDatabase sd = Dbhelper.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(TaxiTables.Taxi.Name, Name);
        cv.put(TaxiTables.Taxi.Phone, Phone);
        cv.put(TaxiTables.Taxi.Comment, Comment);
        sd.insert(TaxiTables.Taxi.Table_Name, null, cv);
        sd.close();
    }
}
