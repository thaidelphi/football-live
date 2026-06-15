package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class zzfpl {
    static final String zza = new UUID(0, 0).toString();
    final zzfpk zzb;
    final zzfpj zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpl(Context context, String str, String str2, String str3) {
        this.zzb = zzfpk.zzb(context);
        this.zzc = zzfpj.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 != null ? "not null" : "null");
        throw new IllegalArgumentException(sb.toString());
    }

    final long zza(boolean z10) {
        return this.zzb.zza(z10 ? this.zzg : this.zzf, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfpi zzb(String str, String str2, long j10, boolean z10) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfpi();
        }
        boolean z11 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z11);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    this.zzb.zzd(z11 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j10) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z11);
            if (zze2 == null && !z10) {
                return zzc(str, str2);
            }
            return new zzfpi(zze2, zza(z11));
        }
        throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    final zzfpi zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    final zzfpi zzd(String str, boolean z10) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            this.zzb.zzd(z10 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
            this.zzb.zzd(z10 ? this.zze : this.zzd, str);
            return new zzfpi(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    final String zze(boolean z10) {
        return this.zzb.zzc(z10 ? this.zze : this.zzd, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(boolean z10) throws IOException {
        String str;
        if (z10) {
            str = this.zzg;
        } else {
            str = this.zzf;
        }
        this.zzb.zze(str);
        this.zzb.zze(z10 ? this.zze : this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzd);
    }
}
