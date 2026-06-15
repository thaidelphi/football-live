package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfp extends zzdp {

    /* renamed from: a  reason: collision with root package name */
    private final OnPaidEventListener f11293a;

    public zzfp(OnPaidEventListener onPaidEventListener) {
        this.f11293a = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zze(zzt zztVar) {
        OnPaidEventListener onPaidEventListener = this.f11293a;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zztVar.zzb, zztVar.zzc, zztVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzf() {
        return this.f11293a == null;
    }
}
