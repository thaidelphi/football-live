package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaov {
    public final Object zza;
    public final zzany zzb;
    public final zzaoy zzc;
    public boolean zzd;

    private zzaov(zzaoy zzaoyVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaoyVar;
    }

    private zzaov(Object obj, zzany zzanyVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzanyVar;
        this.zzc = null;
    }

    public static zzaov zza(zzaoy zzaoyVar) {
        return new zzaov(zzaoyVar);
    }

    public static zzaov zzb(Object obj, zzany zzanyVar) {
        return new zzaov(obj, zzanyVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
