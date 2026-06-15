package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.jvm.internal.n;
/* compiled from: CommonIsOMActivated.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonIsOMActivated implements IsOMActivated {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(OpenMeasurementRepository openMeasurementRepository) {
        n.f(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.IsOMActivated
    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
