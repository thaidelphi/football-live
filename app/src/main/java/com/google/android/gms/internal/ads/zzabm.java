package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzabm {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1001, 1000, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, com.ironsource.mediationsdk.metadata.a.f18931n};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzz zza(com.google.android.gms.internal.ads.zzdx r18, java.lang.String r19, java.lang.String r20, com.google.android.gms.internal.ads.zzs r21) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabm.zza(com.google.android.gms.internal.ads.zzdx, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzs):com.google.android.gms.internal.ads.zzz");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r11 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r11 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
        if (r11 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzabk zzb(com.google.android.gms.internal.ads.zzdw r11) {
        /*
            r0 = 16
            int r1 = r11.zzd(r0)
            int r0 = r11.zzd(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r11.zzd(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r11.zzd(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3d
            r1 = r3
        L2c:
            int r5 = r11.zzd(r0)
            int r1 = r1 + r5
            boolean r5 = r11.zzp()
            if (r5 != 0) goto L39
            int r1 = r1 + r4
            goto L3d
        L39:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3d:
            r5 = 10
            int r5 = r11.zzd(r5)
            boolean r6 = r11.zzp()
            if (r6 == 0) goto L52
            int r6 = r11.zzd(r4)
            if (r6 <= 0) goto L52
            r11.zzn(r0)
        L52:
            boolean r6 = r11.zzp()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L61
            r6 = r8
            goto L62
        L61:
            r6 = r9
        L62:
            int r11 = r11.zzd(r2)
            if (r6 != r8) goto L72
            r8 = 13
            if (r11 != r8) goto L72
            int[] r11 = com.google.android.gms.internal.ads.zzabm.zzb
            r11 = r11[r8]
            r8 = r11
            goto L9e
        L72:
            if (r6 != r9) goto L9d
            r8 = 14
            if (r11 >= r8) goto L9d
            int[] r3 = com.google.android.gms.internal.ads.zzabm.zzb
            r3 = r3[r11]
            int r5 = r5 % 5
            r8 = 8
            if (r5 == r10) goto L97
            r9 = 11
            if (r5 == r0) goto L92
            if (r5 == r4) goto L97
            if (r5 == r2) goto L8b
            goto L9d
        L8b:
            if (r11 == r4) goto L9b
            if (r11 == r8) goto L9b
            if (r11 != r9) goto L9d
            goto L9b
        L92:
            if (r11 == r8) goto L9b
            if (r11 != r9) goto L9d
            goto L9b
        L97:
            if (r11 == r4) goto L9b
            if (r11 != r8) goto L9d
        L9b:
            int r3 = r3 + 1
        L9d:
            r8 = r3
        L9e:
            com.google.android.gms.internal.ads.zzabk r11 = new com.google.android.gms.internal.ads.zzabk
            r5 = 2
            r9 = 0
            r3 = r11
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabm.zzb(com.google.android.gms.internal.ads.zzdw):com.google.android.gms.internal.ads.zzabk");
    }

    public static void zzc(int i10, zzdx zzdxVar) {
        zzdxVar.zzI(7);
        byte[] zzN = zzdxVar.zzN();
        zzN[0] = -84;
        zzN[1] = 64;
        zzN[2] = -1;
        zzN[3] = -1;
        zzN[4] = (byte) ((i10 >> 16) & 255);
        zzN[5] = (byte) ((i10 >> 8) & 255);
        zzN[6] = (byte) (i10 & 255);
    }

    private static void zzd(zzdw zzdwVar, zzabj zzabjVar) throws zzaz {
        int zzd = zzdwVar.zzd(5);
        zzdwVar.zzn(2);
        if (zzdwVar.zzp()) {
            zzdwVar.zzn(5);
        }
        if (zzd >= 7 && zzd <= 10) {
            zzdwVar.zzm();
        }
        if (zzdwVar.zzp()) {
            int zzd2 = zzdwVar.zzd(3);
            if (zzabjVar.zzb == -1 && zzd >= 0 && zzd <= 15 && (zzd2 == 0 || zzd2 == 1)) {
                zzabjVar.zzb = zzd;
            }
            if (zzdwVar.zzp()) {
                zzf(zzdwVar);
            }
        }
    }

    private static void zze(zzdw zzdwVar, zzabj zzabjVar) throws zzaz {
        zzdwVar.zzn(2);
        boolean zzp = zzdwVar.zzp();
        int zzd = zzdwVar.zzd(8);
        for (int i10 = 0; i10 < zzd; i10++) {
            zzdwVar.zzn(2);
            if (zzdwVar.zzp()) {
                zzdwVar.zzn(5);
            }
            if (zzp) {
                zzdwVar.zzn(24);
            } else {
                if (zzdwVar.zzp()) {
                    if (!zzdwVar.zzp()) {
                        zzdwVar.zzn(4);
                    }
                    zzabjVar.zzc = zzdwVar.zzd(6) + 1;
                }
                zzdwVar.zzn(4);
            }
        }
        if (zzdwVar.zzp()) {
            zzdwVar.zzn(3);
            if (zzdwVar.zzp()) {
                zzf(zzdwVar);
            }
        }
    }

    private static void zzf(zzdw zzdwVar) throws zzaz {
        int zzd = zzdwVar.zzd(6);
        if (zzd >= 2 && zzd <= 42) {
            zzdwVar.zzn(zzd * 8);
            return;
        }
        throw zzaz.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(zzd)));
    }

    private static boolean zzg(zzdw zzdwVar) {
        if (zzdwVar.zza() < 66) {
            return false;
        }
        zzdwVar.zzn(66);
        return true;
    }
}
