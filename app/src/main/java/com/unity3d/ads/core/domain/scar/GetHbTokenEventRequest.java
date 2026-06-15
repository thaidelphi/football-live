package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import m8.d;
/* compiled from: GetHbTokenEventRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface GetHbTokenEventRequest {
    Object invoke(ByteString byteString, BiddingSignals biddingSignals, d<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> dVar);
}
