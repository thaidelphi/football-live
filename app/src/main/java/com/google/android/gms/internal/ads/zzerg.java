package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzerg implements zzerw {
    private final zzbxb zza;
    private final zzgba zzb;
    private final Context zzc;

    public zzerg(zzbxb zzbxbVar, zzgba zzgbaVar, Context context) {
        this.zza = zzbxbVar;
        this.zzb = zzgbaVar;
        this.zzc = context;
    }

    public static /* synthetic */ zzerh zzc(zzerg zzergVar) {
        if (zzergVar.zza.zzp(zzergVar.zzc)) {
            String zze = zzergVar.zza.zze(zzergVar.zzc);
            String str = zze == null ? "" : zze;
            String zzc = zzergVar.zza.zzc(zzergVar.zzc);
            String str2 = zzc == null ? "" : zzc;
            String zzb = zzergVar.zza.zzb(zzergVar.zzc);
            String str3 = zzb == null ? "" : zzb;
            String str4 = true != zzergVar.zza.zzp(zzergVar.zzc) ? null : "fa";
            return new zzerh(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzat) : null);
        }
        return new zzerh(null, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerg.zzc(zzerg.this);
            }
        });
    }
}
