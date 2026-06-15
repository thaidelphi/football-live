package com.unity3d.ads.adplayer;

import android.webkit.JavascriptInterface;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidWebViewContainer.kt */
@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidWebViewContainer$addJavascriptInterface$2 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ WebViewBridge $webViewBridgeInterface;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$addJavascriptInterface$2(AndroidWebViewContainer androidWebViewContainer, String str, WebViewBridge webViewBridge, d<? super AndroidWebViewContainer$addJavascriptInterface$2> dVar) {
        super(2, dVar);
        this.this$0 = androidWebViewContainer;
        this.$name = str;
        this.$webViewBridgeInterface = webViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidWebViewContainer$addJavascriptInterface$2(this.this$0, this.$name, this.$webViewBridgeInterface, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidWebViewContainer$addJavascriptInterface$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            this.this$0.getWebView().addJavascriptInterface(new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
                    n.f(callbackId, "callbackId");
                    n.f(callbackStatus, "callbackStatus");
                    n.f(rawParameters, "rawParameters");
                    WebViewBridge.this.handleCallback(callbackId, callbackStatus, rawParameters);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleInvocation(String message) {
                    n.f(message, "message");
                    WebViewBridge.this.handleInvocation(message);
                }
            }, this.$name);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
