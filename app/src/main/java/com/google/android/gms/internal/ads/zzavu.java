package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavu extends zzaws {
    public zzavu(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "4Zf4Tomu37/6FX0mX97agkSMasRCdYamHdKukE8saU8mPNW4t6cVjcP7DSXNReFp", "eWfhPdiS5v8GxFs0Hf2vsL2scmctLu9oVNuwcH5ilps=", zzarfVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzm(-1L);
        this.zzd.zzl(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (this.zzd) {
            this.zzd.zzm(iArr[0]);
            this.zzd.zzl(iArr[1]);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                this.zzd.zzk(i10);
            }
        }
    }
}
