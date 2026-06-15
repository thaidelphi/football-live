package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwu {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbxb zzd;

    private zzbwu() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbwu(zzbww zzbwwVar) {
    }

    public final zzbwu zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbwu zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzbwu zzc(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzbwu zzd(zzbxb zzbxbVar) {
        this.zzd = zzbxbVar;
        return this;
    }

    public final zzbxc zze() {
        zzhds.zzc(this.zza, Context.class);
        zzhds.zzc(this.zzb, Clock.class);
        zzhds.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzhds.zzc(this.zzd, zzbxb.class);
        return new zzbwv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
