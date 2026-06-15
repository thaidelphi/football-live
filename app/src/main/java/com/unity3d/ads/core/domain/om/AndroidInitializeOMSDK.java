package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.n;
/* compiled from: AndroidInitializeOMSDK.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidInitializeOMSDK(Context context, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, OpenMeasurementRepository omRepository) {
        n.f(context, "context");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(sessionRepository, "sessionRepository");
        n.f(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(m8.d<? super i8.w> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r1 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK r0 = (com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK) r0
            i8.p.b(r15)
            goto L69
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            i8.p.b(r15)
            com.unity3d.ads.core.data.repository.SessionRepository r15 = r14.sessionRepository
            boolean r15 = r15.isOmEnabled()
            if (r15 == 0) goto Lc9
            c9.j r15 = c9.j.f5618a
            long r4 = r15.a()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r6 = r14.sendDiagnosticEvent
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 30
            r13 = 0
            java.lang.String r7 = "om_activate_started"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r6, r7, r8, r9, r10, r11, r12, r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r15 = r14.omRepository
            android.content.Context r2 = r14.context
            r0.L$0 = r14
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r15 = r15.activateOM(r2, r0)
            if (r15 != r1) goto L67
            return r1
        L67:
            r0 = r14
            r1 = r4
        L69:
            com.unity3d.ads.core.data.model.OMResult r15 = (com.unity3d.ads.core.data.model.OMResult) r15
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r3 == 0) goto L89
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            c9.j$a r15 = c9.j.a.b(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r15)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.b.b(r0)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            java.lang.String r5 = "om_activate_success_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lc9
        L89:
            boolean r3 = r15 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r3 == 0) goto Lc9
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r0.sendDiagnosticEvent
            c9.j$a r0 = c9.j.a.b(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.b.b(r0)
            java.util.Map r0 = j8.g0.b()
            com.unity3d.ads.core.data.model.OMResult$Failure r15 = (com.unity3d.ads.core.data.model.OMResult.Failure) r15
            java.lang.String r1 = r15.getReason()
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r15.getReasonDebug()
            if (r1 == 0) goto Lb9
            java.lang.String r15 = r15.getReasonDebug()
            java.lang.String r1 = "reason_debug"
            r0.put(r1, r15)
        Lb9:
            i8.w r15 = i8.w.f26638a
            java.util.Map r7 = j8.g0.a(r0)
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            java.lang.String r5 = "om_activate_failure_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11)
        Lc9:
            i8.w r15 = i8.w.f26638a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK.invoke(m8.d):java.lang.Object");
    }
}
