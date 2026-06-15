package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzftr {
    public static zzftn zza(zzftn zzftnVar) {
        if ((zzftnVar instanceof zzftq) || (zzftnVar instanceof zzfto)) {
            return zzftnVar;
        }
        if (zzftnVar instanceof Serializable) {
            return new zzfto(zzftnVar);
        }
        return new zzftq(zzftnVar);
    }
}
