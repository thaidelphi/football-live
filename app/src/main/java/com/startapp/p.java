package com.startapp;

import android.content.DialogInterface;
import android.webkit.WebView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f22365a;

    public p(WebView webView) {
        this.f22365a = webView;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f22365a.stopLoading();
    }
}
