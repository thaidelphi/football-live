package com.unity3d.ads.adplayer;

import android.view.InputEvent;
import g9.j0;
import i8.w;
import m8.d;
/* compiled from: WebViewContainer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, d<? super w> dVar);

    Object destroy(d<? super w> dVar);

    Object evaluateJavascript(String str, d<? super w> dVar);

    j0<InputEvent> getLastInputEvent();

    Object loadUrl(String str, d<? super w> dVar);
}
