package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzxg extends zzxi implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxg(int i10, zzbo zzboVar, int i11, zzxb zzxbVar, int i12, String str) {
        super(i10, zzboVar, i11);
        zzfvv zzfvvVar;
        int i13;
        int i14 = 0;
        this.zzf = zzlb.zza(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzxbVar.zzw;
        this.zzg = 1 == (i15 & 1);
        this.zzh = (i15 & 2) != 0;
        if (zzxbVar.zzu.isEmpty()) {
            zzfvvVar = zzfvv.zzo("");
        } else {
            zzfvvVar = zzxbVar.zzu;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= zzfvvVar.size()) {
                i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            }
            i13 = zzxn.zzc(this.zzd, (String) zzfvvVar.get(i17), false);
            if (i13 > 0) {
                break;
            }
            i17++;
        }
        this.zzi = i17;
        this.zzj = i13;
        int zzb = zzxn.zzb(this.zzd.zzf, zzxbVar.zzv);
        this.zzk = zzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int zzc = zzxn.zzc(this.zzd, str, zzxn.zzh(str) == null);
        this.zzl = zzc;
        boolean z10 = i13 > 0 || (zzxbVar.zzu.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzlb.zza(i12, zzxbVar.zzO) && z10) {
            i14 = 1;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzxg zzxgVar) {
        zzfvk zzb = zzfvk.zzj().zzd(this.zzf, zzxgVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxgVar.zzi), zzfxg.zzc().zza()).zzb(this.zzj, zzxgVar.zzj).zzb(this.zzk, zzxgVar.zzk).zzd(this.zzg, zzxgVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxgVar.zzh), this.zzj == 0 ? zzfxg.zzc() : zzfxg.zzc().zza()).zzb(this.zzl, zzxgVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(this.zzm, zzxgVar.zzm);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final /* bridge */ /* synthetic */ boolean zzc(zzxi zzxiVar) {
        zzxg zzxgVar = (zzxg) zzxiVar;
        return false;
    }
}
