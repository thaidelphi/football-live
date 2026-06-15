package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import i8.w;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.b;
import m8.d;
/* compiled from: AndroidAdRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object addAd(ByteString byteString, AdObject adObject, d<? super w> dVar) {
        this.loadedAds.put(byteString, adObject);
        return w.f26638a;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object getAd(ByteString byteString, d<? super AdObject> dVar) {
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object hasOpportunityId(ByteString byteString, d<? super Boolean> dVar) {
        return b.a(this.loadedAds.containsKey(byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object removeAd(ByteString byteString, d<? super w> dVar) {
        this.loadedAds.remove(byteString);
        return w.f26638a;
    }
}
