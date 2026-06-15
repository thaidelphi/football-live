package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcmj implements zzaxl {
    private zzcdq zza;
    private final Executor zzb;
    private final zzclv zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcly zzg = new zzcly();

    public zzcmj(Executor executor, zzclv zzclvVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzclvVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcmj.this.zza.zzp("AFMA_updateActiveView", zzb);
                    }
                });
            }
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e8);
        }
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzdn(zzaxk zzaxkVar) {
        boolean z10 = this.zzf ? false : zzaxkVar.zzj;
        zzcly zzclyVar = this.zzg;
        zzclyVar.zza = z10;
        zzclyVar.zzd = this.zzd.b();
        this.zzg.zzf = zzaxkVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcdq zzcdqVar) {
        this.zza = zzcdqVar;
    }
}
