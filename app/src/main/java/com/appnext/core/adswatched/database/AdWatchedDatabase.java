package com.appnext.core.adswatched.database;

import android.content.Context;
import androidx.room.n0;
import androidx.room.q0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class AdWatchedDatabase extends q0 {
    private static final String DB_NAME = "AdWatchDatabase_Impl.db";
    private static volatile AdWatchedDatabase instance;

    private static AdWatchedDatabase create(Context context) {
        return (AdWatchedDatabase) n0.a(context, AdWatchedDatabase.class, DB_NAME).d();
    }

    public static synchronized AdWatchedDatabase getInstance(Context context) {
        AdWatchedDatabase adWatchedDatabase;
        synchronized (AdWatchedDatabase.class) {
            if (instance == null) {
                instance = create(context);
            }
            adWatchedDatabase = instance;
        }
        return adWatchedDatabase;
    }

    public abstract a adWatchedDao();
}
