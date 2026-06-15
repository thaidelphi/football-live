package com.google.android.gms.internal.ads;

import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfks {
    private final zzfjt zza;
    private final ArrayList zzb;

    public zzfks(zzfjt zzfjtVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfjtVar;
        arrayList.add(str);
    }

    public final zzfjt zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
