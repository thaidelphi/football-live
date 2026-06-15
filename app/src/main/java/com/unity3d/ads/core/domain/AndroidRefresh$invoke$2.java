package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import d9.o0;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidRefresh.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", l = {26, 28}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidRefresh$invoke$2 extends l implements p<o0, m8.d<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse>, Object> {
    final /* synthetic */ ByteString $adDataRefreshToken;
    final /* synthetic */ ByteString $opportunityId;
    int label;
    final /* synthetic */ AndroidRefresh this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRefresh$invoke$2(AndroidRefresh androidRefresh, ByteString byteString, ByteString byteString2, m8.d<? super AndroidRefresh$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidRefresh;
        this.$adDataRefreshToken = byteString;
        this.$opportunityId = byteString2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidRefresh$invoke$2(this.this$0, this.$adDataRefreshToken, this.$opportunityId, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> dVar) {
        return ((AndroidRefresh$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        GetAdDataRefreshRequest getAdDataRefreshRequest;
        GetRequestPolicy getRequestPolicy;
        GatewayClient gatewayClient;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            getAdDataRefreshRequest = this.this$0.getAdDataRefreshRequest;
            ByteString byteString = this.$adDataRefreshToken;
            ByteString byteString2 = this.$opportunityId;
            this.label = 1;
            obj = getAdDataRefreshRequest.invoke(byteString, byteString2, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                i8.p.b(obj);
                return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        getRequestPolicy = this.this$0.getRequestPolicy;
        RequestPolicy invoke = getRequestPolicy.invoke();
        gatewayClient = this.this$0.gatewayClient;
        OperationType operationType = OperationType.REFRESH;
        this.label = 2;
        obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) obj, invoke, operationType, this, 1, null);
        if (obj == c10) {
            return c10;
        }
        return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
    }
}
