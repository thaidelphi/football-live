package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzwz implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzwz(zzz zzzVar, int i10) {
        this.zza = 1 == (zzzVar.zze & 1);
        this.zzb = zzlb.zza(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzwz zzwzVar) {
        return zzfvk.zzj().zzd(this.zzb, zzwzVar.zzb).zzd(this.zza, zzwzVar.zza).zza();
    }
}
