package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import i8.o;
import i8.p;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: ContinuationFromCallback.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final d<Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(d<Object> continuation) {
        super("", 0);
        n.f(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r52, Object... params) {
        n.f(params, "params");
        d<Object> dVar = this.continuation;
        o.a aVar = o.f26626b;
        dVar.resumeWith(o.b(p.a(new ExposureException("Invocation failed with: " + r52, params))));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... params) {
        n.f(params, "params");
        d<Object> dVar = this.continuation;
        o.a aVar = o.f26626b;
        dVar.resumeWith(o.b(params));
    }
}
