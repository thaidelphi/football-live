package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgay {
    private final zzftu zza = new zzftu();
    private final String zzb;
    private volatile Logger zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgay(Class cls) {
        this.zzb = cls.getName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
