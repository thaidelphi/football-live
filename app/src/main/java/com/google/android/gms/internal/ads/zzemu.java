package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzemu implements zzerw {
    private final zzgba zza;
    private final zzdoa zzb;
    private final String zzc;
    private final zzfap zzd;

    public zzemu(zzgba zzgbaVar, zzdoa zzdoaVar, zzfap zzfapVar, String str) {
        this.zza = zzgbaVar;
        this.zzb = zzdoaVar;
        this.zzd = zzfapVar;
        this.zzc = str;
    }

    public static /* synthetic */ zzemv zzc(zzemu zzemuVar) {
        zzdoa zzdoaVar = zzemuVar.zzb;
        return new zzemv(zzdoaVar.zzb(zzemuVar.zzd.zzf, zzemuVar.zzc), zzdoaVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemu.zzc(zzemu.this);
            }
        });
    }
}
