package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzaet {
    protected final zzadp zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaet(zzadp zzadpVar) {
        this.zza = zzadpVar;
    }

    protected abstract boolean zza(zzdx zzdxVar) throws zzaz;

    protected abstract boolean zzb(zzdx zzdxVar, long j10) throws zzaz;

    public final boolean zzf(zzdx zzdxVar, long j10) throws zzaz {
        return zza(zzdxVar) && zzb(zzdxVar, j10);
    }
}
