package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbrs extends zzbgl {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbrs(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zze(zzbgs zzbgsVar) {
        this.zza.onNativeAdLoaded(new zzbrm(zzbgsVar));
    }
}
