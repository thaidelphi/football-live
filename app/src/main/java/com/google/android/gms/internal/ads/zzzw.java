package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzzw {
    private final Context zza;
    private final zzaag zzb;
    private zzbz zzc;
    private zzbi zzd;
    private final List zze = zzfvv.zzn();
    private final zzbx zzf = zzbx.zza;
    private zzcw zzg = zzcw.zza;
    private boolean zzh;

    public zzzw(Context context, zzaag zzaagVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaagVar;
    }

    public final zzzw zze(zzcw zzcwVar) {
        this.zzg = zzcwVar;
        return this;
    }

    public final zzaac zzf() {
        zzcv.zzf(!this.zzh);
        if (this.zzd == null) {
            if (this.zzc == null) {
                this.zzc = new zzzz(null);
            }
            this.zzd = new zzaaa(this.zzc);
        }
        zzaac zzaacVar = new zzaac(this, null);
        this.zzh = true;
        return zzaacVar;
    }
}
