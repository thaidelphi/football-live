package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzxl extends zzxi {
    private final boolean zze;
    private final zzxb zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:167:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00e3 A[EDGE_INSN: B:264:0x00e3->B:199:0x00e3 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzxl(int r4, com.google.android.gms.internal.ads.zzbo r5, int r6, com.google.android.gms.internal.ads.zzxb r7, int r8, java.lang.String r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxl.<init>(int, com.google.android.gms.internal.ads.zzbo, int, com.google.android.gms.internal.ads.zzxb, int, java.lang.String, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzxl zzxlVar, zzxl zzxlVar2) {
        zzfxg zzfxgVar;
        zzfxg zza;
        if (zzxlVar.zze && zzxlVar.zzh) {
            zza = zzxn.zzc;
        } else {
            zzfxgVar = zzxn.zzc;
            zza = zzfxgVar.zza();
        }
        zzfvk zzj = zzfvk.zzj();
        boolean z10 = zzxlVar.zzf.zzz;
        return zzj.zzc(Integer.valueOf(zzxlVar.zzk), Integer.valueOf(zzxlVar2.zzk), zza).zzc(Integer.valueOf(zzxlVar.zzj), Integer.valueOf(zzxlVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzxl zzxlVar, zzxl zzxlVar2) {
        zzfvk zzd = zzfvk.zzj().zzd(zzxlVar.zzh, zzxlVar2.zzh).zzc(Integer.valueOf(zzxlVar.zzm), Integer.valueOf(zzxlVar2.zzm), zzfxg.zzc().zza()).zzb(zzxlVar.zzn, zzxlVar2.zzn).zzb(zzxlVar.zzo, zzxlVar2.zzo).zzd(zzxlVar.zzp, zzxlVar2.zzp).zzb(zzxlVar.zzq, zzxlVar2.zzq).zzd(zzxlVar.zzi, zzxlVar2.zzi).zzd(zzxlVar.zze, zzxlVar2.zze).zzd(zzxlVar.zzg, zzxlVar2.zzg).zzc(Integer.valueOf(zzxlVar.zzl), Integer.valueOf(zzxlVar2.zzl), zzfxg.zzc().zza()).zzd(zzxlVar.zzs, zzxlVar2.zzs).zzd(zzxlVar.zzt, zzxlVar2.zzt);
        if (zzxlVar.zzs && zzxlVar.zzt) {
            zzd = zzd.zzb(zzxlVar.zzu, zzxlVar2.zzu);
        }
        return zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final /* bridge */ /* synthetic */ boolean zzc(zzxi zzxiVar) {
        zzxl zzxlVar = (zzxl) zzxiVar;
        String str = this.zzd.zzo;
        String str2 = zzxlVar.zzd.zzo;
        int i10 = zzeh.zza;
        if (Objects.equals(str, str2)) {
            boolean z10 = this.zzf.zzG;
            return this.zzs == zzxlVar.zzs && this.zzt == zzxlVar.zzt;
        }
        return false;
    }
}
