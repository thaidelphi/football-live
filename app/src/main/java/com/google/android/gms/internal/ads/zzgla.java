package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgla {
    private static final zzgla zza = new zzgla();
    private final Map zzb = new HashMap();

    zzgla() {
    }

    public static zzgla zzb() {
        return zza;
    }

    public final synchronized zzgcs zza(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey("AES128_GCM")) {
        } else {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgcs) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzgcs zzgcsVar) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
            if (((zzgcs) this.zzb.get(str)).equals(zzgcsVar)) {
                return;
            }
            String valueOf = String.valueOf(this.zzb.get(str));
            String valueOf2 = String.valueOf(zzgcsVar);
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
        }
        this.zzb.put(str, zzgcsVar);
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzgcs) entry.getValue());
        }
    }
}
