package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import com.unity3d.services.core.device.MimeTypes;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzsa {
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = r2.getSupportedPerformancePoints()
            r0 = 0
            if (r2 == 0) goto L51
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le
            goto L51
        Le:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
            r6.<init>(r3, r4, r5)
            int r2 = zzc(r2, r6)
            r3 = 1
            if (r2 != r3) goto L50
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zzsb.zzb()
            if (r4 != 0) goto L50
            int r4 = com.google.android.gms.internal.ads.zzeh.zza
            r5 = 35
            if (r4 < r5) goto L29
        L27:
            r3 = r0
            goto L3e
        L29:
            int r4 = zzb(r0)
            int r5 = zzb(r3)
            if (r4 != 0) goto L34
            goto L3e
        L34:
            r6 = 2
            if (r5 != 0) goto L3a
            if (r4 == r6) goto L27
            goto L3e
        L3a:
            if (r4 != r6) goto L3e
            if (r5 == r6) goto L27
        L3e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zzsb.zzc(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zzsb.zzb()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L50
            return r0
        L50:
            return r2
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(boolean z10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzx zzxVar = new zzx();
            zzxVar.zzad(MimeTypes.VIDEO_H264);
            zzz zzaj = zzxVar.zzaj();
            if (zzaj.zzo != null) {
                List zze = zzst.zze(zzsi.zza, zzaj, z10, false);
                for (int i10 = 0; i10 < zze.size(); i10++) {
                    if (((zzrz) zze.get(i10)).zzd != null && ((zzrz) zze.get(i10)).zzd.getVideoCapabilities() != null && (supportedPerformancePoints = ((zzrz) zze.get(i10)).zzd.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (zzsn unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i10)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
