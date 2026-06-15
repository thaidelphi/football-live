package com.startapp;

import android.content.Context;
import android.webkit.WebView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n5 {
    public static void a(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        o9.a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(Math.round(i10 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i11 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i12 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i13 / context.getResources().getDisplayMetrics().density)));
    }

    public static void b(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        o9.a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(Math.round(i10 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i11 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i12 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i13 / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(WebView webView, String str, String str2) {
        o9.a(webView, true, "mraid.fireErrorEvent", str, str2);
    }

    public static void a(WebView webView, String str, boolean z10) {
        o9.a(webView, false, "mraid.setSupports", str, Boolean.valueOf(z10));
    }
}
