package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbro extends zzbge {
    final /* synthetic */ zzbrq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbro(zzbrq zzbrqVar, zzbrp zzbrpVar) {
        this.zza = zzbrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zze(zzbfs zzbfsVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbrq zzbrqVar = this.zza;
        onCustomFormatAdLoadedListener = zzbrqVar.zza;
        zzf = zzbrqVar.zzf(zzbfsVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
