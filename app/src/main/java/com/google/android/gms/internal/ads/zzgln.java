package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgln {
    private final Class zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgln(Class cls, Class cls2, zzglm zzglmVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgln zzb(zzgll zzgllVar, Class cls, Class cls2) {
        return new zzglk(cls, cls2, zzgllVar);
    }

    public abstract zzgmf zza(zzgcs zzgcsVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
