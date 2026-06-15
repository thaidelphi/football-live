package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclz implements zzaxl, zzcva, com.google.android.gms.ads.internal.overlay.zzr, zzcuz {
    private final zzclu zza;
    private final zzclv zzb;
    private final zzbnr zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcly zzh = new zzcly();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzclz(zzbno zzbnoVar, zzclv zzclvVar, Executor executor, zzclu zzcluVar, Clock clock) {
        this.zza = zzcluVar;
        zzbmz zzbmzVar = zzbnc.zza;
        this.zzd = zzbnoVar.zza("google.afma.activeView.handleUpdate", zzbmzVar, zzbmzVar);
        this.zzb = zzclvVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        for (zzcdq zzcdqVar : this.zzc) {
            this.zza.zzf(zzcdqVar);
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final synchronized void zzdh(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final synchronized void zzdj(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final synchronized void zzdk(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final synchronized void zzdn(zzaxk zzaxkVar) {
        zzcly zzclyVar = this.zzh;
        zzclyVar.zza = zzaxkVar.zzj;
        zzclyVar.zzf = zzaxkVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i10) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() != null) {
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                this.zzh.zzd = this.zzf.b();
                final JSONObject zzb = this.zzb.zzb(this.zzh);
                for (final zzcdq zzcdqVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcdq.this.zzp("AFMA_updateActiveView", zzb);
                        }
                    });
                }
                zzbys.zzb(this.zzd.zzc(zzb), "ActiveViewListener.callActiveViewJs");
                return;
            } catch (Exception e8) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e8);
                return;
            }
        }
        zzj();
    }

    public final synchronized void zzh(zzcdq zzcdqVar) {
        this.zzc.add(zzcdqVar);
        this.zza.zzd(zzcdqVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
