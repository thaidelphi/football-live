package com.appnext.core.ra.database;

import android.content.Context;
import androidx.room.n0;
import androidx.room.q0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class RecentAppsDatabase extends q0 {
    private static final String DB_NAME = "RecentAppsDatabase_Impl.db";
    private static volatile RecentAppsDatabase instance;

    private static RecentAppsDatabase create(Context context) {
        return (RecentAppsDatabase) n0.a(context, RecentAppsDatabase.class, DB_NAME).d();
    }

    public static synchronized RecentAppsDatabase getInstance(Context context) {
        RecentAppsDatabase recentAppsDatabase;
        synchronized (RecentAppsDatabase.class) {
            if (instance == null) {
                instance = create(context);
            }
            recentAppsDatabase = instance;
        }
        return recentAppsDatabase;
    }

    public abstract b recentAppDao();
}
