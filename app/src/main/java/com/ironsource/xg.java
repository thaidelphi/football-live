package com.ironsource;

import android.webkit.JavascriptInterface;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class xg {

    /* renamed from: a  reason: collision with root package name */
    private ah f21400a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xg(ah ahVar) {
        this.f21400a = ahVar;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f21400a.handleMessageFromAd(str);
    }
}
