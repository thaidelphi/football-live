package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawc extends zzaws {
    private final zzaux zzh;

    public zzawc(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, zzaux zzauxVar) {
        super(zzavfVar, "YKQeaDOOJVYHYUK9Ci1tFvlnBAOpZht8/yLFuhAxLhcKuJay9vHjP+2zexHIKVEK", "wbzNkREEDJTKf6ocL1NI4RyoZkRM8VXZy0kVyFaQp5o=", zzarfVar, i10, 94);
        this.zzh = zzauxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzab(zzarr.zza(intValue));
        }
    }
}
