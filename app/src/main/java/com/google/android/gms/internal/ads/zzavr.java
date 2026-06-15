package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavr extends zzaws {
    public zzavr(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "paWE2wqxriEOnjKmZda4l7aMFrHfqXX/fY1F1oJ1dgH9mE52a/hg9qIyflHpJMem", "tie4Nx2Rx4mPGYaXTS6CVbCX9qOpzvyYTYhXBAGWcg8=", zzarfVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzY(3);
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzarf zzarfVar = this.zzd;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzarfVar.zzY(i10);
        } catch (InvocationTargetException e8) {
            if (!(e8.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e8;
            }
        }
    }
}
