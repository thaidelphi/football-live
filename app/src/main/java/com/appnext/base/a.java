package com.appnext.base;

import android.text.TextUtils;
import com.appnext.core.crashes.b;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    public static void a(String str, Throwable th) {
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = th.toString();
            if (TextUtils.isEmpty(message)) {
                return;
            }
        }
        b.n(com.appnext.base.b.a.getContext()).l(str, message);
    }
}
