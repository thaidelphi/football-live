package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.o;
/* compiled from: HandleInvocationsFromAdViewer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class HandleInvocationsFromAdViewer$invoke$definition$8 extends o implements t8.a<ExposedFunction> {
    final /* synthetic */ AdObject $adObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$8(AdObject adObject) {
        super(0);
        this.$adObject = adObject;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.setOrientation(this.$adObject);
    }
}
