package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
/* compiled from: UniversalRequestTtlValidator.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface UniversalRequestTtlValidator {
    boolean invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy);
}
