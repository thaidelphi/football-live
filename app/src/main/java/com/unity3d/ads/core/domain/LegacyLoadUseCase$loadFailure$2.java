package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.services.core.misc.Utilities;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyLoadUseCase.kt */
@f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$2", f = "LegacyLoadUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyLoadUseCase$loadFailure$2 extends l implements p<o0, m8.d<? super w>, Object> {
    final /* synthetic */ LoadResult.Failure $loadResult;
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyLoadUseCase$loadFailure$2(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure, m8.d<? super LegacyLoadUseCase$loadFailure$2> dVar) {
        super(2, dVar);
        this.this$0 = legacyLoadUseCase;
        this.$loadResult = failure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        IUnityAdsLoadListener iUnityAdsLoadListener;
        String str;
        iUnityAdsLoadListener = legacyLoadUseCase.listener;
        if (iUnityAdsLoadListener != null) {
            str = legacyLoadUseCase.placement;
            iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, failure.getError(), failure.getMessage());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new LegacyLoadUseCase$loadFailure$2(this.this$0, this.$loadResult, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((LegacyLoadUseCase$loadFailure$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            final LegacyLoadUseCase legacyLoadUseCase = this.this$0;
            final LoadResult.Failure failure = this.$loadResult;
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.c
                @Override // java.lang.Runnable
                public final void run() {
                    LegacyLoadUseCase$loadFailure$2.invokeSuspend$lambda$0(LegacyLoadUseCase.this, failure);
                }
            });
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
