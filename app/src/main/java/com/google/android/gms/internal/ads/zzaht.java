package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaht {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z10 = false;
        while (it.hasNext()) {
            String str2 = ((zzaif) it.next()).zza.zzg.zzo;
            if (zzay.zzj(str2)) {
                return "video/mp4";
            }
            if (zzay.zzh(str2)) {
                z10 = true;
            } else if (zzay.zzi(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
