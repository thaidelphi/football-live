package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import i8.w;
import m8.d;
/* compiled from: AdRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface AdRepository {
    Object addAd(ByteString byteString, AdObject adObject, d<? super w> dVar);

    Object getAd(ByteString byteString, d<? super AdObject> dVar);

    Object hasOpportunityId(ByteString byteString, d<? super Boolean> dVar);

    Object removeAd(ByteString byteString, d<? super w> dVar);
}
