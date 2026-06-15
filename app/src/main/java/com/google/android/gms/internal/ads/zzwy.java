package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzwy extends zzxi implements Comparable {
    private final int zze;
    private final int zzf;

    public zzwy(int i10, zzbo zzboVar, int i11, zzxb zzxbVar, int i12) {
        super(i10, zzboVar, i11);
        this.zze = zzlb.zza(i12, zzxbVar.zzO) ? 1 : 0;
        this.zzf = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzwy zzwyVar) {
        return Integer.compare(this.zzf, zzwyVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final /* bridge */ /* synthetic */ boolean zzc(zzxi zzxiVar) {
        zzwy zzwyVar = (zzwy) zzxiVar;
        return false;
    }
}
