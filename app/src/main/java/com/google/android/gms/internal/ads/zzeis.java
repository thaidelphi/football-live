package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeis implements AppEventListener, zzcxc, zzcvt, zzcui, zzcuz, com.google.android.gms.ads.internal.client.zza, zzcuf, zzcwq, zzcuv, zzdce {
    final zzdqf zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziN)).intValue());

    public zzeis(zzdqf zzdqfVar) {
        this.zza = zzdqfVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeid
                    @Override // com.google.android.gms.internal.ads.zzewy
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkH)).booleanValue()) {
            return;
        }
        zzewz.zza(this.zzc, new zzeiq());
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (this.zzh.get()) {
            if (!this.zzb.offer(new Pair(str, str2))) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("The queue for app events is full, dropping the new event.");
                zzdqf zzdqfVar = this.zza;
                if (zzdqfVar != null) {
                    zzdqe zza = zzdqfVar.zza();
                    zza.zzb("action", "dae_action");
                    zza.zzb("dae_name", str);
                    zza.zzb("dae_data", str2);
                    zza.zzj();
                    return;
                }
            }
            return;
        }
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcl) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeia
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzd();
            }
        });
        zzewz.zza(this.zzg, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeib
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzein
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzj();
            }
        });
        zzewz.zza(this.zzg, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeio
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzf();
            }
        });
        zzewz.zza(this.zzg, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzdd() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkH)).booleanValue()) {
            zzewz.zza(this.zzc, new zzeiq());
        }
        zzewz.zza(this.zzg, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeic
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(zzbup zzbupVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeie
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzewz.zza(this.zzf, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbk zzg() {
        return (com.google.android.gms.ads.internal.client.zzbk) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeir
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcl zzi() {
        return (com.google.android.gms.ads.internal.client.zzcl) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzc.set(zzbkVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.zzf.set(zzbnVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zze.set(zzdqVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzd.set(zzclVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzg.set(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcuv
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzewz.zza(this.zzg, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final synchronized void zzs() {
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzi();
            }
        });
        zzewz.zza(this.zzf, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeii
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzu() {
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeim
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzk();
            }
        });
    }
}
