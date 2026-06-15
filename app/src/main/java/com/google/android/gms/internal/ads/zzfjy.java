package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfjy implements zzfjr {
    private static zzfjy zza;
    private float zzb = 0.0f;
    private zzfjm zzc;
    private zzfjq zzd;

    public zzfjy(zzfjn zzfjnVar, zzfjl zzfjlVar) {
    }

    public static zzfjy zzb() {
        if (zza == null) {
            zza = new zzfjy(new zzfjn(), new zzfjl());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfjr
    public final void zzc(boolean z10) {
        if (z10) {
            zzfla.zzd().zzi();
        } else {
            zzfla.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzfjm(new Handler(), context, new zzfjk(), this);
    }

    public final void zze(float f10) {
        this.zzb = f10;
        if (this.zzd == null) {
            this.zzd = zzfjq.zza();
        }
        for (zzfiz zzfizVar : this.zzd.zzb()) {
            zzfizVar.zzg().zzl(f10);
        }
    }

    public final void zzf() {
        zzfjp.zza().zze(this);
        zzfjp.zza().zzf();
        zzfla.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzfla.zzd().zzj();
        zzfjp.zza().zzg();
        this.zzc.zzb();
    }
}
