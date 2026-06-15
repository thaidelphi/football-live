package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.ironsource.j3;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbei extends zzbeq {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int rgb = Color.rgb(12, 174, (int) j3.c.b.f17916g);
        zzc = rgb;
        zza = Color.rgb(204, 204, 204);
        zzb = rgb;
    }

    public zzbei(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        this.zzd = str;
        for (int i14 = 0; i14 < list.size(); i14++) {
            zzbel zzbelVar = (zzbel) list.get(i14);
            this.zze.add(zzbelVar);
            this.zzf.add(zzbelVar);
        }
        if (num != null) {
            i12 = num.intValue();
        } else {
            i12 = zza;
        }
        this.zzg = i12;
        if (num2 != null) {
            i13 = num2.intValue();
        } else {
            i13 = zzb;
        }
        this.zzh = i13;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i10;
        this.zzk = i11;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}
