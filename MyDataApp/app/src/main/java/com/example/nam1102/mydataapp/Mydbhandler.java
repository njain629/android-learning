package com.example.nam1102.mydataapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nam1102 on 21/1/18.
 */

public class Mydbhandler extends SQLiteOpenHelper {
    private static final int db_version=1;
    private static final String db_name="product.db";
    public static final String table_products="product";
    public static final String col_id="_id";
    public static final String col_pname="_name";

    public Mydbhandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, db_name, factory, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="CREATE TABLE "+table_products+" ( "+ col_id +" INTEGER PRIMARY KEY AUTOINCREMENT, "
                + col_pname+" TEXT "+");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+table_products);
        onCreate(db);
    }

    public void addproduct(product p){
        ContentValues v= new ContentValues();
        v.put(col_pname,p.get_name());

        SQLiteDatabase db= getWritableDatabase();
        db.insert(table_products,null,v);
        db.close();
    }
    public void deleteproduct(String pname){

        SQLiteDatabase db= getWritableDatabase();
        db.execSQL("DELETE FROM "+table_products+" WHERE "+ col_pname+" =\""+ pname+"\";");

        db.close();
    }
    public String dbtostring(){
        String dbstring="";
        SQLiteDatabase db=getWritableDatabase();
        String query="SELECT * FROM "+table_products+" WHERE 1";
        Cursor c=db.rawQuery(query,null);
        c.moveToFirst();

        while (!c.isAfterLast()){
            if (c.getString(c.getColumnIndex("pname"))!=null){
                dbstring+=c.getString(c.getColumnIndex("pname"));
                dbstring+="\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbstring;
    }

}
