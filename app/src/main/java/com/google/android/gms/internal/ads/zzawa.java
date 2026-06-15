package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawa extends zzaws {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawa(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "lCB1qsaFUgDlpQrt2rxj7m3A5YhpggpEdNl1gJJq1my0pJeHpAUzwbqaBzvZY/fJ", "bxqysg92iiyTrXcgOUndsxm+L6ljg9XZlLWW9ddD2SQ=", zzarfVar, i10, 22);
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
            this.zzd.zzw(zzh.longValue());
        }
    }
}
