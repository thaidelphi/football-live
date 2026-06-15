package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.b9;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgn {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str, String str2) {
        long j10 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzdn.zzc("HttpUtil", "Unexpected Content-Length [" + str + b9.i.f16698e);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = zza.matcher(str2);
        if (matcher.matches()) {
            try {
                String group = matcher.group(2);
                Objects.requireNonNull(group);
                long parseLong = Long.parseLong(group);
                String group2 = matcher.group(1);
                Objects.requireNonNull(group2);
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                if (i10 < 0) {
                    return parseLong2;
                }
                if (j10 != parseLong2) {
                    zzdn.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + b9.i.f16698e);
                    return Math.max(j10, parseLong2);
                }
                return j10;
            } catch (NumberFormatException unused2) {
                zzdn.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + b9.i.f16698e);
                return j10;
            }
        }
        return j10;
    }

    public static long zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            return Long.parseLong(group);
        }
        return -1L;
    }
}
