package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgvu {
    static final zzgvu zza = new zzgvu(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgvu zzd;
    private final Map zze;

    zzgvu() {
        this.zze = new HashMap();
    }

    public static zzgvu zza() {
        int i10 = zzgyf.zza;
        return zza;
    }

    public static zzgvu zzb() {
        zzgvu zzgvuVar = zzd;
        if (zzgvuVar != null) {
            return zzgvuVar;
        }
        synchronized (zzgvu.class) {
            zzgvu zzgvuVar2 = zzd;
            if (zzgvuVar2 != null) {
                return zzgvuVar2;
            }
            int i10 = zzgyf.zza;
            zzgvu zzb2 = zzgwc.zzb(zzgvu.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgwi zzc(zzgxv zzgxvVar, int i10) {
        return (zzgwi) this.zze.get(new zzgvt(zzgxvVar, i10));
    }

    zzgvu(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
