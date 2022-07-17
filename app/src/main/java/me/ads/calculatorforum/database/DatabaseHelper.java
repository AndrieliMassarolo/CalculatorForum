package me.ads.calculatorforum.database;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import me.ads.calculatorforum.R;

import me.ads.calculatorforum.operacoesrealizadas.Operacoesrealizadas;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "calculatorforum";
    private static final String TABLE_OPERACOESREALIZADAS = "operacoesrealizadas";

    private static final String CREATE_TABLE_OPERACOESREALIZADAS = "CREATE TABLE " + TABLE_OPERACOESREALIZADAS + " (" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "operacao VARCHAR(100)," +
            "resultado VARCHAR(100));";

    private static final String DROP_TABLE_OPERACOESREALIZADAS = "DROP TABLE IF EXISTS " + TABLE_OPERACOESREALIZADAS;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // criação das tabelas
        db.execSQL(CREATE_TABLE_OPERACOESREALIZADAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // exclusão das tabelas
        db.execSQL(DROP_TABLE_OPERACOESREALIZADAS);
        onCreate(db);
    }

//    public long createOperacoesrealizadas(Operacoesrealizadas o) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//        cv.put("val2", o.getVal2());
//        cv.put("resultado", o.getResultado());
//        long id = db.insert(TABLE_OPERACOESREALIZADAS, null, cv);
//        db.close();
//        return id;
//    }
//
//    public void getAllOperacoesRealizadas(Context context, ListView lv) {
//        SQLiteDatabase db = this.getReadableDatabase();
//        String[] columns = {"_id", "val1", "val2", "resultado"};
//        Cursor data = db.query(TABLE_OPERACOESREALIZADAS, columns, null, null, null, null, "nome");
//        int[] to = {R.id.textViewIdListarOperacoesrealizadas, R.id.textViewVal1ListarOperacoesrealizadas, R.id.textViewVal2ListarOperacoesrealizadas, R.id.textViewResultadoListarOperacoesrealizadas};
//        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(context,
//                R.layout.operacoesrealizadas_item_list_view, data, columns, to, 0);
//        lv.setAdapter(simpleCursorAdapter);
//        db.close();
//    }

//    public Operacoesrealizadas getByIdOperacoesrealizadas(int id) {
//        SQLiteDatabase db =  this.getReadableDatabase();
//        String[] columns = {"_id", "val1", "val2", "resultado"};
//        String[] args = {String.valueOf(id)};
//        Cursor data = db.query(TABLE_OPERACOESREALIZADAS, columns, "_id = ?", args, null, null, null);
//        data.moveToFirst();
//        Operacoesrealizadas o = new Operacoesrealizadas();
//        o.setId(data.getInt(0));
//        o.setVal1(data.getString(1));
//        o.setVal2(data.getString(2));
//        o.setResultado(data.getString(3));
//        data.close();
//        db.close();
//        return o;












}
