package com.startapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.ironsource.b9;
import com.ironsource.ug;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f6 extends z1 {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f21948c = {ug.f21009x};

    public f6(Context context) {
        super(context, "StartApp-ac51a09f00e0f80c");
    }

    public final void a(String str, String str2, long j10, long j11) {
        long j12;
        SQLiteDatabase a10 = a();
        a10.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            String[] strArr = f21948c;
            Cursor query = a10.query("requests", strArr, "value=?", new String[]{str}, null, null, null);
            long j13 = -1;
            if (query == null || !query.moveToFirst()) {
                if (query != null) {
                    query.close();
                }
                j12 = -1;
            } else {
                j12 = query.getLong(0);
                query.close();
            }
            if (j12 < 0) {
                contentValues.clear();
                contentValues.put(b9.h.X, str);
                j12 = a10.insert("requests", null, contentValues);
            }
            long j14 = j12;
            Cursor query2 = a10.query("statuses", strArr, "value=?", new String[]{str2}, null, null, null);
            if (query2 != null && query2.moveToFirst()) {
                j13 = query2.getLong(0);
                query2.close();
            } else if (query2 != null) {
                query2.close();
            }
            if (j13 < 0) {
                contentValues.clear();
                contentValues.put(b9.h.X, str2);
                j13 = a10.insert("statuses", null, contentValues);
            }
            contentValues.clear();
            contentValues.put("requestId", Long.valueOf(j14));
            contentValues.put("statusId", Long.valueOf(j13));
            contentValues.put("timeMillis", Long.valueOf(j10));
            contentValues.put("durationNanos", Long.valueOf(j11));
            a10.insert("traces", null, contentValues);
            a10.setTransactionSuccessful();
        } finally {
            a10.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS requests (id INTEGER PRIMARY KEY ASC AUTOINCREMENT NOT NULL,value TEXT NOT NULL UNIQUE,CHECK (value = TRIM(value) AND LENGTH(value) > 0));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS statuses (id INTEGER PRIMARY KEY ASC AUTOINCREMENT NOT NULL,value TEXT NOT NULL UNIQUE,CHECK (value = TRIM(value) AND LENGTH(value) > 0));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS traces (requestId INTEGER NOT NULL,statusId INTEGER NOT NULL,timeMillis INTEGER NOT NULL,durationNanos INTEGER NOT NULL,FOREIGN KEY (requestId)REFERENCES requests (requestId)ON UPDATE CASCADE ON DELETE CASCADE,FOREIGN KEY (statusId)REFERENCES statuses (statusId)ON UPDATE CASCADE ON DELETE CASCADE,CHECK (timeMillis > 0),CHECK (durationNanos > 0));");
    }
}
