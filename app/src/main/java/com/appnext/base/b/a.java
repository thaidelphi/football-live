package com.appnext.base.b;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    @SuppressLint({"StaticFieldLeak"})
    private static Context bS;

    public static Context getContext() {
        return bS;
    }

    public static String getPackageName() {
        return bS.getPackageName();
    }

    public static void init(Context context) {
        if (context != null) {
            bS = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("context shouldn't be null");
    }
}
