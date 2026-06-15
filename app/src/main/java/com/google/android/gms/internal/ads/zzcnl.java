package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzcnl {
    private final zzcpj zza;
    private final View zzb;
    private final zzezv zzc;
    private final zzcdq zzd;

    public zzcnl(View view, zzcdq zzcdqVar, zzcpj zzcpjVar, zzezv zzezvVar) {
        this.zzb = view;
        this.zzd = zzcdqVar;
        this.zza = zzcpjVar;
        this.zzc = zzezvVar;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcdq zzb() {
        return this.zzd;
    }

    public final zzcpj zzc() {
        return this.zza;
    }

    public zzcvr zzd(Set set) {
        return new zzcvr(set);
    }

    public final zzezv zze() {
        return this.zzc;
    }
}
