package com.taxi.db;

import android.os.Debug;
import android.util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: anton
 * Date: 08.04.13
 * Time: 14:02
 * To change this template use File | Settings | File Templates.
 */
public class TaxiTables {

    public static String TAG = TaxiTables.class.getSimpleName();
    public static boolean IS_DEBUG= true;

    public static class Taxi{


       public static final String Table_Name = "taxi";
       public static final String ID = "_id";
       public static final String Name = "taxi_name";
       public static final String Phone = "pahone";
       public static final String Comment = "comment";

        public static String getCreateTableString() {
            if (IS_DEBUG){
                Log.i(TAG, "CREATE TABLE STRING "+ CREATE_TABLE_STRING);
            }

            return CREATE_TABLE_STRING;
        }

        private static final String CREATE_TABLE_STRING ="CREATE TABLE " + Table_Name +" ("
               + ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"
               + Name + " TEXT, "
               + Phone + " TEXT,"
               + Comment + " INTEGER );";
    }

    public class Comment{
        public static final String ID = "_id";
        public static final String Text = "text";
    }
}
