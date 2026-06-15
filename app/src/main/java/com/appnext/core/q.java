package com.appnext.core;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q {
    private static volatile q dI;

    public static q ad() {
        if (dI == null) {
            synchronized (q.class) {
                if (dI == null) {
                    dI = new q();
                }
            }
        }
        return dI;
    }

    public static String j(Context context) {
        String c10 = System.currentTimeMillis() < n.i(context).a("translateServerResponseAcceptedTime", 0L) + 604800000 ? n.i(context).c("translateServerResponses", null) : "";
        if (TextUtils.isEmpty(c10)) {
            try {
                c10 = i.a(context, "https://cdn.appnext.com/tools/sdk/langs/2.4.4/langs.json", null);
                if (!TextUtils.isEmpty(c10)) {
                    n.i(context).d("translateServerResponses", c10);
                    n.i(context).b("translateServerResponseAcceptedTime", System.currentTimeMillis());
                }
            } catch (Throwable unused) {
            }
        }
        return c10;
    }
}
