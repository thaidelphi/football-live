package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzahs {
    public static zzau zza(zzdx zzdxVar) {
        String str;
        int zzd = zzdxVar.zzd() + zzdxVar.zzg();
        int zzg = zzdxVar.zzg();
        int i10 = (zzg >> 24) & 255;
        zzau zzauVar = null;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = zzg & 16777215;
                if (i11 == 6516084) {
                    int zzg2 = zzdxVar.zzg();
                    if (zzdxVar.zzg() == 1684108385) {
                        zzdxVar.zzM(8);
                        String zzA = zzdxVar.zzA(zzg2 - 16);
                        zzauVar = new zzafo("und", zzA, zzA);
                    } else {
                        zzdn.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzen.zze(zzg)));
                    }
                } else {
                    if (i11 != 7233901 && i11 != 7631467) {
                        if (i11 != 6516589 && i11 != 7828084) {
                            if (i11 == 6578553) {
                                zzauVar = zze(zzg, "TDRC", zzdxVar);
                            } else if (i11 == 4280916) {
                                zzauVar = zze(zzg, "TPE1", zzdxVar);
                            } else if (i11 == 7630703) {
                                zzauVar = zze(zzg, "TSSE", zzdxVar);
                            } else if (i11 == 6384738) {
                                zzauVar = zze(zzg, "TALB", zzdxVar);
                            } else if (i11 == 7108978) {
                                zzauVar = zze(zzg, "USLT", zzdxVar);
                            } else if (i11 == 6776174) {
                                zzauVar = zze(zzg, "TCON", zzdxVar);
                            } else {
                                if (i11 == 6779504) {
                                    zzauVar = zze(zzg, "TIT1", zzdxVar);
                                }
                                zzdn.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzen.zze(zzg));
                            }
                        }
                        zzauVar = zze(zzg, "TCOM", zzdxVar);
                    }
                    zzauVar = zze(zzg, "TIT2", zzdxVar);
                }
            } else if (zzg == 1735291493) {
                String zza = zzafu.zza(zzb(zzdxVar) - 1);
                if (zza != null) {
                    zzauVar = new zzafy("TCON", null, zzfvv.zzo(zza));
                } else {
                    zzdn.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzg == 1684632427) {
                zzauVar = zzd(1684632427, "TPOS", zzdxVar);
            } else if (zzg == 1953655662) {
                zzauVar = zzd(1953655662, "TRCK", zzdxVar);
            } else if (zzg == 1953329263) {
                zzauVar = zzc(1953329263, "TBPM", zzdxVar, true, false);
            } else if (zzg == 1668311404) {
                zzauVar = zzc(1668311404, "TCMP", zzdxVar, true, true);
            } else if (zzg == 1668249202) {
                int zzg3 = zzdxVar.zzg();
                if (zzdxVar.zzg() == 1684108385) {
                    int zzg4 = zzdxVar.zzg();
                    int i12 = zzahk.zza;
                    int i13 = zzg4 & 16777215;
                    if (i13 == 13) {
                        str = "image/jpeg";
                    } else if (i13 == 14) {
                        str = "image/png";
                        i13 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzdn.zzf("MetadataUtil", "Unrecognized cover art flags: " + i13);
                    } else {
                        zzdxVar.zzM(4);
                        int i14 = zzg3 - 16;
                        byte[] bArr = new byte[i14];
                        zzdxVar.zzH(bArr, 0, i14);
                        zzauVar = new zzafk(str, null, 3, bArr);
                    }
                } else {
                    zzdn.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzg == 1631670868) {
                zzauVar = zze(1631670868, "TPE2", zzdxVar);
            } else if (zzg == 1936682605) {
                zzauVar = zze(1936682605, "TSOT", zzdxVar);
            } else if (zzg == 1936679276) {
                zzauVar = zze(1936679276, "TSOA", zzdxVar);
            } else if (zzg == 1936679282) {
                zzauVar = zze(1936679282, "TSOP", zzdxVar);
            } else if (zzg == 1936679265) {
                zzauVar = zze(1936679265, "TSO2", zzdxVar);
            } else if (zzg == 1936679791) {
                zzauVar = zze(1936679791, "TSOC", zzdxVar);
            } else if (zzg == 1920233063) {
                zzauVar = zzc(1920233063, "ITUNESADVISORY", zzdxVar, false, false);
            } else if (zzg == 1885823344) {
                zzauVar = zzc(1885823344, "ITUNESGAPLESS", zzdxVar, false, true);
            } else if (zzg == 1936683886) {
                zzauVar = zze(1936683886, "TVSHOWSORT", zzdxVar);
            } else if (zzg == 1953919848) {
                zzauVar = zze(1953919848, "TVSHOW", zzdxVar);
            } else {
                if (zzg == 757935405) {
                    String str2 = null;
                    String str3 = null;
                    int i15 = -1;
                    int i16 = -1;
                    while (zzdxVar.zzd() < zzd) {
                        int zzd2 = zzdxVar.zzd();
                        int zzg5 = zzdxVar.zzg();
                        int zzg6 = zzdxVar.zzg();
                        zzdxVar.zzM(4);
                        if (zzg6 == 1835360622) {
                            str2 = zzdxVar.zzA(zzg5 - 12);
                        } else {
                            int i17 = zzg5 - 12;
                            if (zzg6 == 1851878757) {
                                str3 = zzdxVar.zzA(i17);
                            } else {
                                if (zzg6 == 1684108385) {
                                    i16 = zzg5;
                                }
                                if (zzg6 == 1684108385) {
                                    i15 = zzd2;
                                }
                                zzdxVar.zzM(i17);
                            }
                        }
                    }
                    if (str2 != null && str3 != null && i15 != -1) {
                        zzdxVar.zzL(i15);
                        zzdxVar.zzM(16);
                        zzauVar = new zzafv(str2, str3, zzdxVar.zzA(i16 - 16));
                    }
                }
                zzdn.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzen.zze(zzg));
            }
            return zzauVar;
        } finally {
            zzdxVar.zzL(zzd);
        }
    }

    private static int zzb(zzdx zzdxVar) {
        int zzg = zzdxVar.zzg();
        if (zzdxVar.zzg() == 1684108385) {
            zzdxVar.zzM(8);
            int i10 = zzg - 16;
            if (i10 == 1) {
                return zzdxVar.zzm();
            }
            if (i10 == 2) {
                return zzdxVar.zzq();
            }
            if (i10 != 3) {
                if (i10 == 4 && (zzdxVar.zzf() & 128) == 0) {
                    return zzdxVar.zzp();
                }
            } else {
                return zzdxVar.zzo();
            }
        }
        zzdn.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzaft zzc(int i10, String str, zzdx zzdxVar, boolean z10, boolean z11) {
        int zzb = zzb(zzdxVar);
        if (z11) {
            zzb = Math.min(1, zzb);
        }
        if (zzb < 0) {
            zzdn.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzen.zze(i10)));
            return null;
        } else if (z10) {
            return new zzafy(str, null, zzfvv.zzo(Integer.toString(zzb)));
        } else {
            return new zzafo("und", str, Integer.toString(zzb));
        }
    }

    private static zzafy zzd(int i10, String str, zzdx zzdxVar) {
        int zzg = zzdxVar.zzg();
        if (zzdxVar.zzg() == 1684108385 && zzg >= 22) {
            zzdxVar.zzM(10);
            int zzq = zzdxVar.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzdxVar.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + "/" + zzq2;
                }
                return new zzafy(str, null, zzfvv.zzo(sb2));
            }
        }
        zzdn.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzen.zze(i10)));
        return null;
    }

    private static zzafy zze(int i10, String str, zzdx zzdxVar) {
        int zzg = zzdxVar.zzg();
        if (zzdxVar.zzg() == 1684108385) {
            zzdxVar.zzM(8);
            return new zzafy(str, null, zzfvv.zzo(zzdxVar.zzA(zzg - 16)));
        }
        zzdn.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzen.zze(i10)));
        return null;
    }
}
