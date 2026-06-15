package com.appnext.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s {
    private static final long dO = TimeUnit.DAYS.toMillis(30);
    private static s dP;
    private String dQ = "";

    private s() {
    }

    public static s af() {
        if (dP == null) {
            synchronized (s.class) {
                if (dP == null) {
                    dP = new s();
                }
            }
        }
        return dP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(Context context) {
        if (context != null) {
            try {
                com.appnext.base.b.b.N().d("userAgent", WebSettings.getDefaultUserAgent(context.getApplicationContext()));
                com.appnext.base.b.b.N().b("userAgentStoreDate", System.currentTimeMillis());
            } catch (Throwable unused) {
            }
        }
    }

    public final String k(final Context context) {
        try {
            if (!TextUtils.isEmpty(this.dQ)) {
                return this.dQ;
            }
            this.dQ = com.appnext.base.b.b.N().c("userAgent", "");
            p.ac().a(new Runnable() { // from class: com.appnext.core.s.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        long a10 = com.appnext.base.b.b.N().a("userAgentStoreDate", 0L);
                        if (TextUtils.isEmpty(s.this.dQ) || System.currentTimeMillis() - s.dO < a10) {
                            s.l(context);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            return this.dQ;
        } catch (Throwable unused) {
            return this.dQ;
        }
    }
}
