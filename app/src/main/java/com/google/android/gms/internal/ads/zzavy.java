package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavy extends zzaws {
    private final zzavg zzh;

    public zzavy(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, zzavg zzavgVar) {
        super(zzavfVar, "mkxT9wGwpYvc37eJUy/mO8MzFK5vy/fyoqxDYyLTauyqugfjwzRoZnGwCYMOffWM", "yrKApWIiogD/j2z8LlUnSlw79Wsq7FxRW56QjqqoswM=", zzarfVar, i10, 85);
        this.zzh = zzavgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zze.invoke(null, Long.valueOf(this.zzh.zzd()), Long.valueOf(this.zzh.zzh()), Long.valueOf(this.zzh.zzb()), Long.valueOf(this.zzh.zzf()));
        synchronized (this.zzd) {
            this.zzd.zzt(jArr[0]);
            this.zzd.zzs(jArr[1]);
        }
    }
}
