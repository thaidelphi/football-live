package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakc {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfwa zze = zzfwa.zzp("auto", "none");
    private static final zzfwa zzf = zzfwa.zzq("dot", "sesame", "circle");
    private static final zzfwa zzg = zzfwa.zzp("filled", "open");
    private static final zzfwa zzh = zzfwa.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzakc(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzakc zza(String str) {
        boolean z10;
        if (str == null) {
            return null;
        }
        String zza = zzfsb.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzfwa zzm = zzfwa.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzfwb.zza(zzfxx.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        int i10 = -1;
        int i11 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z10 = false;
            }
            z10 = true;
        } else {
            if (str2.equals("outside")) {
                z10 = true;
            }
            z10 = true;
        }
        int i12 = z10 ? !z10 ? 1 : -2 : 2;
        zzfxv zzb = zzfxx.zzb(zze, zzm);
        if (!zzb.isEmpty()) {
            String str3 = (String) zzb.iterator().next();
            if (!((str3.hashCode() == 3387192 && str3.equals("none")) ? false : true)) {
                i10 = 0;
            }
        } else {
            zzfxv zzb2 = zzfxx.zzb(zzg, zzm);
            zzfxv zzb3 = zzfxx.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str4 = (String) zzfwb.zza(zzb2, "filled");
                int i13 = (str4.hashCode() == 3417674 && str4.equals("open")) ? false : true ? 1 : 2;
                String str5 = (String) zzfwb.zza(zzb3, "circle");
                int hashCode2 = str5.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str5.equals("dot")) {
                        i10 = 0;
                    }
                } else if (str5.equals("sesame")) {
                    i10 = 1;
                }
                if (i10 == 0) {
                    i10 = 2;
                } else if (i10 != 1) {
                    i11 = i13;
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                i11 = i13;
            }
        }
        return new zzakc(i10, i11, i12);
    }
}
