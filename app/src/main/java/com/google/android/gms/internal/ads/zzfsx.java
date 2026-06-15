package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfsx implements Serializable, zzfsw {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfsx) {
            return this.zza.equals(((zzfsx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z10 = true;
        for (Object obj : this.zza) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (!((zzfsw) this.zza.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
