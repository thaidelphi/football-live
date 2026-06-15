package com.appnext.core;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n {
    private static final String dx = "n";
    private static volatile n dy;
    private Context aO;
    private SharedPreferences bT;

    private n(Context context) {
        if (context == null) {
            return;
        }
        this.aO = context;
        this.bT = context.getSharedPreferences("sp_response_preferences", 0);
    }

    public static n i(Context context) {
        if (dy == null) {
            synchronized (n.class) {
                if (dy == null) {
                    dy = new n(context.getApplicationContext());
                }
            }
        }
        return dy;
    }

    public final long a(String str, long j10) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                return sharedPreferences.getLong(str, 0L);
            }
            return 0L;
        } catch (Throwable th) {
            com.appnext.base.a.a("SPResponse$getLong", th);
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
            com.appnext.base.a.a("SPResponse$putLong", th);
        }
    }

    public final String c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
        } catch (Throwable th) {
            com.appnext.base.a.a("SPResponse$getString", th);
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
            com.appnext.base.a.a("SPResponse$putString", th);
        }
    }

    public final int a(String str, int i10) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                return sharedPreferences.getInt(str, 0);
            }
            return 0;
        } catch (Throwable th) {
            com.appnext.base.a.a("SPResponse$getInt", th);
            return 0;
        }
    }

    public final void b(String str, int i10) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt(str, i10).apply();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("SPResponse$putInt", th);
        }
    }

    public final boolean a(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(str, true);
            }
            return true;
        } catch (Throwable th) {
            com.appnext.base.a.a("SPResponse$getBoolean", th);
            return true;
        }
    }

    public final void b(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferences = this.bT;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(str, z10).apply();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("SPResponse$putBoolean", th);
        }
    }
}
