package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import g9.a0;
import i8.w;
import m8.d;
/* compiled from: WebViewBridge.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface WebViewBridge {
    a0<Invocation> getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, d<? super Object[]> dVar);

    Object sendEvent(WebViewEvent webViewEvent, d<? super w> dVar);
}
