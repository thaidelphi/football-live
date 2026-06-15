package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidWebViewContainer.kt */
@f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidWebViewContainer$evaluateJavascript$2 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ String $script;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$evaluateJavascript$2(AndroidWebViewContainer androidWebViewContainer, String str, d<? super AndroidWebViewContainer$evaluateJavascript$2> dVar) {
        super(2, dVar);
        this.this$0 = androidWebViewContainer;
        this.$script = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidWebViewContainer$evaluateJavascript$2(this.this$0, this.$script, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidWebViewContainer$evaluateJavascript$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            WebView webView = this.this$0.getWebView();
            webView.evaluateJavascript("javascript:" + this.$script, null);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
