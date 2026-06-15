package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@ShowFirstParty
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfmb {
    private final Context zza;
    private final Looper zzb;

    public zzfmb(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfmm zza = zzfmp.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfmj zza2 = zzfml.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfmc(this.zza, this.zzb, (zzfmp) zza.zzbr()).zza();
    }
}
