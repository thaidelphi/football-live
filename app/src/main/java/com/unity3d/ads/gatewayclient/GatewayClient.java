package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import m8.d;
/* compiled from: GatewayClient.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface GatewayClient {

    /* compiled from: GatewayClient.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object request$default(GatewayClient gatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = UnityAdsConstants.DefaultUrls.GATEWAY_URL;
                }
                String str2 = str;
                if ((i10 & 8) != 0) {
                    operationType = OperationType.UNKNOWN;
                }
                return gatewayClient.request(str2, universalRequest, requestPolicy, operationType, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
    }

    Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, d<? super UniversalResponseOuterClass.UniversalResponse> dVar);
}
