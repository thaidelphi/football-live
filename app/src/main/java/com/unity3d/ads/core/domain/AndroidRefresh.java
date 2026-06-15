package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import d9.j0;
import kotlin.jvm.internal.n;
/* compiled from: AndroidRefresh.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidRefresh implements Refresh {
    private final j0 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    public AndroidRefresh(j0 defaultDispatcher, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.unity3d.ads.core.domain.Refresh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString r6, com.google.protobuf.ByteString r7, m8.d<? super gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidRefresh$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            i8.p.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            i8.p.b(r8)
            d9.j0 r8 = r5.defaultDispatcher
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$2 r2 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$2
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.label = r3
            java.lang.Object r8 = d9.i.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = "override suspend fun inv…RefreshResponse\n        }"
            kotlin.jvm.internal.n.e(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.invoke(com.google.protobuf.ByteString, com.google.protobuf.ByteString, m8.d):java.lang.Object");
    }
}
