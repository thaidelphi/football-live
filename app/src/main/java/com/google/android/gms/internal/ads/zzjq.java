package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzjq {
    public zzks zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzjq(zzks zzksVar) {
        this.zza = zzksVar;
    }

    public final void zza(int i10) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(zzks zzksVar) {
        this.zze |= this.zza != zzksVar;
        this.zza = zzksVar;
    }

    public final void zzc(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzcv.zzd(i10 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i10;
    }
}
