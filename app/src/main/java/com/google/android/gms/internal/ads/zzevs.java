package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzevs implements zzcui, zzcwe, zzexi, com.google.android.gms.ads.internal.overlay.zzr, zzcwq, zzcuv, zzdce {
    private final zzfby zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzevs zzh = null;

    public zzevs(zzfby zzfbyVar) {
        this.zza = zzfbyVar;
    }

    public static zzevs zzi(zzevs zzevsVar) {
        zzevs zzevsVar2 = new zzevs(zzevsVar.zza);
        zzevsVar2.zzh = zzevsVar;
        return zzevsVar2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzdd() {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzdd();
        } else {
            zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevj
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzazl) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzdo();
        } else {
            zzewz.zza(this.zzf, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevg
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzdp();
            return;
        }
        zzewz.zza(this.zzf, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdp();
            }
        });
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzazl) obj).zzf();
            }
        });
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevf
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzazl) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzdr();
        } else {
            zzewz.zza(this.zzf, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevq
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdr();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(final int i10) {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzds(i10);
        } else {
            zzewz.zza(this.zzf, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevm
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzds(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzdz(zzeVar);
            return;
        }
        zzewz.zza(this.zzb, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevn
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzazh) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewz.zza(this.zzb, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevo
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzazh) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzg() {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzg();
        } else {
            zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevp
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzcwe) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzh(zztVar);
        } else {
            zzewz.zza(this.zzg, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevd
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    public final void zzj() {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzj();
            return;
        }
        this.zza.zza();
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzazi) obj).zza();
            }
        });
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevl
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzazl) obj).zzc();
            }
        });
    }

    public final void zzk(final zzaze zzazeVar) {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzk(zzazeVar);
        } else {
            zzewz.zza(this.zzb, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevi
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzazh) obj).zzd(zzaze.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexi
    public final void zzl(zzexi zzexiVar) {
        this.zzh = (zzevs) zzexiVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzg.set(zzdqVar);
    }

    public final void zzo(zzazh zzazhVar) {
        this.zzb.set(zzazhVar);
    }

    public final void zzp(zzazl zzazlVar) {
        this.zzd.set(zzazlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcuv
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzevs zzevsVar = this.zzh;
        if (zzevsVar != null) {
            zzevsVar.zzq(zzeVar);
        } else {
            zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzevh
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzazl) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzu() {
    }
}
