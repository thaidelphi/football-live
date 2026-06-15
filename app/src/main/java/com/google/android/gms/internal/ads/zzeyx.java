package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeyx implements OnAdMetadataChangedListener, zzcvt, zzcui, zzcuf, zzcuv, zzcwq, zzexi, zzdce {
    private final zzfby zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzeyx zzi = null;

    public zzeyx(zzfby zzfbyVar) {
        this.zza = zzfbyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.onAdMetadataChanged();
        } else {
            zzewz.zza(this.zzb, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyl
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zza();
            return;
        }
        this.zza.zza();
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyt
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvl) obj).zzg();
            }
        });
        zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyu
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbuv) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzb();
        } else {
            zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyv
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzbuv) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzc();
            return;
        }
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyf
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvl) obj).zzj();
            }
        });
        zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyg
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbuv) obj).zzj();
            }
        });
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvl) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzdd() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzdd();
        } else {
            zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeym
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzbvl) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(final zzbup zzbupVar, final String str, final String str2) {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzdq(zzbupVar, str, str2);
            return;
        }
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyw
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                zzbup zzbupVar2 = zzbup.this;
                ((zzbvl) obj).zzk(new zzbvz(zzbupVar2.zzc(), zzbupVar2.zzb()));
            }
        });
        zzewz.zza(this.zzf, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyc
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                zzbup zzbupVar2 = zzbup.this;
                ((zzbvq) obj).zze(new zzbvz(zzbupVar2.zzc(), zzbupVar2.zzb()), str, str2);
            }
        });
        zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbuv) obj).zze(zzbup.this);
            }
        });
        zzewz.zza(this.zzg, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbuq) obj).zze(zzbup.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzdz(zzeVar);
            return;
        }
        final int i10 = zzeVar.zza;
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyq
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvp) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyr
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvp) obj).zze(i10);
            }
        });
        zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeys
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbuv) obj).zzg(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zze();
        } else {
            zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyp
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzbuv) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzf();
        } else {
            zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyb
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((zzbuv) obj).zzl();
                }
            });
        }
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzh(zztVar);
        } else {
            zzewz.zza(this.zzh, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyi
                @Override // com.google.android.gms.internal.ads.zzewy
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzh.set(zzdqVar);
    }

    public final void zzj(zzbvl zzbvlVar) {
        this.zzd.set(zzbvlVar);
    }

    public final void zzk(zzbvp zzbvpVar) {
        this.zzc.set(zzbvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzexi
    public final void zzl(zzexi zzexiVar) {
        this.zzi = (zzeyx) zzexiVar;
    }

    @Deprecated
    public final void zzm(zzbuv zzbuvVar) {
        this.zze.set(zzbuvVar);
    }

    @Deprecated
    public final void zzn(zzbuq zzbuqVar) {
        this.zzg.set(zzbuqVar);
    }

    public final void zzo(zzbvq zzbvqVar) {
        this.zzf.set(zzbvqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcuv
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzq(zzeVar);
            return;
        }
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyn
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvl) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzewz.zza(this.zzd, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyo
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvl) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        zzeyx zzeyxVar = this.zzi;
        if (zzeyxVar != null) {
            zzeyxVar.zzs();
            return;
        }
        zzewz.zza(this.zzc, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbvp) obj).zzg();
            }
        });
        zzewz.zza(this.zze, new zzewy() { // from class: com.google.android.gms.internal.ads.zzeyk
            @Override // com.google.android.gms.internal.ads.zzewy
            public final void zza(Object obj) {
                ((zzbuv) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzu() {
    }
}
