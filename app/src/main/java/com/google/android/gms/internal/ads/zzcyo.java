package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcyo implements AppEventListener, OnAdMetadataChangedListener, zzcuf, com.google.android.gms.ads.internal.client.zza, zzcwq, zzcuz, zzcwe, com.google.android.gms.ads.internal.overlay.zzr, zzcuv, zzdce {
    private final zzcyl zza = new zzcyl(this, null);
    private zzeis zzb;
    private zzeiw zzc;
    private zzevs zzd;
    private zzeyx zze;

    private static void zzn(Object obj, zzcym zzcymVar) {
        if (obj != null) {
            zzcymVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxe
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxf
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeiw) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxk
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxq
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyj
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zza();
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyk
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyc
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zzb();
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyd
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxl
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zzc();
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxm
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxx
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                zzevs zzevsVar = (zzevs) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzdd() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxz
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zzdd();
            }
        });
        zzn(this.zzc, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcye
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeiw) obj).zzdd();
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyf
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zzdd();
            }
        });
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyg
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzevs) obj).zzdd();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxj
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                zzevs zzevsVar = (zzevs) obj;
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxw
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzevs) obj).zzdo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxs
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzevs) obj).zzdp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(final zzbup zzbupVar, final String str, final String str2) {
        zzn(this.zzb, new zzcym(zzbupVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzcxn
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                zzeis zzeisVar = (zzeis) obj;
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxp
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zzdq(zzbup.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxy
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzevs) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(final int i10) {
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcya
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzevs) obj).zzds(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxd
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                zzeis zzeisVar = (zzeis) obj;
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxo
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxg
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                zzeis zzeisVar = (zzeis) obj;
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxh
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzg() {
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyb
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzevs) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxt
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zzh(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxu
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zzh(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
        zzn(this.zzd, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxv
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzevs) obj).zzh(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }

    public final zzcyl zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcuv
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyh
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeyx) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcyi
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxi
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final void zzu() {
        zzn(this.zzb, new zzcym() { // from class: com.google.android.gms.internal.ads.zzcxr
            @Override // com.google.android.gms.internal.ads.zzcym
            public final void zza(Object obj) {
                ((zzeis) obj).zzu();
            }
        });
    }
}
