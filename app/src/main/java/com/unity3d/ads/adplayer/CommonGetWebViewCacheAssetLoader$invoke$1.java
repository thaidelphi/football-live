package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import c1.g;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import d9.o0;
import i8.w;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* compiled from: CommonGetWebViewCacheAssetLoader.kt */
@f(c = "com.unity3d.ads.adplayer.CommonGetWebViewCacheAssetLoader$invoke$1", f = "CommonGetWebViewCacheAssetLoader.kt", l = {21}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class CommonGetWebViewCacheAssetLoader$invoke$1 extends l implements p<o0, d<? super g>, Object> {
    int label;
    final /* synthetic */ CommonGetWebViewCacheAssetLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGetWebViewCacheAssetLoader$invoke$1(CommonGetWebViewCacheAssetLoader commonGetWebViewCacheAssetLoader, d<? super CommonGetWebViewCacheAssetLoader$invoke$1> dVar) {
        super(2, dVar);
        this.this$0 = commonGetWebViewCacheAssetLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebResourceResponse invokeSuspend$lambda$2(CommonGetWebViewCacheAssetLoader commonGetWebViewCacheAssetLoader, String str) {
        Context context;
        try {
            context = commonGetWebViewCacheAssetLoader.context;
            AssetManager assets = context.getAssets();
            InputStream open = assets.open(UnityAdsConstants.DefaultUrls.WEBVIEW_ASSET_PATH_LOCAL + str);
            n.e(open, "context.assets.open(\"$WE…W_ASSET_PATH_LOCAL$path\")");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(str), null, open);
        } catch (Exception unused) {
            DeviceLog.debug("Webview Asset not found: %s", str);
            return null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new CommonGetWebViewCacheAssetLoader$invoke$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super g> dVar) {
        return ((CommonGetWebViewCacheAssetLoader$invoke$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        GetLatestWebViewConfiguration getLatestWebViewConfiguration;
        String w02;
        String sb;
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
        Uri parse = Uri.parse(((WebViewConfiguration) obj).getEntryPoint());
        String path = parse.getPath();
        if (path == null || path.length() == 0) {
            sb = UnityAdsConstants.DefaultUrls.WEBVIEW_ASSET_PATH;
        } else {
            StringBuilder sb2 = new StringBuilder();
            n.e(path, "path");
            w02 = b9.p.w0(path, '/', null, 2, null);
            sb2.append(w02);
            sb2.append('/');
            sb = sb2.toString();
        }
        String host = parse.getHost();
        if (host != null && host.length() != 0) {
            z10 = false;
        }
        if (z10) {
            host = UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN;
        } else {
            n.e(host, "{\n                it\n            }");
        }
        g.a aVar = new g.a();
        final CommonGetWebViewCacheAssetLoader commonGetWebViewCacheAssetLoader = this.this$0;
        return aVar.a(sb, new g.b() { // from class: com.unity3d.ads.adplayer.b
            @Override // c1.g.b
            public final WebResourceResponse a(String str) {
                WebResourceResponse invokeSuspend$lambda$2;
                invokeSuspend$lambda$2 = CommonGetWebViewCacheAssetLoader$invoke$1.invokeSuspend$lambda$2(CommonGetWebViewCacheAssetLoader.this, str);
                return invokeSuspend$lambda$2;
            }
        }).c(host).b();
    }
}
