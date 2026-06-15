package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavv extends zzaws {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzavv(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "rg86u8Eiqxk6VzSfgrKDoC73JsO3wASlPs0PLBruSPSI51JFquvfLwP4MA3jyAkS", "9xZbPfpRHpBIYpyLBUW5yIyQeOU6mHT//sEzHeVaxyc=", zzarfVar, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (Long) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzo(zzh.longValue());
        }
    }
}
