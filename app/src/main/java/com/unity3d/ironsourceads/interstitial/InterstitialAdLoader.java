package com.unity3d.ironsourceads.interstitial;

import com.ironsource.bm;
import com.ironsource.em;
import com.ironsource.gj;
import com.ironsource.hg;
import com.ironsource.kn;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InterstitialAdLoader {
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f23732a = hg.f17676a.c();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bm loadTask) {
        n.f(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(InterstitialAdRequest adRequest, InterstitialAdLoaderListener listener) {
        n.f(adRequest, "adRequest");
        n.f(listener, "listener");
        INSTANCE.internalLoadAd$mediationsdk_release(f23732a, new gj(adRequest, listener, kn.f18097e.a(IronSource.AD_UNIT.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, em loadTaskProvider) {
        n.f(executor, "executor");
        n.f(loadTaskProvider, "loadTaskProvider");
        final bm a10 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: o7.a
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.a(bm.this);
            }
        });
    }
}
