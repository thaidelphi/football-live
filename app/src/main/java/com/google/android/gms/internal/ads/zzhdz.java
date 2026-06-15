package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhdz implements zzhdt {
    private static final Object zza = new Object();
    private volatile zzhdt zzb;
    private volatile Object zzc = zza;

    private zzhdz(zzhdt zzhdtVar) {
        this.zzb = zzhdtVar;
    }

    public static zzhdt zza(zzhdt zzhdtVar) {
        return ((zzhdtVar instanceof zzhdz) || (zzhdtVar instanceof zzhdj)) ? zzhdtVar : new zzhdz(zzhdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzhdt zzhdtVar = this.zzb;
            if (zzhdtVar == null) {
                return this.zzc;
            }
            Object zzb = zzhdtVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
