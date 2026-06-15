package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbqm implements MediationAdLoadCallback {
    final /* synthetic */ zzbpn zza;
    final /* synthetic */ zzboj zzb;
    final /* synthetic */ zzbqp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqm(zzbqp zzbqpVar, zzbpn zzbpnVar, zzboj zzbojVar) {
        this.zza = zzbpnVar;
        this.zzb = zzbojVar;
        this.zzc = zzbqpVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                return null;
            }
        }
        try {
            this.zzc.zzd = mediationAppOpenAd;
            this.zza.zzg();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e10);
        }
        return new zzbqq(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
