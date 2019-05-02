package com.example.gajipegawai.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String NAMA_FILE_DB = "karyawan.db";
    public static final int VERSI_DB = 1;
    public DBHelper(Context context) {
        super(context, NAMA_FILE_DB, null, VERSI_DB);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ProductItems.SQL_CREATE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ProductItems.SQL_DELETE);
    }
}