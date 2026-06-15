package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzahg implements zzahd {
    private final int zza;
    private final int zzb;
    private final zzdx zzc;

    public zzahg(zzel zzelVar, zzz zzzVar) {
        zzdx zzdxVar = zzelVar.zza;
        this.zzc = zzdxVar;
        zzdxVar.zzL(12);
        int zzp = zzdxVar.zzp();
        if ("audio/raw".equals(zzzVar.zzo)) {
            int zzk = zzeh.zzk(zzzVar.zzG) * zzzVar.zzE;
            if (zzp == 0 || zzp % zzk != 0) {
                zzdn.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + zzk + ", stsz sample size: " + zzp);
                zzp = zzk;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzdxVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzp() : i10;
    }
}
