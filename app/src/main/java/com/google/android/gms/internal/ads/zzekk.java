package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzekk implements zzerw {
    private final zzerw zza;
    private final zzfap zzb;
    private final Context zzc;
    private final zzbyf zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekk(zzemo zzemoVar, zzfap zzfapVar, Context context, zzbyf zzbyfVar) {
        this.zza = zzemoVar;
        this.zzb = zzfapVar;
        this.zzc = context;
        this.zzd = zzbyfVar;
    }

    public static /* synthetic */ zzekl zzc(zzekk zzekkVar, zzesf zzesfVar) {
        String str;
        boolean z10;
        String str2;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzekkVar.zzb.zze;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            str = zzrVar.zza;
            z10 = zzrVar.zzi;
        } else {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z13 = zzrVar2.zzi;
                if (!z13 && !z11) {
                    str = zzrVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        }
        Resources resources = zzekkVar.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        } else {
            zzbyf zzbyfVar = zzekkVar.zzd;
            f10 = displayMetrics.density;
            i11 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            str2 = zzbyfVar.zzi().zzj();
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr2 = zzrVar.zzg;
        if (zzrVarArr2 != null) {
            boolean z14 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar3 : zzrVarArr2) {
                if (zzrVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i13 = zzrVar3.zze;
                    if (i13 == -1) {
                        i13 = f10 != 0.0f ? (int) (zzrVar3.zzf / f10) : -1;
                    }
                    sb.append(i13);
                    sb.append("x");
                    int i14 = zzrVar3.zzb;
                    if (i14 == -2) {
                        i14 = f10 != 0.0f ? (int) (zzrVar3.zzc / f10) : -2;
                    }
                    sb.append(i14);
                }
            }
            if (z14) {
                if (sb.length() != 0) {
                    i12 = 0;
                    sb.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb.insert(i12, "320x50");
            }
        }
        return new zzekl(zzrVar, str, z10, sb.toString(), f10, i11, i10, str2, zzekkVar.zzb.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return zzgap.zzm(this.zza.zzb(), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzekk.zzc(zzekk.this, (zzesf) obj);
            }
        }, zzbyp.zzg);
    }
}
