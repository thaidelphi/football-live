package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgjx {
    private final zzguh zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjx(zzguh zzguhVar, Class cls, zzgjw zzgjwVar) {
        this.zza = zzguhVar;
        this.zzb = cls;
    }

    public static zzgjx zzb(zzgjv zzgjvVar, zzguh zzguhVar, Class cls) {
        return new zzgju(zzguhVar, cls, zzgjvVar);
    }

    public abstract zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) throws GeneralSecurityException;

    public final zzguh zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
