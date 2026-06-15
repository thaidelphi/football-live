package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestKt;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: GetAndroidTokenEventRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class GetAndroidTokenEventRequest implements GetHbTokenEventRequest {
    @Override // com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, d<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> dVar) {
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        n.e(newBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl _create = companion._create(newBuilder);
        _create.setTokenId(byteString);
        String it = biddingSignals.getRvSignal();
        if (it != null) {
            n.e(it, "it");
            _create.setRewarded(ByteStringsKt.toByteStringUtf8(it));
        }
        String it2 = biddingSignals.getInterstitialSignal();
        if (it2 != null) {
            n.e(it2, "it");
            _create.setInterstitial(ByteStringsKt.toByteStringUtf8(it2));
        }
        String it3 = biddingSignals.getBannerSignal();
        if (it3 != null) {
            n.e(it3, "it");
            _create.setBanner(ByteStringsKt.toByteStringUtf8(it3));
        }
        return _create._build();
    }
}
