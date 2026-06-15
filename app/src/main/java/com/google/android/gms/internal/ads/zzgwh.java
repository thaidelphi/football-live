package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgwh implements zzgvy {
    final int zza;
    final zzgzn zzb;
    final boolean zzc;
    final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgwh(zzgwp zzgwpVar, int i10, zzgzn zzgznVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zzgznVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgwh) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgzn zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgzo zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final boolean zze() {
        return this.zzc;
    }
}
