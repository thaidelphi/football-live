package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class fa extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static ea f17392a = new ea();

    public fa(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static Cursor a(int i10) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a10 = f17392a.a(new fa(o9.d().a()));
            try {
                Cursor rawQuery = a10.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
                a10.close();
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = a10;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = f17392a.a(true, new fa(o9.d().a()));
            sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabase.close();
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void a(lc lcVar) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a10 = f17392a.a(true, new fa(o9.d().a()));
            try {
                a10.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String e8 = lcVar.e();
                String b10 = lcVar.b();
                String d10 = lcVar.d();
                contentValues.put("stack_trace", e8);
                contentValues.put("crash_date", b10);
                contentValues.put("crashType", d10);
                a10.insert("REPORTS", null, contentValues);
                a10.setTransactionSuccessful();
                a10.endTransaction();
                a10.close();
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = a10;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static lc b(int i10) {
        SQLiteDatabase a10;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            a10 = f17392a.a(new fa(o9.d().a()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = a10.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
            int i11 = rawQuery.getInt(0);
            String string = rawQuery.getString(1);
            String string2 = rawQuery.getString(2);
            String string3 = rawQuery.getString(3);
            rawQuery.close();
            lc lcVar = new lc(i11, string, string2, string3);
            a10.close();
            return lcVar;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = a10;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static List<lc> b() {
        SQLiteDatabase a10;
        fa faVar = new fa(o9.d().a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            a10 = f17392a.a(faVar);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = a10.rawQuery("SELECT * FROM REPORTS ;", null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                a10.close();
                return arrayList;
            }
            do {
                arrayList.add(new lc(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3)));
            } while (rawQuery.moveToNext());
            rawQuery.close();
            a10.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = a10;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static Cursor c() {
        fa faVar = new fa(o9.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a10 = f17392a.a(faVar);
            try {
                Cursor rawQuery = a10.rawQuery("SELECT * FROM REPORTS;", null);
                a10.close();
                return rawQuery;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = a10;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
