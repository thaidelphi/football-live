package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawo extends zzaws {
    public zzawo(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11) {
        super(zzavfVar, "qcIEHLTfCREySmhTcfhBykVOucbCVf1J7ci0US35SgegClSZdV4T0wPo3J98WqQi", "bWwqZRSWUz53lqOJOzvFWLzapmrfK2QHVsSIKaZ59UU=", zzarfVar, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzad(3);
        boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (this.zzd) {
            if (booleanValue) {
                this.zzd.zzad(2);
            } else {
                this.zzd.zzad(1);
            }
        }
    }
}
