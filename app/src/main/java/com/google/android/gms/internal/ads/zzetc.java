package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzetc implements zzerw {
    private final Executor zza;
    private final String zzb;

    public zzetc(zzbxw zzbxwVar, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return zzgap.zzf(zzgap.zzm(zzgap.zzh(this.zzb), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzetd((String) obj);
            }
        }, this.zza), Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzetb
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                b6.a zzh;
                Throwable th = (Throwable) obj;
                zzh = zzgap.zzh(new zzetd(zzetc.this.zzb));
                return zzh;
            }
        }, this.zza);
    }
}
