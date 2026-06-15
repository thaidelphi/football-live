package com.unity3d.ads.core.domain;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidGetWebViewContainerUseCase.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1", f = "AndroidGetWebViewContainerUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidGetWebViewContainerUseCase$invoke$webview$1 extends l implements p<o0, m8.d<? super WebView>, Object> {
    int label;
    final /* synthetic */ AndroidGetWebViewContainerUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetWebViewContainerUseCase$invoke$webview$1(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, m8.d<? super AndroidGetWebViewContainerUseCase$invoke$webview$1> dVar) {
        super(2, dVar);
        this.this$0 = androidGetWebViewContainerUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidGetWebViewContainerUseCase$invoke$webview$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super WebView> dVar) {
        return ((AndroidGetWebViewContainerUseCase$invoke$webview$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        AndroidWebViewClient androidWebViewClient;
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            context = this.this$0.context;
            WebView webView = new WebView(context);
            AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = this.this$0;
            WebSettings settings = webView.getSettings();
            settings.setAllowFileAccess(false);
            settings.setBlockNetworkImage(false);
            settings.setBlockNetworkLoads(false);
            settings.setBuiltInZoomControls(false);
            settings.setCacheMode(-1);
            settings.setDatabaseEnabled(false);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(false);
            settings.setGeolocationEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            if (Build.VERSION.SDK_INT >= 21) {
                settings.setMixedContentMode(1);
            }
            settings.setNeedInitialFocus(true);
            settings.setSupportMultipleWindows(false);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            androidWebViewClient = androidGetWebViewContainerUseCase.androidWebViewClient;
            webView.setWebViewClient(androidWebViewClient);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setVerticalScrollBarEnabled(false);
            webView.setInitialScale(0);
            webView.setBackgroundColor(0);
            webView.setBackgroundResource(0);
            return webView;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
