package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.n;
/* compiled from: AndroidTriggerInitializationCompletedRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(gatewayClient, "gatewayClient");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(4:(1:(7:10|11|12|13|14|15|(5:17|18|19|20|21)(2:28|29))(2:35|36))(3:37|38|39)|34|25|26)(4:59|60|61|(1:63)(1:64))|40|41|42|43|44|45|(1:47)(4:48|14|15|(0)(0))))|68|6|(0)(0)|40|41|42|43|44|45|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0132, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
        r20 = r5;
        r21 = r6;
        r8 = 1;
        r16 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
        r4 = r20;
        r2 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #1 {Exception -> 0x012f, blocks: (B:36:0x00bf, B:38:0x00c7), top: B:59:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(m8.d<? super i8.w> r34) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.invoke(m8.d):java.lang.Object");
    }
}
