package com.example.lenovog40.tcc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Lenovo G40 on 30/04/2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String BD_NAME="bd_home_giver";
    private static final int BD_VERSION=1;




    public DBHelper(Context context) {
        super(context, BD_NAME, null, BD_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table pessoa( _id integer primary key autoincrement, nome text , telefone real , endereco text, email text, senha text, cpf int, nivel_acesso boolean)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
