package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawl extends zzaws {
    public zzawl(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "9izW6FUFLtk62QdjeeyIqMl6xfXLTARD/lNnuQcL/Hc/sSg4XbTVIcokF7QF16TK", "RjTdzEksaRWw8AKKv6gPwS/gYbKt5UcAWH2+r4IISBo=", zzarfVar, i10, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zzd) {
            zzava zzavaVar = new zzava((String) this.zze.invoke(null, new Object[0]));
            this.zzd.zzp(zzavaVar.zza.longValue());
            this.zzd.zzq(zzavaVar.zzb.longValue());
        }
    }
}
