package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class r {

    /* renamed from: a  reason: collision with root package name */
    private s f20461a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20462b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        this.f20461a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f20462b) {
            return "";
        }
        this.f20462b = true;
        return this.f20461a.b();
    }
}
