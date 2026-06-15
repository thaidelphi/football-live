package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Set;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import t8.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDiagnosticEventRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidDiagnosticEventRepository$flush$events$3 extends o implements l<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean> {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$3(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // t8.l
    public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
        Set set;
        boolean z10;
        Set set2;
        n.f(it, "it");
        set = this.this$0.allowedEvents;
        if (!set.isEmpty()) {
            set2 = this.this$0.allowedEvents;
            if (!set2.contains(it.getEventType())) {
                z10 = false;
                return Boolean.valueOf(z10);
            }
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
