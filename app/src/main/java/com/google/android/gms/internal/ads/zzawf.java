package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawf extends zzaws {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzawf(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "496dpPiVBlKLJl+6GqQcdxxWKnNUTzi6YOwAhFFFD6beVSeyQO/1LvIZEYZZJ0Qz", "c4v1i/raIY0Ei0Tuq9iaU99feAhkgfxr3x1mgUKZTmQ=", zzarfVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzz("E");
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (String) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzz(zzh);
        }
    }
}
