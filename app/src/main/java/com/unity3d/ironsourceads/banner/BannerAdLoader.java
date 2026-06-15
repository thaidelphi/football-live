package com.unity3d.ironsourceads.banner;

import com.ironsource.bm;
import com.ironsource.em;
import com.ironsource.f7;
import com.ironsource.hg;
import com.ironsource.kn;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class BannerAdLoader {
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f23713a = hg.f17676a.c();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bm loadTask) {
        n.f(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(BannerAdRequest adRequest, BannerAdLoaderListener listener) {
        n.f(adRequest, "adRequest");
        n.f(listener, "listener");
        INSTANCE.internalLoadAd$mediationsdk_release(f23713a, new f7(adRequest, listener, kn.f18097e.a(IronSource.AD_UNIT.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, em loadTaskProvider) {
        n.f(executor, "executor");
        n.f(loadTaskProvider, "loadTaskProvider");
        final bm a10 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: n7.a
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdLoader.a(bm.this);
            }
        });
    }
}
