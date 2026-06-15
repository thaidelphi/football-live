package com.unity3d.services.core.webview.bridge;
/* compiled from: IWebViewBridge.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface IWebViewBridge {
    void handleCallback(String str, String str2, Object[] objArr) throws Exception;

    void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception;
}
