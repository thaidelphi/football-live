package com.google.android.gms.internal.ads;

import android.graphics.Color;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzajz {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzajz(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
        if (r4 != 3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzajz zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzajx r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajz.zzb(java.lang.String, com.google.android.gms.internal.ads.zzajx):com.google.android.gms.internal.ads.zzajz");
    }

    public static Integer zzc(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            zzcv.zzd(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzfyy.zzb(((parseLong >> 24) & 255) ^ 255), zzfyy.zzb(parseLong & 255), zzfyy.zzb((parseLong >> 8) & 255), zzfyy.zzb((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e8) {
            zzdn.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        zzdn.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e8) {
            zzdn.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e8);
            return false;
        }
    }
}
