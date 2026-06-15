package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawn extends zzaws {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawn(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "dA064m2ZUYG0yhXwELrkTlzdvl2eO4aE5sy5cB8j/bTSuEue0U48dVh9pkXbFiE1", "F2M5z4XeTn27F5LKy6wt7Gr39E0q7FeQyL+BvA48crs=", zzarfVar, i10, 33);
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
            this.zzd.zzT(zzh.longValue());
        }
    }
}
