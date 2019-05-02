package com.example.gajipegawai.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.gajipegawai.model.GajiPegawai;

public class DataSource {
    private Context mContext;
    private SQLiteDatabase mDatabase;
    SQLiteOpenHelper mDbHelper;
    public DataSource(Context context) {
        this.mContext = context;
        mDbHelper = new DBHelper(mContext);
        mDatabase = mDbHelper.getWritableDatabase();
    }
    public GajiPegawai createItem(GajiPegawai item) {
        ContentValues values = item.toValues();
        mDatabase.insert(ProductItems.TABLE_KARYAWAN, null, values);
        return item;
    }
    public void open(){
        mDatabase = mDbHelper.getWritableDatabase();
    }
    public void close(){
        mDbHelper.close();
    }
}