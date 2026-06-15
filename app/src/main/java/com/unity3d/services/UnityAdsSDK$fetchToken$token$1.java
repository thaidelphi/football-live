package com.unity3d.services;

import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import d9.o0;
import i8.g;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsSDK.kt */
@f(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {162}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends l implements p<o0, d<? super String>, Object> {
    final /* synthetic */ g<GetHeaderBiddingToken> $getHeaderBiddingToken$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$fetchToken$token$1(g<? extends GetHeaderBiddingToken> gVar, d<? super UnityAdsSDK$fetchToken$token$1> dVar) {
        super(2, dVar);
        this.$getHeaderBiddingToken$delegate = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super String> dVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        GetHeaderBiddingToken fetchToken$lambda$8;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            fetchToken$lambda$8 = UnityAdsSDK.fetchToken$lambda$8(this.$getHeaderBiddingToken$delegate);
            this.label = 1;
            obj = fetchToken$lambda$8.invoke(this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return obj;
    }
}
