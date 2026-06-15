package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzok {
    public static final zzok zza = new zzoi().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzok(zzoi zzoiVar, zzoj zzojVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        z10 = zzoiVar.zza;
        this.zzb = z10;
        z11 = zzoiVar.zzb;
        this.zzc = z11;
        z12 = zzoiVar.zzc;
        this.zzd = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzok.class == obj.getClass()) {
            zzok zzokVar = (zzok) obj;
            if (this.zzb == zzokVar.zzb && this.zzc == zzokVar.zzc && this.zzd == zzokVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return ((z10 ? 1 : 0) << 2) + (z11 ? 1 : 0) + (z11 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
