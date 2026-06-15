package com.startapp;

import android.content.Context;
import android.webkit.WebView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p5 {
    public static void a(Context context, WebView webView, q5 q5Var) {
        if (q5Var == null) {
            q5Var = new q5(context);
        }
        n5.a(webView, "mraid.SUPPORTED_FEATURES.CALENDAR", q5Var.a());
        n5.a(webView, "mraid.SUPPORTED_FEATURES.INLINEVIDEO", q5Var.f22415b.contains("inlineVideo"));
        boolean z10 = true;
        n5.a(webView, "mraid.SUPPORTED_FEATURES.SMS", q5Var.f22415b.contains("sms") && y.a(q5Var.f22414a, "android.permission.SEND_SMS"));
        n5.a(webView, "mraid.SUPPORTED_FEATURES.STOREPICTURE", q5Var.f22415b.contains("storePicture"));
        if (!q5Var.f22415b.contains("tel") || !y.a(q5Var.f22414a, "android.permission.CALL_PHONE")) {
            z10 = false;
        }
        n5.a(webView, "mraid.SUPPORTED_FEATURES.TEL", z10);
    }
}
