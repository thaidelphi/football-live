package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaec implements zzadx {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaec(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzaec zzb(zzdx zzdxVar) {
        int zzi = zzdxVar.zzi();
        zzdxVar.zzM(8);
        int zzi2 = zzdxVar.zzi();
        int zzi3 = zzdxVar.zzi();
        zzdxVar.zzM(4);
        int zzi4 = zzdxVar.zzi();
        zzdxVar.zzM(12);
        return new zzaec(zzi, zzi2, zzi3, zzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zza() {
        return 1751742049;
    }
}
