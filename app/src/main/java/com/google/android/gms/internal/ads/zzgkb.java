package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgkb {
    private final Class zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgkb(Class cls, Class cls2, zzgka zzgkaVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgkb zzb(zzgjz zzgjzVar, Class cls, Class cls2) {
        return new zzgjy(cls, cls2, zzgjzVar);
    }

    public abstract zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
