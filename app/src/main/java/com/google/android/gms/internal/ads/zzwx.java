package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzwx extends zzxi implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxb zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012d A[EDGE_INSN: B:109:0x012d->B:75:0x012d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea A[LOOP:1: B:55:0x00e7->B:57:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzwx(int r8, com.google.android.gms.internal.ads.zzbo r9, int r10, com.google.android.gms.internal.ads.zzxb r11, int r12, boolean r13, com.google.android.gms.internal.ads.zzfsw r14, int r15) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.<init>(int, com.google.android.gms.internal.ads.zzbo, int, com.google.android.gms.internal.ads.zzxb, int, boolean, com.google.android.gms.internal.ads.zzfsw, int):void");
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzwx zzwxVar) {
        zzfxg zzfxgVar;
        zzfxg zza;
        if (this.zzf && this.zzi) {
            zza = zzxn.zzc;
        } else {
            zzfxgVar = zzxn.zzc;
            zza = zzfxgVar.zza();
        }
        zzfvk zzc = zzfvk.zzj().zzd(this.zzi, zzwxVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzwxVar.zzk), zzfxg.zzc().zza()).zzb(this.zzj, zzwxVar.zzj).zzb(this.zzl, zzwxVar.zzl).zzd(this.zzp, zzwxVar.zzp).zzd(this.zzm, zzwxVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzwxVar.zzn), zzfxg.zzc().zza()).zzb(this.zzo, zzwxVar.zzo).zzd(this.zzf, zzwxVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzwxVar.zzt), zzfxg.zzc().zza());
        boolean z10 = this.zzh.zzz;
        zzfvk zzc2 = zzc.zzd(this.zzu, zzwxVar.zzu).zzd(this.zzv, zzwxVar.zzv).zzd(this.zzw, zzwxVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzwxVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzwxVar.zzr), zza);
        String str = this.zzg;
        String str2 = zzwxVar.zzg;
        int i10 = zzeh.zza;
        if (Objects.equals(str, str2)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzwxVar.zzs), zza);
        }
        return zzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final /* bridge */ /* synthetic */ boolean zzc(zzxi zzxiVar) {
        String str;
        zzwx zzwxVar = (zzwx) zzxiVar;
        boolean z10 = this.zzh.zzK;
        zzz zzzVar = this.zzd;
        int i10 = zzzVar.zzE;
        if (i10 != -1) {
            zzz zzzVar2 = zzwxVar.zzd;
            if (i10 == zzzVar2.zzE && (str = zzzVar.zzo) != null && TextUtils.equals(str, zzzVar2.zzo)) {
                boolean z11 = this.zzh.zzJ;
                int i11 = this.zzd.zzF;
                return i11 != -1 && i11 == zzwxVar.zzd.zzF && this.zzu == zzwxVar.zzu && this.zzv == zzwxVar.zzv;
            }
            return false;
        }
        return false;
    }
}
