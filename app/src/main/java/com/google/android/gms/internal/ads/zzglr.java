package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzglr {
    private final Class zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzglr(Class cls, Class cls2, zzglq zzglqVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzglr zzb(zzglp zzglpVar, Class cls, Class cls2) {
        return new zzglo(cls, cls2, zzglpVar);
    }

    public abstract Object zza(zzgcf zzgcfVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
