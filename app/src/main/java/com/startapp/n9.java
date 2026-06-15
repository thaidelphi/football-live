package com.startapp;

import android.webkit.WebView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f22336a;

    public n9(WebView webView) {
        this.f22336a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22336a.destroy();
        } catch (Throwable unused) {
        }
    }
}
