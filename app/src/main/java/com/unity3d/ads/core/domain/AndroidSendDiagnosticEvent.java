package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import kotlin.jvm.internal.n;
/* compiled from: AndroidSendDiagnosticEvent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest) {
        n.f(diagnosticEventRepository, "diagnosticEventRepository");
        n.f(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r1 = j8.j0.v(r14);
     */
    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r12, java.lang.Double r13, java.util.Map<java.lang.String, java.lang.String> r14, java.util.Map<java.lang.String, java.lang.Integer> r15, com.unity3d.ads.core.data.model.AdObject r16) {
        /*
            r11 = this;
            r0 = r11
            java.lang.String r1 = "event"
            r3 = r12
            kotlin.jvm.internal.n.f(r12, r1)
            r1 = 0
            if (r16 == 0) goto L14
            boolean r2 = r16.isHeaderBidding()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7 = r2
            goto L15
        L14:
            r7 = r1
        L15:
            if (r16 == 0) goto L1d
            com.google.protobuf.ByteString r2 = r16.getOpportunityId()
            r8 = r2
            goto L1e
        L1d:
            r8 = r1
        L1e:
            if (r16 == 0) goto L26
            java.lang.String r2 = r16.getPlacementId()
            r9 = r2
            goto L27
        L26:
            r9 = r1
        L27:
            if (r16 == 0) goto L2d
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r1 = r16.getAdType()
        L2d:
            r10 = r1
            if (r14 == 0) goto L36
            java.util.Map r1 = j8.g0.v(r14)
            if (r1 != 0) goto L3b
        L36:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L3b:
            r4 = r1
            r1 = 1
            r2 = 0
            if (r16 == 0) goto L47
            boolean r5 = r16.isScarAd()
            if (r5 != r1) goto L47
            goto L48
        L47:
            r1 = r2
        L48:
            if (r1 == 0) goto L51
            java.lang.String r1 = "scar"
            java.lang.String r2 = "true"
            r4.put(r1, r2)
        L51:
            com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest r2 = r0.getDiagnosticEventRequest
            r3 = r12
            r5 = r15
            r6 = r13
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent r1 = r2.invoke(r3, r4, r5, r6, r7, r8, r9, r10)
            com.unity3d.ads.core.data.repository.DiagnosticEventRepository r2 = r0.diagnosticEventRepository
            r2.addDiagnosticEvent(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent.invoke(java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject):void");
    }
}
