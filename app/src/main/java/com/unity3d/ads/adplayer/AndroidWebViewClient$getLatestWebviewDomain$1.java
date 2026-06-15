package com.unity3d.ads.adplayer;

import android.net.Uri;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidWebViewClient.kt */
@f(c = "com.unity3d.ads.adplayer.AndroidWebViewClient$getLatestWebviewDomain$1", f = "AndroidWebViewClient.kt", l = {133}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidWebViewClient$getLatestWebviewDomain$1 extends l implements p<o0, d<? super String>, Object> {
    int label;
    final /* synthetic */ AndroidWebViewClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewClient$getLatestWebviewDomain$1(AndroidWebViewClient androidWebViewClient, d<? super AndroidWebViewClient$getLatestWebviewDomain$1> dVar) {
        super(2, dVar);
        this.this$0 = androidWebViewClient;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidWebViewClient$getLatestWebviewDomain$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super String> dVar) {
        return ((AndroidWebViewClient$getLatestWebviewDomain$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        GetLatestWebViewConfiguration getLatestWebViewConfiguration;
        c10 = n8.d.c();
        int i10 = this.label;
        boolean z10 = true;
        if (i10 == 0) {
            i8.p.b(obj);
            getLatestWebViewConfiguration = this.this$0.getLatestWebViewConfiguration;
            this.label = 1;
            obj = GetLatestWebViewConfiguration.invoke$default(getLatestWebViewConfiguration, null, null, null, this, 7, null);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        String it = Uri.parse(((WebViewConfiguration) obj).getEntryPoint()).getHost();
        if (it != null && it.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN;
        }
        n.e(it, "it");
        return it;
    }
}
