package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzafd {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaez zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafd.zza(java.lang.String):com.google.android.gms.internal.ads.zzaez");
    }

    private static zzfvv zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i10 = zzfvv.zzd;
        zzfvs zzfvsVar = new zzfvs();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzei.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzei.zza(xmlPullParser, concat2);
                String zza3 = zzei.zza(xmlPullParser, concat3);
                String zza4 = zzei.zza(xmlPullParser, concat4);
                String zza5 = zzei.zza(xmlPullParser, concat5);
                if (zza2 != null && zza3 != null) {
                    zzfvsVar.zzf(new zzaey(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
                } else {
                    return zzfvv.zzn();
                }
            }
        } while (!zzei.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfvsVar.zzi();
    }
}
