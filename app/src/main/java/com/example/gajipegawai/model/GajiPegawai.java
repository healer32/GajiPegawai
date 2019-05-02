package com.example.gajipegawai.model;

import android.content.ContentValues;

import com.example.gajipegawai.database.ProductItems;

public class GajiPegawai {
    private String itemId;
    private String itemName;
    private Double harga;
    public GajiPegawai() {
    }
    public GajiPegawai(String itemId, String itemName, Double harga) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.harga = harga;
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Double getHarga() {
        return harga;
    }
    public void setHarga(Double harga) {
        this.harga = harga;
    }
    public ContentValues toValues() {
        ContentValues values = new ContentValues(3);
        values.put(ProductItems.COLUMN_ID, itemId);
        values.put(ProductItems.COLUMN_NAMA, itemName);
        values.put(ProductItems.COLUMN_GAJI, harga);
        return values;
    }
    @Override
    public String toString() {
        return "GajiPegawai{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", harga=" + harga +
                '}';
    }
}