package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaul extends zzass {
    public long zza;
    public long zzb;

    public zzaul() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzaul(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zza = zzass.zza(str);
        if (zza != null) {
            this.zza = ((Long) zza.get(0)).longValue();
            this.zzb = ((Long) zza.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzass
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
