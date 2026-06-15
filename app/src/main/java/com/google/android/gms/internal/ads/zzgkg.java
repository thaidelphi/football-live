package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkg {
    private HashMap zza = new HashMap();

    public final zzgki zza() {
        if (this.zza != null) {
            zzgki zzgkiVar = new zzgki(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzgkiVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
