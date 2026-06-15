package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.n;
/* compiled from: AndroidOmFinishSession.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidOmFinishSession implements OmFinishSession {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmFinishSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(openMeasurementRepository, "openMeasurementRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // com.unity3d.ads.core.domain.om.OmFinishSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r11, m8.d<? super i8.w> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmFinishSession$invoke$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r11 = (com.unity3d.ads.core.data.model.AdObject) r11
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmFinishSession r0 = (com.unity3d.ads.core.domain.om.AndroidOmFinishSession) r0
            i8.p.b(r12)
            goto L50
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            i8.p.b(r12)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r12 = r10.openMeasurementRepository
            com.google.protobuf.ByteString r2 = r11.getOpportunityId()
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r12 = r12.finishSession(r2, r0)
            if (r12 != r1) goto L4f
            return r1
        L4f:
            r0 = r10
        L50:
            r7 = r11
            com.unity3d.ads.core.data.model.OMResult r12 = (com.unity3d.ads.core.data.model.OMResult) r12
            boolean r11 = r12 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r11 == 0) goto L65
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r0.sendDiagnosticEvent
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 14
            r9 = 0
            java.lang.String r3 = "om_session_finish_success"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L99
        L65:
            boolean r11 = r12 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r11 == 0) goto L99
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r0.sendDiagnosticEvent
            r4 = 0
            java.util.Map r11 = j8.g0.b()
            com.unity3d.ads.core.data.model.OMResult$Failure r12 = (com.unity3d.ads.core.data.model.OMResult.Failure) r12
            java.lang.String r0 = r12.getReason()
            java.lang.String r1 = "reason"
            r11.put(r1, r0)
            java.lang.String r0 = r12.getReasonDebug()
            if (r0 == 0) goto L8a
            java.lang.String r12 = r12.getReasonDebug()
            java.lang.String r0 = "reason_debug"
            r11.put(r0, r12)
        L8a:
            i8.w r12 = i8.w.f26638a
            java.util.Map r5 = j8.g0.a(r11)
            r6 = 0
            r8 = 10
            r9 = 0
            java.lang.String r3 = "om_session_finish_failure"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9)
        L99:
            i8.w r11 = i8.w.f26638a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmFinishSession.invoke(com.unity3d.ads.core.data.model.AdObject, m8.d):java.lang.Object");
    }
}
