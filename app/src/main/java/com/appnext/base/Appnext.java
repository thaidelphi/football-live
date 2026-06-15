package com.appnext.base;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appnext.base.b.b;
import com.appnext.core.o;
import com.appnext.core.p;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Appnext {
    @SuppressLint({"StaticFieldLeak"})
    private static final Appnext bP = new Appnext();
    private Context bO = null;
    private boolean bQ = false;

    private Appnext() {
    }

    public static void init(Context context) {
        Appnext appnext = bP;
        if (context == null) {
            return;
        }
        try {
            if (appnext.bQ && appnext.bO != null) {
                appnext.bO = context.getApplicationContext();
                return;
            }
            appnext.bQ = true;
            com.appnext.base.b.a.init(context);
            appnext.bO = context.getApplicationContext();
            p.ac().a(new Runnable() { // from class: com.appnext.base.Appnext.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.N().init(Appnext.this.bO);
                        com.appnext.base.b.a.init(Appnext.this.bO);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable th) {
            a.a("Appnext$libInit", th);
        }
    }

    public static void setConsent(Context context, Boolean bool) {
        try {
            o.ab();
            o.a(context, bool);
        } catch (Exception unused) {
        }
    }
}
