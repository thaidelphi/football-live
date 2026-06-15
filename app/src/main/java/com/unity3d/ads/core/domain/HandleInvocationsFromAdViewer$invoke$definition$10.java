package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.o;
/* compiled from: HandleInvocationsFromAdViewer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class HandleInvocationsFromAdViewer$invoke$definition$10 extends o implements t8.a<ExposedFunction> {
    public static final HandleInvocationsFromAdViewer$invoke$definition$10 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$10();

    HandleInvocationsFromAdViewer$invoke$definition$10() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.writeStorage();
    }
}
