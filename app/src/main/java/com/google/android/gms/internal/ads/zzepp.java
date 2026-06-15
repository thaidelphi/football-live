package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepp implements zzerw {
    private final zzgba zza;
    private final zzdte zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepp(zzgba zzgbaVar, zzdte zzdteVar) {
        this.zza = zzgbaVar;
        this.zzb = zzdteVar;
    }

    public static /* synthetic */ zzepq zzc(zzepp zzeppVar) {
        zzdte zzdteVar = zzeppVar.zzb;
        String zzc = zzdteVar.zzc();
        boolean zzr = zzdteVar.zzr();
        boolean zzl = com.google.android.gms.ads.internal.zzv.zzt().zzl();
        zzdte zzdteVar2 = zzeppVar.zzb;
        return new zzepq(zzc, zzr, zzl, zzdteVar2.zzp(), zzdteVar2.zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepp.zzc(zzepp.this);
            }
        });
    }
}
