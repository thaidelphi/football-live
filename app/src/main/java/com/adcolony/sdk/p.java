package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.e0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.insertOrThrow(str, null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e8) {
                e0.a aVar = new e0.a();
                e0.a a10 = aVar.a("Exception on insert to " + str + ", db version:").a(sQLiteDatabase.getVersion());
                a10.a(". Values: " + contentValues.toString() + " caused: ").a(e8.toString()).a(e0.f5979g);
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            e0.a aVar2 = new e0.a();
            e0.a a11 = aVar2.a("Error on insert to " + str + ", db version:").a(sQLiteDatabase.getVersion());
            a11.a(". Values: " + contentValues.toString() + " caused: ").a(th.toString()).a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, long j10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                if (str == null) {
                    str = "rowid";
                    j10 = -1;
                }
                if (i10 >= 0) {
                    Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i10, null);
                    if (rawQuery.moveToFirst()) {
                        j10 = Math.max(j10, rawQuery.getLong(0));
                    }
                    rawQuery.close();
                }
                if (j10 >= 0) {
                    sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j10);
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e8) {
                new e0.a().a("Exception on deleting excessive rows:").a(e8.toString()).a(e0.f5979g);
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            new e0.a().a("Error on deleting excessive rows:").a(th.toString()).a(e0.f5981i);
        }
    }
}
