package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzapm {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e8) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                zzapb.zzc(e8, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzapb.zzd("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzany zzb(zzaol zzaolVar) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaolVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i11 = 0;
            j10 = 0;
            j11 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z10) {
            j13 = currentTimeMillis + (j11 * 1000);
            if (i10 != 0) {
                j14 = j13;
            } else {
                Long.signum(j10);
                j14 = (j10 * 1000) + j13;
            }
            j12 = j14;
        } else {
            j12 = 0;
            if (zza <= 0 || zza2 < zza) {
                j13 = 0;
            } else {
                j13 = currentTimeMillis + (zza2 - zza);
                j12 = j13;
            }
        }
        zzany zzanyVar = new zzany();
        zzanyVar.zza = zzaolVar.zzb;
        zzanyVar.zzb = str5;
        zzanyVar.zzf = j13;
        zzanyVar.zze = j12;
        zzanyVar.zzc = zza;
        zzanyVar.zzd = zza3;
        zzanyVar.zzg = map;
        zzanyVar.zzh = zzaolVar.zzd;
        return zzanyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
