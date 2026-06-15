package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.banners.UnityBannerSize;
import d9.o0;
import d9.p0;
import i8.g;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.b0;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsSDK.kt */
@f(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {107}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK$load$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ UnityBannerSize $bannerSize;
    final /* synthetic */ g<Context> $context$delegate;
    final /* synthetic */ IUnityAdsLoadListener $listener;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ o0 $loadScope;
    final /* synthetic */ String $placementId;
    int label;
    final /* synthetic */ UnityAdsSDK this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$load$1(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, o0 o0Var, g<? extends Context> gVar, d<? super UnityAdsSDK$load$1> dVar) {
        super(2, dVar);
        this.this$0 = unityAdsSDK;
        this.$placementId = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$listener = iUnityAdsLoadListener;
        this.$bannerSize = unityBannerSize;
        this.$loadScope = o0Var;
        this.$context$delegate = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$load$1(this.this$0, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$load$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Context load$lambda$5;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) this.this$0.getServiceProvider().getRegistry().getService("", b0.b(LegacyLoadUseCase.class));
            load$lambda$5 = UnityAdsSDK.load$lambda$5(this.$context$delegate);
            String str = this.$placementId;
            UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
            IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
            UnityBannerSize unityBannerSize = this.$bannerSize;
            this.label = 1;
            if (legacyLoadUseCase.invoke(load$lambda$5, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        p0.d(this.$loadScope, null, 1, null);
        return w.f26638a;
    }
}
