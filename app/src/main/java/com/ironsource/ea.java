package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ea {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17203a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f17204b = new Object();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public static /* synthetic */ SQLiteDatabase a(ea eaVar, boolean z10, SQLiteOpenHelper sQLiteOpenHelper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return eaVar.a(z10, sQLiteOpenHelper);
    }

    public final SQLiteDatabase a(SQLiteOpenHelper sqliteOpenHelper) {
        kotlin.jvm.internal.n.f(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public final SQLiteDatabase a(boolean z10, SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase writableDatabase;
        kotlin.jvm.internal.n.f(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f17204b) {
            writableDatabase = z10 ? sqliteOpenHelper.getWritableDatabase() : sqliteOpenHelper.getReadableDatabase();
        }
        return writableDatabase;
    }
}
