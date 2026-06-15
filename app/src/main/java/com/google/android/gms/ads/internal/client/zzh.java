package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzh extends zzbm {

    /* renamed from: a  reason: collision with root package name */
    private final AdLoadCallback f11296a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f11297b;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.f11296a = adLoadCallback;
        this.f11297b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.f11296a;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.f11296a;
        if (adLoadCallback == null || (obj = this.f11297b) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}
