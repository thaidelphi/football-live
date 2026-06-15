package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.n;
/* compiled from: ScarTimeHackFixer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ScarTimeHackFixer {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public ScarTimeHackFixer(SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final int invoke(int i10) {
        if (i10 < 1000) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_scar_video_length_in_sec", null, null, null, null, 30, null);
            return i10 * 1000;
        }
        return i10;
    }
}
