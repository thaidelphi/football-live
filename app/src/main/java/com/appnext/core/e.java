package com.appnext.core;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {
    private static volatile e cu;

    public static e R() {
        if (cu == null) {
            synchronized (e.class) {
                if (cu == null) {
                    cu = new e();
                }
            }
        }
        return cu;
    }

    public static String a(Context context, String str, String str2, long j10, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String str6 = "adsServerResponseAuid" + str2;
        String str7 = "adsServerResponseAcceptedTimeAuid" + str2;
        String c10 = (TextUtils.isEmpty(str4.trim()) && TextUtils.isEmpty(str5.trim()) && System.currentTimeMillis() < n.i(context).a(str7, 0L) + (60000 * j10)) ? n.i(context).c(str6, null) : "";
        if (TextUtils.isEmpty(c10)) {
            try {
                if (TextUtils.isEmpty(str4.trim()) && TextUtils.isEmpty(str5.trim())) {
                    com.appnext.core.adswatched.a.m(context).k(str, str2);
                }
                c10 = i.a(context, str3, null, 16000);
                if (TextUtils.isEmpty(str4.trim()) && TextUtils.isEmpty(str5.trim())) {
                    if (!TextUtils.isEmpty(c10) && !c10.equals("{\"apps\":[]}")) {
                        n.i(context).d(str6, c10);
                        n.i(context).b(str7, System.currentTimeMillis());
                    } else {
                        n.i(context).d(str6, "");
                        n.i(context).b(str7, 0L);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return c10;
    }
}
