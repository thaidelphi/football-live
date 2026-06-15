package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfxg implements Comparator {
    public static zzfxg zzb(Comparator comparator) {
        return new zzfvg(comparator);
    }

    public static zzfxg zzc() {
        return zzfxe.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfxg zza() {
        return new zzfxp(this);
    }
}
