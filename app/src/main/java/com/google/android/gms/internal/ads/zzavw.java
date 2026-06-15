package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavw extends zzaws {
    private final long zzh;

    public zzavw(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, long j10, int i10, int i11) {
        super(zzavfVar, "ZFQ8Usl03GVbm6FFMmeSH7p/f/dDlZfuQw0gtftw4j1XaHWjVibn46gmN/WjoCN2", "nES3L8mGkoWrH5JqEq3hlXv3CaWWC5TytOWxYGABsdE=", zzarfVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        synchronized (this.zzd) {
            this.zzd.zzr(longValue);
            long j10 = this.zzh;
            if (j10 != 0) {
                this.zzd.zzR(longValue - j10);
                this.zzd.zzS(this.zzh);
            }
        }
    }
}
