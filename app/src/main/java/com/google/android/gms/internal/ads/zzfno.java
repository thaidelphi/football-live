package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfno {
    final /* synthetic */ zzfnq zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfno(zzfnq zzfnqVar, byte[] bArr, zzfnp zzfnpVar) {
        this.zza = zzfnqVar;
        this.zzb = bArr;
    }

    public final zzfno zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfno zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfnq zzfnqVar = this.zza;
            if (zzfnqVar.zzb) {
                zzfnqVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e8) {
            Log.d("GASS", "Clearcut log failed", e8);
        }
    }
}
