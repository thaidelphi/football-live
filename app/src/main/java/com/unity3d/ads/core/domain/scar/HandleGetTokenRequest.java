package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import m8.d;
/* compiled from: HandleGetTokenRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface HandleGetTokenRequest {
    Object invoke(ByteString byteString, BiddingSignals biddingSignals, d<? super UniversalResponseOuterClass.UniversalResponse> dVar);
}
