package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzawm extends zzaws {
    private final zzavm zzh;
    private long zzi;

    public zzawm(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, zzavm zzavmVar) {
        super(zzavfVar, "mL/M8ecQGt8RmCRDQPcbWEE+oWeZ4Wc+YCIErjOqEy2nibA6S7moTyTBkn8UDgvs", "KC/lBg1nYoL5pL7BWJbzywoEHmWUpTVVfaLhnCVLguw=", zzarfVar, i10, 53);
        this.zzh = zzavmVar;
        if (zzavmVar != null) {
            this.zzi = zzavmVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzN(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
