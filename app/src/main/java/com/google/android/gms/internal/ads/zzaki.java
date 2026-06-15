package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaki {
    public static zzakj zza(zzakj zzakjVar, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzakjVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzakj) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzakj zzakjVar2 = new zzakj();
                while (i10 < length2) {
                    zzakjVar2.zzl((zzakj) map.get(strArr[i10]));
                    i10++;
                }
                return zzakjVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            zzakjVar.zzl((zzakj) map.get(strArr[0]));
            return zzakjVar;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i10 < length) {
                zzakjVar.zzl((zzakj) map.get(strArr[i10]));
                i10++;
            }
        }
        return zzakjVar;
    }
}
