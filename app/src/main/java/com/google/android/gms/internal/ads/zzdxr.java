package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdxr implements zzgal {
    final /* synthetic */ zzbud zza;
    final /* synthetic */ zzbtv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxr(zzdxv zzdxvVar, zzbud zzbudVar, zzbtv zzbtvVar) {
        this.zza = zzbudVar;
        this.zzb = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcl)).booleanValue() && (bundle = this.zza.zzm) != null) {
                    bundle.putLong(zzdpn.BINDER_CALL_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
                }
                this.zzb.zzg(parcelFileDescriptor, this.zza);
                return;
            }
            this.zzb.zzf(parcelFileDescriptor);
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e8);
        }
    }
}
