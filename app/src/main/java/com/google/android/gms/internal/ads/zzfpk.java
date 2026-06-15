package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfpk {
    private static zzfpk zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfpk(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfpk zzb(Context context) {
        if (zza == null) {
            zza = new zzfpk(context);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(String str, long j10) {
        return this.zzc.getLong(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str, Object obj) throws IOException {
        boolean commit;
        if (obj instanceof String) {
            commit = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else if (obj instanceof Integer) {
            commit = this.zzc.edit().putInt(str, ((Integer) obj).intValue()).commit();
        } else {
            String valueOf = String.valueOf(obj.getClass());
            String str2 = this.zzb;
            Log.e("GpidLifecycleSPHandler", "Unexpected object class " + valueOf + " for app " + str2);
            String str3 = this.zzb;
            throw new IOException("Failed to store " + str + " for app " + str3);
        }
        if (commit) {
            return;
        }
        String str32 = this.zzb;
        throw new IOException("Failed to store " + str + " for app " + str32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.zzb;
        throw new IOException("Failed to remove " + str + " for app " + str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf(String str, boolean z10) {
        return this.zzc.getBoolean(str, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
