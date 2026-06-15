package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqa implements zzerw {
    private final zzgba zza;
    private final zzfap zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeqa(zzgba zzgbaVar, zzfap zzfapVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgbaVar;
        this.zzb = zzfapVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzeqb zzc(zzeqa zzeqaVar) {
        return new zzeqb(zzeqaVar.zzb, zzeqaVar.zzc, zzeqaVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqa.zzc(zzeqa.this);
            }
        });
    }
}
