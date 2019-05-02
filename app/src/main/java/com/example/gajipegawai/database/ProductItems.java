package com.example.gajipegawai.database;

public class ProductItems {
    public static final String TABLE_KARYAWAN = "Karyawan";
    public static final String COLUMN_ID = "Id";
    public static final String COLUMN_NAMA = "NamaPegawai";
    public static final String COLUMN_GAJI = "gaji";
    public static final String[] SEMUA_COLUMNS =
            {COLUMN_ID, COLUMN_NAMA,COLUMN_GAJI};
    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_KARYAWAN + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_NAMA + " TEXT," +
                    COLUMN_GAJI + " REAL" + ");";
    public static final String SQL_DELETE =
            "DROP TABLE " + TABLE_KARYAWAN;
}