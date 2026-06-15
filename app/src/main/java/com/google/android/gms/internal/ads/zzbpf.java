package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbpf extends zzbol {
    private final MediationInterscrollerAd zza;

    public zzbpf(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zze() {
        return ObjectWrapper.u0(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}
