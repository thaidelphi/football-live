package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzctm {
    private Context zza;
    private zzfap zzb;
    private Bundle zzc;
    private zzfah zzd;
    private zzctf zze;
    private zzebl zzf;
    private int zzg = 0;

    public final zzctm zze(zzebl zzeblVar) {
        this.zzf = zzeblVar;
        return this;
    }

    public final zzctm zzf(Context context) {
        this.zza = context;
        return this;
    }

    public final zzctm zzg(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzctm zzh(zzctf zzctfVar) {
        this.zze = zzctfVar;
        return this;
    }

    public final zzctm zzi(int i10) {
        this.zzg = i10;
        return this;
    }

    public final zzctm zzj(zzfah zzfahVar) {
        this.zzd = zzfahVar;
        return this;
    }

    public final zzctm zzk(zzfap zzfapVar) {
        this.zzb = zzfapVar;
        return this;
    }

    public final zzcto zzl() {
        return new zzcto(this, null);
    }
}
