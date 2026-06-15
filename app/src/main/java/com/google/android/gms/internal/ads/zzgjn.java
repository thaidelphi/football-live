package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgjn {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgjn() {
    }

    public final zzgjn zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzgjp zzb() {
        return new zzgjp(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjn(zzgjo zzgjoVar) {
    }
}
