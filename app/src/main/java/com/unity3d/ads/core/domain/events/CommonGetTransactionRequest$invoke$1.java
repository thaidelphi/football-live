package com.unity3d.ads.core.domain.events;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonGetTransactionRequest.kt */
@f(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", l = {14}, m = "invoke")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGetTransactionRequest$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetTransactionRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGetTransactionRequest$invoke$1(CommonGetTransactionRequest commonGetTransactionRequest, m8.d<? super CommonGetTransactionRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonGetTransactionRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(null, this);
    }
}
