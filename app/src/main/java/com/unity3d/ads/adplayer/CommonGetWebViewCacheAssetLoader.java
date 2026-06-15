package com.unity3d.ads.adplayer;

import android.content.Context;
import c1.g;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import d9.j;
import kotlin.jvm.internal.n;
/* compiled from: CommonGetWebViewCacheAssetLoader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class CommonGetWebViewCacheAssetLoader implements GetWebViewCacheAssetLoader {
    private final Context context;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;

    public CommonGetWebViewCacheAssetLoader(Context context, GetLatestWebViewConfiguration getLatestWebViewConfiguration) {
        n.f(context, "context");
        n.f(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        this.context = context;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
    }

    @Override // com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader
    public g invoke() {
        Object b10;
        b10 = j.b(null, new CommonGetWebViewCacheAssetLoader$invoke$1(this, null), 1, null);
        n.e(b10, "override fun invoke(): W…           .build()\n    }");
        return (g) b10;
    }
}
