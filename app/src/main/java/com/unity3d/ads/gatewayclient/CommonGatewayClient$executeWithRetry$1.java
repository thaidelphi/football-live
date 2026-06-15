package com.unity3d.ads.gatewayclient;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonGatewayClient.kt */
@f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {76, 82, 99}, m = "executeWithRetry")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGatewayClient$executeWithRetry$1 extends d {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$executeWithRetry$1(CommonGatewayClient commonGatewayClient, m8.d<? super CommonGatewayClient$executeWithRetry$1> dVar) {
        super(dVar);
        this.this$0 = commonGatewayClient;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object executeWithRetry;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        executeWithRetry = this.this$0.executeWithRetry(null, null, null, null, this);
        return executeWithRetry;
    }
}
