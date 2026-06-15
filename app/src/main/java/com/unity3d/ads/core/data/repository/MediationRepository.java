package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;
import t8.a;
/* compiled from: MediationRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface MediationRepository {
    a<ClientInfoOuterClass.MediationProvider> getMediationProvider();

    String getName();

    String getVersion();
}
