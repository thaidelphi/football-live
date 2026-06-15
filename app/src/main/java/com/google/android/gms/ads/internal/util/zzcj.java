package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import com.ironsource.xn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzcj {

    /* renamed from: b  reason: collision with root package name */
    private static List f11475b;

    /* renamed from: a  reason: collision with root package name */
    private static final Map f11474a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11476c = new Object();

    private static Integer[] a(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    public static List zza(String str) {
        ArrayList arrayList;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Object obj = f11476c;
        synchronized (obj) {
            Map map = f11474a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    if (f11475b == null) {
                        f11475b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f11475b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", a(videoCapabilities.getSupportedHeights()));
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            arrayList.add(hashMap);
                        }
                    }
                    f11474a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e8) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(xn.a.f21422g, e8.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f11474a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }
}
