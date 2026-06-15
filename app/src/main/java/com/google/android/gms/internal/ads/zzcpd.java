package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcpd {
    private final zzcwx zza;
    private final zzczd zzb;

    public zzcpd(zzcwx zzcwxVar, zzczd zzczdVar) {
        this.zza = zzcwxVar;
        this.zzb = zzczdVar;
    }

    public final zzcwx zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzczd zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdbw zzc() {
        zzczd zzczdVar = this.zzb;
        return zzczdVar != null ? new zzdbw(zzczdVar, zzbyp.zzg) : new zzdbw(new zzcpc(this), zzbyp.zzg);
    }
}
