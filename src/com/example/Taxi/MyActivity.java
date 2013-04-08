package com.example.Taxi;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;
import com.taxi.db.TaxiDbHelper;
import com.taxi.db.TaxiTables;
public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.i("Test, ", TaxiTables.Taxi.getCreateTableString());
        TaxiDbHelper Db = new TaxiDbHelper(this);

            Db.AddTaxi();


    }
}
