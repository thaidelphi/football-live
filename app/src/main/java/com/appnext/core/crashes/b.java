package com.appnext.core.crashes;

import android.content.Context;
import com.appnext.core.p;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {
    private static b eb;
    private Context aO;

    private b(Context context) {
        this.aO = context;
    }

    public static b n(Context context) {
        if (eb == null) {
            synchronized (b.class) {
                if (eb == null) {
                    eb = new b(context);
                }
            }
        }
        return eb;
    }

    public final void l(final String str, final String str2) {
        Context context = this.aO;
        if (context == null) {
            try {
                p.ac().a(new Runnable() { // from class: com.appnext.core.crashes.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            new a(b.this.aO, str, str2).ah();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                });
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        CrashesReportWorkManagerService.a(context, str, str2);
    }
}
