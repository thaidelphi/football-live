package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaef implements zzadx {
    public final zzfvv zza;
    private final int zzb;

    private zzaef(int i10, zzfvv zzfvvVar) {
        this.zzb = i10;
        this.zza = zzfvvVar;
    }

    public static zzaef zzc(int i10, zzdx zzdxVar) {
        String str;
        zzfvs zzfvsVar = new zzfvs();
        int zze = zzdxVar.zze();
        int i11 = -2;
        while (zzdxVar.zzb() > 8) {
            int zzi = zzdxVar.zzi();
            int zzd = zzdxVar.zzd() + zzdxVar.zzi();
            zzdxVar.zzK(zzd);
            zzadx zzadxVar = null;
            if (zzi == 1414744396) {
                zzadxVar = zzc(zzdxVar.zzi(), zzdxVar);
            } else {
                switch (zzi) {
                    case 1718776947:
                        if (i11 != 2) {
                            if (i11 == 1) {
                                int zzk = zzdxVar.zzk();
                                String str2 = zzk != 1 ? zzk != 85 ? zzk != 255 ? zzk != 8192 ? zzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 == null) {
                                    zzdn.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzk);
                                    break;
                                } else {
                                    int zzk2 = zzdxVar.zzk();
                                    int zzi2 = zzdxVar.zzi();
                                    zzdxVar.zzM(6);
                                    int zzn = zzeh.zzn(zzdxVar.zzk());
                                    int zzk3 = zzdxVar.zzb() > 0 ? zzdxVar.zzk() : 0;
                                    zzx zzxVar = new zzx();
                                    zzxVar.zzad(str2);
                                    zzxVar.zzB(zzk2);
                                    zzxVar.zzae(zzi2);
                                    if (str2.equals("audio/raw") && zzn != 0) {
                                        zzxVar.zzX(zzn);
                                    }
                                    if (str2.equals("audio/mp4a-latm") && zzk3 > 0) {
                                        byte[] bArr = new byte[zzk3];
                                        zzdxVar.zzH(bArr, 0, zzk3);
                                        zzxVar.zzP(zzfvv.zzo(bArr));
                                    }
                                    zzadxVar = new zzaeg(zzxVar.zzaj());
                                    break;
                                }
                            } else {
                                zzdn.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzeh.zzD(i11)));
                                break;
                            }
                        } else {
                            zzdxVar.zzM(4);
                            int zzi3 = zzdxVar.zzi();
                            int zzi4 = zzdxVar.zzi();
                            zzdxVar.zzM(4);
                            int zzi5 = zzdxVar.zzi();
                            switch (zzi5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                zzdn.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + zzi5);
                                break;
                            } else {
                                zzx zzxVar2 = new zzx();
                                zzxVar2.zzai(zzi3);
                                zzxVar2.zzM(zzi4);
                                zzxVar2.zzad(str);
                                zzadxVar = new zzaeg(zzxVar2.zzaj());
                                break;
                            }
                        }
                    case 1751742049:
                        zzadxVar = zzaec.zzb(zzdxVar);
                        break;
                    case 1752331379:
                        zzadxVar = zzaed.zzd(zzdxVar);
                        break;
                    case 1852994675:
                        zzadxVar = zzaeh.zzb(zzdxVar);
                        break;
                }
            }
            if (zzadxVar != null) {
                if (zzadxVar.zza() == 1752331379) {
                    i11 = ((zzaed) zzadxVar).zzb();
                }
                zzfvsVar.zzf(zzadxVar);
            }
            zzdxVar.zzL(zzd);
            zzdxVar.zzK(zze);
        }
        return new zzaef(i10, zzfvsVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zza() {
        return this.zzb;
    }

    public final zzadx zzb(Class cls) {
        zzfvv zzfvvVar = this.zza;
        int size = zzfvvVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzadx zzadxVar = (zzadx) zzfvvVar.get(i10);
            i10++;
            if (zzadxVar.getClass() == cls) {
                return zzadxVar;
            }
        }
        return null;
    }
}
