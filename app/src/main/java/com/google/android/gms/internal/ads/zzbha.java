package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbha implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzbhb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbha(zzbhb zzbhbVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbxVar;
        this.zzc = zzbhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zzb(this.zzb)) {
            zzbhb zzbhbVar = this.zzc;
            AdManagerAdView adManagerAdView = this.zza;
            onAdManagerAdViewLoadedListener = zzbhbVar.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not bind.");
    }
}
