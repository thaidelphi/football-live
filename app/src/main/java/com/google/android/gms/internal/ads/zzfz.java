package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfz implements zzfq {
    private zzgr zzb;
    private String zzc;
    private boolean zzf;
    private final zzgl zza = new zzgl();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzfz zzb(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzfz zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfz zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzfz zze(zzgr zzgrVar) {
        this.zzb = zzgrVar;
        return this;
    }

    public final zzfz zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    /* renamed from: zzg */
    public final zzge zza() {
        zzge zzgeVar = new zzge(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzgr zzgrVar = this.zzb;
        if (zzgrVar != null) {
            zzgeVar.zzf(zzgrVar);
        }
        return zzgeVar;
    }
}
