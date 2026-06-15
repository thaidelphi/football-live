package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakp {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzdx zzc = new zzdx();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzdx zzdxVar, StringBuilder sb) {
        zzc(zzdxVar);
        if (zzdxVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzdxVar, sb);
        if ("".equals(zzd)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((char) zzdxVar.zzm());
            return sb2.toString();
        }
        return zzd;
    }

    static void zzc(zzdx zzdxVar) {
        while (true) {
            for (boolean z10 = true; zzdxVar.zzb() > 0 && z10; z10 = false) {
                char c10 = (char) zzdxVar.zzN()[zzdxVar.zzd()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzdxVar.zzM(1);
                } else {
                    int zzd = zzdxVar.zzd();
                    int zze = zzdxVar.zze();
                    byte[] zzN = zzdxVar.zzN();
                    if (zzd + 2 <= zze) {
                        int i10 = zzd + 1;
                        if (zzN[zzd] == 47) {
                            int i11 = i10 + 1;
                            if (zzN[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= zze) {
                                        break;
                                    } else if (((char) zzN[i11]) == '*' && ((char) zzN[i12]) == '/') {
                                        zze = i12 + 1;
                                        i11 = zze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzdxVar.zzM(zze - zzdxVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzdx zzdxVar, StringBuilder sb) {
        sb.setLength(0);
        int zzd = zzdxVar.zzd();
        int zze = zzdxVar.zze();
        loop0: while (true) {
            for (boolean z10 = false; zzd < zze && !z10; z10 = true) {
                char c10 = (char) zzdxVar.zzN()[zzd];
                if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                    sb.append(c10);
                    zzd++;
                }
            }
        }
        zzdxVar.zzM(zzd - zzdxVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x031a, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzdx r18) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakp.zzb(com.google.android.gms.internal.ads.zzdx):java.util.List");
    }
}
