package com.unity3d.services;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import d9.o0;
import d9.p0;
import i8.g;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsSDK.kt */
@f(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {139}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK$getToken$2 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ g<GetAsyncHeaderBiddingToken> $getAsyncHeaderBiddingToken$delegate;
    final /* synthetic */ o0 $getTokenScope;
    final /* synthetic */ IUnityAdsTokenListener $listener;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$getToken$2(IUnityAdsTokenListener iUnityAdsTokenListener, o0 o0Var, g<? extends GetAsyncHeaderBiddingToken> gVar, d<? super UnityAdsSDK$getToken$2> dVar) {
        super(2, dVar);
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = o0Var;
        this.$getAsyncHeaderBiddingToken$delegate = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$getToken$2(this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$getToken$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        GetAsyncHeaderBiddingToken token$lambda$7;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            token$lambda$7 = UnityAdsSDK.getToken$lambda$7(this.$getAsyncHeaderBiddingToken$delegate);
            IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
            this.label = 1;
            if (token$lambda$7.invoke(iUnityAdsTokenListener, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        p0.d(this.$getTokenScope, null, 1, null);
        return w.f26638a;
    }
}
