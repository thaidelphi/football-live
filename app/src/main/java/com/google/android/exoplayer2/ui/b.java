package com.google.android.exoplayer2.ui;

import a5.p0;
import android.graphics.Color;
/* compiled from: HtmlUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return p0.B("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
