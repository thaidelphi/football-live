package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HandleInvocationsFromAdViewer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$5 extends o implements t8.a<ExposedFunction> {
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$5(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", b0.b(DeviceInfoRepository.class)));
    }
}
