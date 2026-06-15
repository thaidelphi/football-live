package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.n;
/* compiled from: UniversalRequestEventSender.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator) {
        n.f(gatewayClient, "gatewayClient");
        n.f(handleGatewayEventResponse, "handleGatewayEventResponse");
        n.f(universalRequestTtlValidator, "universalRequestTtlValidator");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r12, com.unity3d.ads.gatewayclient.RequestPolicy r13, m8.d<? super i8.w> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r9 = n8.b.c()
            int r1 = r0.label
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L35
            if (r1 != r10) goto L2d
            i8.p.b(r14)
            goto L97
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r12 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) r12
            i8.p.b(r14)     // Catch: java.lang.Throwable -> L3d
            goto L66
        L3d:
            r13 = move-exception
            goto L6f
        L3f:
            i8.p.b(r14)
            com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator r14 = r11.universalRequestTtlValidator
            boolean r14 = r14.invoke(r12, r13)
            if (r14 != 0) goto L4d
            i8.w r12 = i8.w.f26638a
            return r12
        L4d:
            i8.o$a r14 = i8.o.f26626b     // Catch: java.lang.Throwable -> L6d
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r11.gatewayClient     // Catch: java.lang.Throwable -> L6d
            r14 = 0
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT     // Catch: java.lang.Throwable -> L6d
            r7 = 1
            r8 = 0
            r0.L$0 = r11     // Catch: java.lang.Throwable -> L6d
            r0.label = r2     // Catch: java.lang.Throwable -> L6d
            r2 = r14
            r3 = r12
            r4 = r13
            r6 = r0
            java.lang.Object r14 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6d
            if (r14 != r9) goto L65
            return r9
        L65:
            r12 = r11
        L66:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r14 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r14     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r13 = i8.o.b(r14)     // Catch: java.lang.Throwable -> L3d
            goto L79
        L6d:
            r13 = move-exception
            r12 = r11
        L6f:
            i8.o$a r14 = i8.o.f26626b
            java.lang.Object r13 = i8.p.a(r13)
            java.lang.Object r13 = i8.o.b(r13)
        L79:
            java.lang.Throwable r14 = i8.o.d(r13)
            boolean r14 = r14 instanceof com.unity3d.ads.core.data.model.exception.GatewayException
            if (r14 == 0) goto L84
            i8.w r12 = i8.w.f26638a
            return r12
        L84:
            com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r12 = r12.handleGatewayEventResponse
            i8.p.b(r13)
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
            r14 = 0
            r0.L$0 = r14
            r0.label = r10
            java.lang.Object r12 = r12.invoke(r13, r0)
            if (r12 != r9) goto L97
            return r9
        L97:
            i8.w r12 = i8.w.f26638a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, m8.d):java.lang.Object");
    }
}
