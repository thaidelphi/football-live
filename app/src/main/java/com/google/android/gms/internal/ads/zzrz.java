package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.b9;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzrz {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    zzrz(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = z16;
        this.zzi = zzay.zzj(str2);
    }

    public static zzrz zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z15 = false;
        } else {
            int i10 = zzeh.zza;
            z15 = true;
        }
        return new zzrz(str, str2, str3, codecCapabilities, z10, z11, z12, z15, codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z14 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), zzeh.zza >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = zzeh.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzeh.zze;
        zzdn.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + str2 + b9.i.f16698e);
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point zzi = zzi(videoCapabilities, i10, i11);
        int i12 = zzi.x;
        int i13 = zzi.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private final boolean zzl(zzz zzzVar, boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10 = zzst.zza;
        Pair zza = zzcx.zza(zzzVar);
        String str = zzzVar.zzo;
        char c10 = 65535;
        if (str != null && str.equals("video/mv-hevc")) {
            String zze = zzay.zze(this.zzc);
            if (!zze.equals("video/mv-hevc")) {
                if (zze.equals(MimeTypes.VIDEO_H265)) {
                    String zzh = zzfd.zzh(zzzVar.zzr);
                    if (zzh == null) {
                        zza = null;
                    } else {
                        String trim = zzh.trim();
                        int i11 = zzeh.zza;
                        zza = zzcx.zzb(zzh, trim.split("\\.", -1), zzzVar.zzC);
                    }
                }
            }
            return true;
        }
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(zzzVar.zzo)) {
                String str2 = this.zzb;
                int hashCode = str2.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str2.equals(MimeTypes.VIDEO_H264)) {
                            c10 = 0;
                        }
                    } else if (str2.equals(MimeTypes.VIDEO_H265)) {
                        c10 = 1;
                    }
                } else if (str2.equals(MimeTypes.VIDEO_AV1)) {
                    c10 = 2;
                }
                if (c10 == 0) {
                    intValue = 8;
                } else if (c10 == 1 || c10 == 2) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzi) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh2 = zzh();
            if (zzeh.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh2.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i12 = 1024;
                } else if (intValue3 >= 120000000) {
                    i12 = AdRequest.MAX_CONTENT_URL_LENGTH;
                } else if (intValue3 >= 60000000) {
                    i12 = 256;
                } else if (intValue3 >= 30000000) {
                    i12 = 128;
                } else if (intValue3 >= 18000000) {
                    i12 = 64;
                } else if (intValue3 >= 12000000) {
                    i12 = 32;
                } else if (intValue3 >= 7200000) {
                    i12 = 16;
                } else if (intValue3 < 3600000) {
                    i12 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i12;
                zzh2 = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh2) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                    if (MimeTypes.VIDEO_H265.equals(this.zzb) && intValue == 2) {
                        String str3 = zzeh.zzb;
                        if (!"sailfish".equals(str3) && !"marlin".equals(str3)) {
                        }
                    }
                }
            }
            zzj("codec.profileLevel, " + zzzVar.zzk + ", " + this.zzc);
            return false;
        }
        return true;
    }

    private final boolean zzm(zzz zzzVar) {
        return this.zzb.equals(zzzVar.zzo) || this.zzb.equals(zzst.zzb(zzzVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i10, i11);
    }

    public final zzhk zzb(zzz zzzVar, zzz zzzVar2) {
        String str = zzzVar2.zzo;
        int i10 = zzeh.zza;
        int i11 = true != Objects.equals(zzzVar.zzo, str) ? 8 : 0;
        if (this.zzi) {
            if (zzzVar.zzy != zzzVar2.zzy) {
                i11 |= 1024;
            }
            if (!this.zze && (zzzVar.zzv != zzzVar2.zzv || zzzVar.zzw != zzzVar2.zzw)) {
                i11 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if ((!zzk.zzg(zzzVar.zzC) || !zzk.zzg(zzzVar2.zzC)) && !Objects.equals(zzzVar.zzC, zzzVar2.zzC)) {
                i11 |= com.ironsource.mediationsdk.metadata.a.f18931n;
            }
            String str2 = this.zza;
            if (zzeh.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str2) && !zzzVar.zzd(zzzVar2)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zzhk(this.zza, zzzVar, zzzVar2, true != zzzVar.zzd(zzzVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzzVar.zzE != zzzVar2.zzE) {
                i11 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            }
            if (zzzVar.zzF != zzzVar2.zzF) {
                i11 |= 8192;
            }
            if (zzzVar.zzG != zzzVar2.zzG) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i12 = zzst.zza;
                Pair zza = zzcx.zza(zzzVar);
                Pair zza2 = zzcx.zza(zzzVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzhk(this.zza, zzzVar, zzzVar2, 3, 0);
                    }
                }
            }
            if (!zzzVar.zzd(zzzVar2)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new zzhk(this.zza, zzzVar, zzzVar2, 1, 0);
            }
        }
        return new zzhk(this.zza, zzzVar, zzzVar2, 0, i11);
    }

    public final boolean zzd(zzz zzzVar) {
        return zzm(zzzVar) && zzl(zzzVar, false);
    }

    public final boolean zze(zzz zzzVar) throws zzsn {
        int i10;
        int i11;
        if (zzm(zzzVar) && zzl(zzzVar, true)) {
            if (this.zzi) {
                int i12 = zzzVar.zzv;
                if (i12 <= 0 || (i11 = zzzVar.zzw) <= 0) {
                    return true;
                }
                return zzg(i12, i11, zzzVar.zzx);
            }
            int i13 = zzzVar.zzF;
            if (i13 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    zzj("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzj("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i13)) {
                    zzj("sampleRate.support, " + i13);
                    return false;
                }
            }
            int i14 = zzzVar.zzE;
            if (i14 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzj("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    zzj("channelCount.aCaps");
                    return false;
                }
                String str = this.zza;
                String str2 = this.zzb;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((zzeh.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i10 = 6;
                    } else {
                        i10 = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    zzdn.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + b9.i.f16698e);
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i14) {
                    zzj("channelCount.support, " + i14);
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean zzf(zzz zzzVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i10 = zzst.zza;
        Pair zza = zzcx.zza(zzzVar);
        return zza != null && ((Integer) zza.first).intValue() == 42;
    }

    public final boolean zzg(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzeh.zza >= 29) {
            int zza = zzsb.zza(videoCapabilities, i10, i11, d10);
            if (zza != 2) {
                if (zza == 1) {
                    zzj("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzeh.zzb)) && zzk(videoCapabilities, i11, i10, d10))) {
                zzdn.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10) + "] [" + this.zza + ", " + this.zzb + "] [" + zzeh.zze + b9.i.f16698e);
            } else {
                zzj("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
