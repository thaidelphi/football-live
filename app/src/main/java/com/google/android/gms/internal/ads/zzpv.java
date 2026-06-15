package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzpv {
    private final zzcg[] zza;
    private final zzqn zzb;
    private final zzcj zzc;

    public zzpv(zzcg... zzcgVarArr) {
        zzqn zzqnVar = new zzqn();
        zzcj zzcjVar = new zzcj();
        this.zza = r2;
        System.arraycopy(zzcgVarArr, 0, r2, 0, 0);
        this.zzb = zzqnVar;
        this.zzc = zzcjVar;
        zzcg[] zzcgVarArr2 = {zzqnVar, zzcjVar};
    }

    public final long zza(long j10) {
        return this.zzc.zzg() ? this.zzc.zzi(j10) : j10;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbb zzc(zzbb zzbbVar) {
        this.zzc.zzk(zzbbVar.zzb);
        this.zzc.zzj(zzbbVar.zzc);
        return zzbbVar;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzcg[] zze() {
        return this.zza;
    }
}
