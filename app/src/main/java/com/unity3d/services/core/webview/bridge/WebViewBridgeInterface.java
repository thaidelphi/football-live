package com.unity3d.services.core.webview.bridge;

import android.webkit.JavascriptInterface;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
/* compiled from: WebViewBridgeInterface.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this(null, null, 3, null);
    }

    public WebViewBridgeInterface(IWebViewBridge webViewBridge, IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        n.f(webViewBridge, "webViewBridge");
        n.f(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    @JavascriptInterface
    public final void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
        n.f(callbackId, "callbackId");
        n.f(callbackStatus, "callbackStatus");
        n.f(rawParameters, "rawParameters");
        DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters)));
    }

    @JavascriptInterface
    public final void handleInvocation(String data) {
        n.f(data, "data");
        DeviceLog.debug("handleInvocation " + data);
        JSONArray jSONArray = new JSONArray(data);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            n.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            n.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            n.d(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            n.d(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHandleCallback(android.webkit.WebView r2, c1.d r3, android.net.Uri r4, boolean r5, c1.a r6) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.n.f(r2, r0)
            java.lang.String r2 = "message"
            kotlin.jvm.internal.n.f(r3, r2)
            java.lang.String r2 = "sourceOrigin"
            kotlin.jvm.internal.n.f(r4, r2)
            java.lang.String r2 = "replyProxy"
            kotlin.jvm.internal.n.f(r6, r2)
            java.lang.String r2 = r3.b()
            if (r5 == 0) goto L52
            if (r2 == 0) goto L25
            boolean r3 = b9.f.m(r2)
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = 0
            goto L26
        L25:
            r3 = 1
        L26:
            if (r3 == 0) goto L29
            goto L52
        L29:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
            java.lang.String r2 = "id"
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r4 = "status"
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r5 = "parameters"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "callbackId"
            kotlin.jvm.internal.n.e(r2, r5)
            java.lang.String r5 = "callbackStatus"
            kotlin.jvm.internal.n.e(r4, r5)
            java.lang.String r5 = "rawParameters"
            kotlin.jvm.internal.n.e(r3, r5)
            r1.handleCallback(r2, r4, r3)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.bridge.WebViewBridgeInterface.onHandleCallback(android.webkit.WebView, c1.d, android.net.Uri, boolean, c1.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHandleInvocation(android.webkit.WebView r2, c1.d r3, android.net.Uri r4, boolean r5, c1.a r6) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.n.f(r2, r0)
            java.lang.String r2 = "message"
            kotlin.jvm.internal.n.f(r3, r2)
            java.lang.String r2 = "sourceOrigin"
            kotlin.jvm.internal.n.f(r4, r2)
            java.lang.String r2 = "replyProxy"
            kotlin.jvm.internal.n.f(r6, r2)
            java.lang.String r2 = r3.b()
            if (r5 == 0) goto L2c
            if (r2 == 0) goto L25
            boolean r3 = b9.f.m(r2)
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = 0
            goto L26
        L25:
            r3 = 1
        L26:
            if (r3 == 0) goto L29
            goto L2c
        L29:
            r1.handleInvocation(r2)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.bridge.WebViewBridgeInterface.onHandleInvocation(android.webkit.WebView, c1.d, android.net.Uri, boolean, c1.a):void");
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i10, h hVar) {
        this((i10 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}
