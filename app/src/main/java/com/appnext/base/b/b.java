package com.appnext.base.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
@SuppressLint({"CommitPrefEdits"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {
    @SuppressLint({"StaticFieldLeak"})
    private static final b bU = new b();
    private Context aO;
    private SharedPreferences bT;

    private b() {
        Context context = a.getContext();
        this.aO = context;
        if (context != null) {
            this.bT = context.getSharedPreferences("LibrarySettings", 0);
        }
    }

    public static b N() {
        return bU;
    }

    public final long a(String str, long j10) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                return sharedPreferences.getLong(str, 0L);
            }
            return 0L;
        } catch (Throwable th) {
            com.appnext.base.a.a("LibrarySettings$getLong", th);
            return 0L;
        }
    }

    public final void b(String str, long j10) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str, j10).apply();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("LibrarySettings$putLong", th);
        }
    }

    public final String c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
        } catch (Throwable th) {
            com.appnext.base.a.a("LibrarySettings$getString", th);
            return str2;
        }
    }

    public final void d(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("LibrarySettings$putString", th);
        }
    }

    public final void init(Context context) {
        if (context == null) {
            return;
        }
        this.aO = context;
        this.bT = context.getSharedPreferences("lib_shared_preferences", 0);
    }
}
