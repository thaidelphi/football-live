package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.o;
import t8.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDiagnosticEventRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidDiagnosticEventRepository$flush$events$2 extends o implements l<DiagnosticEventRequestOuterClass.DiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEvent> {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$2(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // t8.l
    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        GetDiagnosticEventRequest getDiagnosticEventRequest;
        if (diagnosticEvent == null) {
            getDiagnosticEventRequest = this.this$0.getDiagnosticEventRequest;
            return getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null);
        }
        return diagnosticEvent;
    }
}
