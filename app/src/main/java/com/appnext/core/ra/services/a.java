package com.appnext.core.ra.services;

import android.content.Context;
import com.appnext.core.ra.services.a.b;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {
    private static a eI;
    private com.appnext.core.ra.services.a.a eJ;

    /* renamed from: com.appnext.core.ra.services.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum EnumC0158a {
        DownloadingConfig,
        SendRA,
        StoreRa
    }

    private a(Context context) {
        try {
            this.eJ = new b(context);
        } catch (Throwable unused) {
        }
    }

    public static a s(Context context) {
        if (eI == null) {
            synchronized (a.class) {
                if (eI == null) {
                    eI = new a(context);
                }
            }
        }
        return eI;
    }

    public final void a(long j10) {
        try {
            this.eJ.c(j10 * 60000);
        } catch (Throwable unused) {
        }
    }

    public final void aB() {
        try {
            this.eJ.aB();
        } catch (Throwable unused) {
        }
    }

    public final void b(long j10) {
        try {
            this.eJ.b(j10 * 60000);
        } catch (Throwable unused) {
        }
    }

    public final void e(ArrayList<String> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                this.eJ.e(arrayList);
            } catch (Throwable unused) {
            }
        }
    }
}
