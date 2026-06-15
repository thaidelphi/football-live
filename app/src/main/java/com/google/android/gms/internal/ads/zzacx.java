package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacx {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = zzeh.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzav zzavVar) {
        for (int i10 = 0; i10 < zzavVar.zza(); i10++) {
            zzau zzb = zzavVar.zzb(i10);
            if (zzb instanceof zzafo) {
                zzafo zzafoVar = (zzafo) zzb;
                if ("iTunSMPB".equals(zzafoVar.zzb) && zzc(zzafoVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzafv) {
                zzafv zzafvVar = (zzafv) zzb;
                if ("com.apple.iTunes".equals(zzafvVar.zza) && "iTunSMPB".equals(zzafvVar.zzb) && zzc(zzafvVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
