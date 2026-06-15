package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfwl {
    public static ArrayList zza(int i10) {
        zzfus.zza(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List zzb(List list, zzfsk zzfskVar) {
        if (list instanceof RandomAccess) {
            return new zzfwi(list, zzfskVar);
        }
        return new zzfwk(list, zzfskVar);
    }
}
