package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.jvm.internal.n;
import t8.a;
/* compiled from: AndroidMediationRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(MediationDataSource mediationDataSource) {
        n.f(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public a<ClientInfoOuterClass.MediationProvider> getMediationProvider() {
        return new AndroidMediationRepository$mediationProvider$1(this);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
