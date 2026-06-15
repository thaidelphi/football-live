package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import i8.p;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
/* compiled from: AndroidHandleGatewayAdResponse.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {159}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidHandleGatewayAdResponse$invoke$4 extends l implements t8.l<m8.d<? super w>, Object> {
    final /* synthetic */ String $webViewUrl;
    final /* synthetic */ AndroidWebViewContainer $webviewContainer;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$4(AndroidWebViewContainer androidWebViewContainer, String str, m8.d<? super AndroidHandleGatewayAdResponse$invoke$4> dVar) {
        super(1, dVar);
        this.$webviewContainer = androidWebViewContainer;
        this.$webViewUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(m8.d<?> dVar) {
        return new AndroidHandleGatewayAdResponse$invoke$4(this.$webviewContainer, this.$webViewUrl, dVar);
    }

    @Override // t8.l
    public final Object invoke(m8.d<? super w> dVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$4) create(dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
            String str = this.$webViewUrl;
            this.label = 1;
            if (androidWebViewContainer.loadUrl(str, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            p.b(obj);
        }
        return w.f26638a;
    }
}
