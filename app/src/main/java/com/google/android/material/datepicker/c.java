package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
/* compiled from: DateStrings.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j10) {
        return b(j10, Locale.getDefault());
    }

    static String b(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o.b(locale).format(new Date(j10));
        }
        return o.f(locale).format(new Date(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(long j10) {
        return DateUtils.formatDateTime(null, j10, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(long j10) {
        return e(j10, Locale.getDefault());
    }

    static String e(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return o.m(locale).format(new Date(j10));
        }
        return o.f(locale).format(new Date(j10));
    }
}
