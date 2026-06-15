package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import i8.p;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.q;
import t8.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {151}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyShowUseCase$invoke$3 extends l implements q<g9.f<? super ShowEvent>, Throwable, m8.d<? super w>, Object> {
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, m8.d<? super w>, Object> $reportShowError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$3(t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super m8.d<? super w>, ? extends Object> tVar, boolean z10, m8.d<? super LegacyShowUseCase$invoke$3> dVar) {
        super(3, dVar);
        this.$reportShowError = tVar;
        this.$isBanner = z10;
    }

    @Override // t8.q
    public final Object invoke(g9.f<? super ShowEvent> fVar, Throwable th, m8.d<? super w> dVar) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3 = new LegacyShowUseCase$invoke$3(this.$reportShowError, this.$isBanner, dVar);
        legacyShowUseCase$invoke$3.L$0 = th;
        return legacyShowUseCase$invoke$3.invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            t<String, UnityAds.UnityAdsShowError, String, Integer, String, m8.d<? super w>, Object> tVar = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
            String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default((Throwable) this.L$0, 0, 1, null);
            this.label = 1;
            if (tVar.invoke("uncaught_exception", unityAdsShowError, "Internal error", null, shortenedStackTrace$default, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            p.b(obj);
        }
        if (!this.$isBanner) {
            LegacyShowUseCase.Companion companion = LegacyShowUseCase.Companion;
            LegacyShowUseCase.isFullscreenAdShowing = false;
        }
        return w.f26638a;
    }
}
