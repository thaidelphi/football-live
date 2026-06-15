package com.unity3d.ads.core.domain;

import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$2", f = "AndroidHandleGatewayInitializationResponse.kt", l = {36}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidHandleGatewayInitializationResponse$invoke$2 extends l implements p<o0, m8.d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidHandleGatewayInitializationResponse this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayInitializationResponse$invoke$2(AndroidHandleGatewayInitializationResponse androidHandleGatewayInitializationResponse, m8.d<? super AndroidHandleGatewayInitializationResponse$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidHandleGatewayInitializationResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidHandleGatewayInitializationResponse$invoke$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super w> dVar) {
        return ((AndroidHandleGatewayInitializationResponse$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            triggerInitializationCompletedRequest = this.this$0.triggerInitializationCompletedRequest;
            this.label = 1;
            if (triggerInitializationCompletedRequest.invoke(this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
