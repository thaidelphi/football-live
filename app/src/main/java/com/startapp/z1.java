package com.startapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class z1 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public volatile SQLiteDatabase f23654a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f23655b;

    public z1(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f23655b = new Object();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase = this.f23654a;
        if (sQLiteDatabase == null) {
            synchronized (this.f23655b) {
                sQLiteDatabase = this.f23654a;
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = getWritableDatabase();
                    this.f23654a = sQLiteDatabase;
                }
            }
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
