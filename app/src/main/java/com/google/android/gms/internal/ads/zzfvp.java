package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfvp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i10, int i11) {
        if (i11 >= 0) {
            if (i11 <= i10) {
                return i10;
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            return i12 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12;
        }
        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
    }

    public abstract zzfvp zzb(Object obj);
}
