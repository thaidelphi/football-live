package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgcv {
    static {
        Logger.getLogger(zzgcv.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzgbv.class);
        hashSet.add(zzgcb.class);
        hashSet.add(zzgcx.class);
        hashSet.add(zzgcd.class);
        hashSet.add(zzgcc.class);
        hashSet.add(zzgcr.class);
        hashSet.add(zzgor.class);
        hashSet.add(zzgct.class);
        hashSet.add(zzgcu.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzgcv() {
    }

    public static Object zza(zzgre zzgreVar, Class cls) throws GeneralSecurityException {
        String zzg = zzgreVar.zzg();
        return zzgjt.zzc().zza(zzg, cls).zzc(zzgreVar.zzf());
    }
}
