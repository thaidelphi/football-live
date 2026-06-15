package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SuppressLint({"InlinedApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzst {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzrz zza() throws zzsn {
        List zzd = zzd("audio/raw", false, false);
        if (zzd.isEmpty()) {
            return null;
        }
        return (zzrz) zzd.get(0);
    }

    public static String zzb(zzz zzzVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzzVar.zzo)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzzVar.zzo) && (zza2 = zzcx.zza(zzzVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (intValue == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (intValue == 1024) {
                return MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(zzzVar.zzo)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    public static List zzc(zzsi zzsiVar, zzz zzzVar, boolean z10, boolean z11) throws zzsn {
        String zzb2 = zzb(zzzVar);
        if (zzb2 == null) {
            return zzfvv.zzn();
        }
        return zzsiVar.zza(zzb2, z10, z11);
    }

    public static synchronized List zzd(String str, boolean z10, boolean z11) throws zzsn {
        synchronized (zzst.class) {
            zzsm zzsmVar = new zzsm(str, z10, z11);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zzsmVar);
            if (list != null) {
                return list;
            }
            ArrayList zzg = zzg(zzsmVar, new zzsq(z10, z11));
            if (z10 && zzg.isEmpty() && zzeh.zza <= 23) {
                zzg = zzg(zzsmVar, new zzsp(null));
                if (!zzg.isEmpty()) {
                    String str2 = ((zzrz) zzg.get(0)).zza;
                    zzdn.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzeh.zza < 26 && zzeh.zzb.equals("R9") && zzg.size() == 1 && ((zzrz) zzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzrz.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzh(zzg, new zzsr() { // from class: com.google.android.gms.internal.ads.zzsk
                    @Override // com.google.android.gms.internal.ads.zzsr
                    public final int zza(Object obj) {
                        int i10 = zzst.zza;
                        String str3 = ((zzrz) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzeh.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzeh.zza < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzrz) zzg.get(0)).zza)) {
                zzg.add((zzrz) zzg.remove(0));
            }
            zzfvv zzl = zzfvv.zzl(zzg);
            hashMap.put(zzsmVar, zzl);
            return zzl;
        }
    }

    public static List zze(zzsi zzsiVar, zzz zzzVar, boolean z10, boolean z11) throws zzsn {
        List zza2 = zzsiVar.zza(zzzVar.zzo, z10, z11);
        List zzc = zzc(zzsiVar, zzzVar, z10, z11);
        int i10 = zzfvv.zzd;
        zzfvs zzfvsVar = new zzfvs();
        zzfvsVar.zzh(zza2);
        zzfvsVar.zzh(zzc);
        return zzfvsVar.zzi();
    }

    public static List zzf(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zzsr() { // from class: com.google.android.gms.internal.ads.zzsl
            @Override // com.google.android.gms.internal.ads.zzsr
            public final int zza(Object obj) {
                int i10 = zzst.zza;
                return ((zzrz) obj).zzd(zzz.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:128|(1:130)(1:131))|68|(1:70)(2:120|(1:127)(1:126))|(4:(2:114|115)|95|(8:98|99|100|101|102|103|104|106)|11)|74|75|76|78|11) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c5, code lost:
        if (r1.zzb == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e4, code lost:
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if ("SCV31".equals(r10) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0191 A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:84:0x0147, B:90:0x015e, B:96:0x0173, B:98:0x0179, B:103:0x0189, B:105:0x0191, B:115:0x01bd, B:106:0x0196, B:108:0x01a6, B:110:0x01ae, B:99:0x017e), top: B:164:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0196 A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:84:0x0147, B:90:0x015e, B:96:0x0173, B:98:0x0179, B:103:0x0189, B:105:0x0191, B:115:0x01bd, B:106:0x0196, B:108:0x01a6, B:110:0x01ae, B:99:0x017e), top: B:164:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0232 A[Catch: Exception -> 0x0280, TRY_ENTER, TryCatch #1 {Exception -> 0x0280, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0034, B:14:0x0042, B:18:0x004c, B:20:0x0054, B:22:0x005c, B:24:0x0066, B:26:0x0070, B:28:0x0078, B:30:0x0080, B:32:0x0088, B:34:0x0090, B:36:0x0098, B:38:0x00a0, B:42:0x00ac, B:44:0x00b4, B:46:0x00bc, B:48:0x00c5, B:141:0x022a, B:144:0x0232, B:146:0x0238, B:147:0x0252, B:148:0x0273, B:51:0x00cf, B:52:0x00d2, B:54:0x00da, B:57:0x00e5, B:59:0x00ed, B:62:0x00f8, B:64:0x0100, B:68:0x010d, B:70:0x0115, B:73:0x0120, B:75:0x0128, B:78:0x0133, B:80:0x013b), top: B:156:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0252 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0179 A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:84:0x0147, B:90:0x015e, B:96:0x0173, B:98:0x0179, B:103:0x0189, B:105:0x0191, B:115:0x01bd, B:106:0x0196, B:108:0x01a6, B:110:0x01ae, B:99:0x017e), top: B:164:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e A[Catch: Exception -> 0x0223, TryCatch #5 {Exception -> 0x0223, blocks: (B:84:0x0147, B:90:0x015e, B:96:0x0173, B:98:0x0179, B:103:0x0189, B:105:0x0191, B:115:0x01bd, B:106:0x0196, B:108:0x01a6, B:110:0x01ae, B:99:0x017e), top: B:164:0x0147 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zzsm r23, com.google.android.gms.internal.ads.zzso r24) throws com.google.android.gms.internal.ads.zzsn {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zzg(com.google.android.gms.internal.ads.zzsm, com.google.android.gms.internal.ads.zzso):java.util.ArrayList");
    }

    private static void zzh(List list, final zzsr zzsrVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzsj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i10 = zzst.zza;
                zzsr zzsrVar2 = zzsr.this;
                return zzsrVar2.zza(obj2) - zzsrVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzeh.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String zza2 = zzfsb.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
