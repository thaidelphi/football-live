package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgyf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyf zzb = new zzgyf();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzgyp zzc = new zzgxn();

    private zzgyf() {
    }

    public static zzgyf zza() {
        return zzb;
    }

    public final zzgyo zzb(Class cls) {
        zzgwx.zzc(cls, "messageType");
        zzgyo zzgyoVar = (zzgyo) this.zzd.get(cls);
        if (zzgyoVar == null) {
            zzgyoVar = this.zzc.zza(cls);
            zzgwx.zzc(cls, "messageType");
            zzgyo zzgyoVar2 = (zzgyo) this.zzd.putIfAbsent(cls, zzgyoVar);
            if (zzgyoVar2 != null) {
                return zzgyoVar2;
            }
        }
        return zzgyoVar;
    }
}
