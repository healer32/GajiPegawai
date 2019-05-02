package com.example.gajipegawai;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gajipegawai.database.DataSource;
import com.example.gajipegawai.model.GajiPegawai;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    DataSource mDataSource;
    EditText inpNama,inpGaji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inpGaji = (EditText) findViewById(R.id.etGaji);
        inpNama = (EditText) findViewById(R.id.etNama);
        mDataSource = new DataSource(this);
        mDataSource.open();
        Toast.makeText(this, "database created", Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view){
        GajiPegawai item = new GajiPegawai();
        item.setItemId(UUID.randomUUID().toString());
        item.setItemName(inpNama.getText().toString());
        item.setHarga(Double.parseDouble(inpGaji.getText().toString()));

        try {
            mDataSource.createItem(item);
            Toast.makeText(this, "Item berhasil ditambah.", Toast.LENGTH_SHORT).show();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDataSource.open();
    }
}