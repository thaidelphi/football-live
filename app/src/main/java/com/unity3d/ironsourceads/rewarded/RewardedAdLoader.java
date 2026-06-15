package com.unity3d.ironsourceads.rewarded;

import com.ironsource.bm;
import com.ironsource.em;
import com.ironsource.hg;
import com.ironsource.kn;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.rq;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RewardedAdLoader {
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f23745a = hg.f17676a.c();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bm loadTask) {
        n.f(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(RewardedAdRequest adRequest, RewardedAdLoaderListener listener) {
        n.f(adRequest, "adRequest");
        n.f(listener, "listener");
        INSTANCE.internalLoadAd$mediationsdk_release(f23745a, new rq(adRequest, listener, kn.f18097e.a(IronSource.AD_UNIT.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, em loadTaskProvider) {
        n.f(executor, "executor");
        n.f(loadTaskProvider, "loadTaskProvider");
        final bm a10 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: p7.a
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoader.a(bm.this);
            }
        });
    }
}
