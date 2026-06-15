package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfxe extends zzfxg implements Serializable {
    static final zzfxe zza = new zzfxe();

    private zzfxe() {
    }

    @Override // com.google.android.gms.internal.ads.zzfxg, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zza() {
        return zzfxo.zza;
    }
}
