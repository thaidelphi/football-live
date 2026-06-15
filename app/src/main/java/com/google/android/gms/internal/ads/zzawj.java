package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawj extends zzaws {
    private final boolean zzh;

    public zzawj(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "lX7Ros7P0iIUcvtNHUv4w251LjEysSeKk+GMaeRlDGSoAtFhlMV2cZDKW9all6MA", "Nja0+UFQndq3CGvmIApKkpLrE9ayFb3u5RBufCtuuPA=", zzarfVar, i10, 61);
        this.zzh = zzavfVar.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        synchronized (this.zzd) {
            this.zzd.zzC(longValue);
        }
    }
}
