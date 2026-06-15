package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhdj implements zzhdt, zzhde {
    private static final Object zza = new Object();
    private volatile zzhdt zzb;
    private volatile Object zzc = zza;

    private zzhdj(zzhdt zzhdtVar) {
        this.zzb = zzhdtVar;
    }

    public static zzhde zza(zzhdt zzhdtVar) {
        return zzhdtVar instanceof zzhde ? (zzhde) zzhdtVar : new zzhdj(zzhdtVar);
    }

    public static zzhdt zzc(zzhdt zzhdtVar) {
        return zzhdtVar instanceof zzhdj ? zzhdtVar : new zzhdj(zzhdtVar);
    }

    private final synchronized Object zzd() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            Object zzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != zzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
