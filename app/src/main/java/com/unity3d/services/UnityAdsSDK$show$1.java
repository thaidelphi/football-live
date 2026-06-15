package com.unity3d.services;

import android.app.Activity;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import d9.o0;
import d9.p0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsSDK.kt */
@f(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {117}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK$show$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Listeners $listener;
    final /* synthetic */ String $placementId;
    final /* synthetic */ LegacyShowUseCase $showBoldSDK;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    final /* synthetic */ o0 $showScope;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$show$1(LegacyShowUseCase legacyShowUseCase, Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, o0 o0Var, d<? super UnityAdsSDK$show$1> dVar) {
        super(2, dVar);
        this.$showBoldSDK = legacyShowUseCase;
        this.$activity = activity;
        this.$placementId = str;
        this.$showOptions = unityAdsShowOptions;
        this.$listener = listeners;
        this.$showScope = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$show$1(this.$showBoldSDK, this.$activity, this.$placementId, this.$showOptions, this.$listener, this.$showScope, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$show$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
            Activity activity = this.$activity;
            String str = this.$placementId;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            Listeners listeners = this.$listener;
            this.label = 1;
            if (legacyShowUseCase.invoke(activity, str, unityAdsShowOptions, listeners, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        p0.d(this.$showScope, null, 1, null);
        return w.f26638a;
    }
}
