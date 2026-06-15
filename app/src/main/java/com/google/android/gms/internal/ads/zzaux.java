package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaux {
    private List zza = Collections.emptyList();

    public final List zza() {
        List list = this.zza;
        this.zza = Collections.emptyList();
        return list;
    }

    public final void zzb(List list) {
        this.zza = new ArrayList(list);
    }
}
