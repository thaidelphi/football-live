package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import d9.o0;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: CommonGatewayClient.kt */
@f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {61}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class CommonGatewayClient$request$2 extends l implements p<o0, d<? super UniversalResponseOuterClass.UniversalResponse>, Object> {
    final /* synthetic */ OperationType $operationType;
    final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
    final /* synthetic */ RequestPolicy $requestPolicy;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$request$2(CommonGatewayClient commonGatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, d<? super CommonGatewayClient$request$2> dVar) {
        super(2, dVar);
        this.this$0 = commonGatewayClient;
        this.$url = str;
        this.$request = universalRequest;
        this.$requestPolicy = requestPolicy;
        this.$operationType = operationType;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new CommonGatewayClient$request$2(this.this$0, this.$url, this.$request, this.$requestPolicy, this.$operationType, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super UniversalResponseOuterClass.UniversalResponse> dVar) {
        return ((CommonGatewayClient$request$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            CommonGatewayClient commonGatewayClient = this.this$0;
            String str = this.$url;
            UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
            RequestPolicy requestPolicy = this.$requestPolicy;
            OperationType operationType = this.$operationType;
            this.label = 1;
            obj = commonGatewayClient.executeWithRetry(str, universalRequest, requestPolicy, operationType, this);
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
