package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import d9.j0;
import d9.k;
import d9.p0;
import kotlin.jvm.internal.n;
/* compiled from: TriggerInitializeListener.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TriggerInitializeListener {
    private final j0 coroutineDispatcher;

    public TriggerInitializeListener(j0 coroutineDispatcher) {
        n.f(coroutineDispatcher, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final void error(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String errorMsg) {
        n.f(unityAdsInitializationError, "unityAdsInitializationError");
        n.f(errorMsg, "errorMsg");
        k.d(p0.a(this.coroutineDispatcher), null, null, new TriggerInitializeListener$error$1(unityAdsInitializationError, errorMsg, null), 3, null);
    }

    public final void success() {
        k.d(p0.a(this.coroutineDispatcher), null, null, new TriggerInitializeListener$success$1(null), 3, null);
    }
}
