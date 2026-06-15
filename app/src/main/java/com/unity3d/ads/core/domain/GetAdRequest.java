package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
/* compiled from: GetAdRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface GetAdRequest {

    /* compiled from: GetAdRequest.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, m8.d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    bannerSize = null;
                }
                return getAdRequest.invoke(str, byteString, bannerSize, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, m8.d<? super UniversalRequestOuterClass.UniversalRequest> dVar);
}
