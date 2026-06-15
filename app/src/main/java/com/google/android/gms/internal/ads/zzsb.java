package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzsb {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (zzeh.zza >= 29) {
            Boolean bool = zza;
            if (bool == null || !bool.booleanValue()) {
                return zzsa.zza(videoCapabilities, i10, i11, d10);
            }
            return 0;
        }
        return 0;
    }
}
