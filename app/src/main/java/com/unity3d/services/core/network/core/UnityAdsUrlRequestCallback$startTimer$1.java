package com.unity3d.services.core.network.core;

import d9.o0;
import d9.z0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import org.chromium.net.UrlRequest;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsUrlRequestCallback.kt */
@f(c = "com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1", f = "UnityAdsUrlRequestCallback.kt", l = {75}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UnityAdsUrlRequestCallback$startTimer$1 extends l implements p<o0, d<? super w>, Object> {
    final /* synthetic */ UrlRequest $request;
    int label;
    final /* synthetic */ UnityAdsUrlRequestCallback this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsUrlRequestCallback$startTimer$1(UnityAdsUrlRequestCallback unityAdsUrlRequestCallback, UrlRequest urlRequest, d<? super UnityAdsUrlRequestCallback$startTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = unityAdsUrlRequestCallback;
        this.$request = urlRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsUrlRequestCallback$startTimer$1(this.this$0, this.$request, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((UnityAdsUrlRequestCallback$startTimer$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            long readTimeout = this.this$0.getReadTimeout();
            this.label = 1;
            if (z0.a(readTimeout, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        this.$request.cancel();
        return w.f26638a;
    }
}
