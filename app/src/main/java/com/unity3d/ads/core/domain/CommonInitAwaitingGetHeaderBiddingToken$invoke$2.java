package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import d9.o0;
import i8.w;
import j8.m;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {55}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken$invoke$2 extends l implements p<o0, m8.d<? super w>, Object> {
    int label;
    final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonInitAwaitingGetHeaderBiddingToken$invoke$2(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, m8.d<? super CommonInitAwaitingGetHeaderBiddingToken$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((CommonInitAwaitingGetHeaderBiddingToken$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        boolean j10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            j10 = m.j(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(this.this$0.getGetInitializationState(), false, 1, null));
            if (j10) {
                this.this$0.didAwaitInit = true;
                AwaitInitialization awaitInitialization = this.this$0.getAwaitInitialization();
                this.label = 1;
                if (AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null) == c10) {
                    return c10;
                }
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
