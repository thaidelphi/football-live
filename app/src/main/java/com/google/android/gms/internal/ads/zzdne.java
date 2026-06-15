package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdne {
    private final zzcud zza;
    private final zzdcc zzb;
    private final zzcvm zzc;
    private final zzcvz zzd;
    private final zzcwl zze;
    private final zzczb zzf;
    private final Executor zzg;
    private final zzdby zzh;
    private final zzclz zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbwn zzk;
    private final zzauc zzl;
    private final zzcys zzm;
    private final zzdzu zzn;
    private final zzfhp zzo;
    private final zzdqf zzp;
    private final zzclc zzq;
    private final zzdnk zzr;

    public zzdne(zzcud zzcudVar, zzcvm zzcvmVar, zzcvz zzcvzVar, zzcwl zzcwlVar, zzczb zzczbVar, Executor executor, zzdby zzdbyVar, zzclz zzclzVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbwn zzbwnVar, zzauc zzaucVar, zzcys zzcysVar, zzdzu zzdzuVar, zzfhp zzfhpVar, zzdqf zzdqfVar, zzdcc zzdccVar, zzclc zzclcVar, zzdnk zzdnkVar) {
        this.zza = zzcudVar;
        this.zzc = zzcvmVar;
        this.zzd = zzcvzVar;
        this.zze = zzcwlVar;
        this.zzf = zzczbVar;
        this.zzg = executor;
        this.zzh = zzdbyVar;
        this.zzi = zzclzVar;
        this.zzj = zzbVar;
        this.zzk = zzbwnVar;
        this.zzl = zzaucVar;
        this.zzm = zzcysVar;
        this.zzn = zzdzuVar;
        this.zzo = zzfhpVar;
        this.zzp = zzdqfVar;
        this.zzb = zzdccVar;
        this.zzq = zzclcVar;
        this.zzr = zzdnkVar;
    }

    public static /* synthetic */ boolean zzh(zzdne zzdneVar, View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjW)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            zzdneVar.zzr.zzb(motionEvent);
        }
        zzdneVar.zzj.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    public static final b6.a zzj(zzcdq zzcdqVar, String str, String str2, final Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcm)).booleanValue()) {
            bundle.putLong(zzdpn.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        final zzbyu zzbyuVar = new zzbyu();
        zzcdqVar.zzN().zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzdmv
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzbyu zzbyuVar2 = zzbyuVar;
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcm)).booleanValue()) {
                        bundle.putLong(zzdpn.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
                    }
                    zzbyuVar2.zzc(null);
                    return;
                }
                zzbyuVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcdqVar.zzae(str, str2, null);
        return zzbyuVar;
    }

    public final void zzi(final zzcdq zzcdqVar, boolean z10, zzbir zzbirVar, Bundle bundle) {
        zzatx zzc;
        zzbbd zzbbdVar = zzbbm.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            bundle.putLong(zzdpn.RENDERING_CONFIGURE_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zzcdqVar.zzN().zzV(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdmw
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdne.this.zza.onAdClicked();
            }
        }, this.zzd, this.zze, new zzbhg() { // from class: com.google.android.gms.internal.ads.zzdmx
            @Override // com.google.android.gms.internal.ads.zzbhg
            public final void zzb(String str, String str2) {
                zzdne.this.zzf.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdmy
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzdne.this.zzc.zzb();
            }
        }, z10, zzbirVar, this.zzj, new zzdnd(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcdqVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdne.zzh(zzdne.this, view, motionEvent);
                return false;
            }
        });
        zzcdqVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdne.this.zzj.zza();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcK)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzo(zzcdqVar.zzF());
        }
        this.zzh.zzo(zzcdqVar, this.zzg);
        this.zzh.zzo(new zzaxl() { // from class: com.google.android.gms.internal.ads.zzdnb
            @Override // com.google.android.gms.internal.ads.zzaxl
            public final void zzdn(zzaxk zzaxkVar) {
                zzcfi zzN = zzcdq.this.zzN();
                Rect rect = zzaxkVar.zzd;
                zzN.zzr(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza(zzcdqVar.zzF());
        zzcdqVar.zzag("/trackActiveViewUnit", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdnc
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzcdq zzcdqVar2 = (zzcdq) obj;
                zzdne.this.zzi.zzh(zzcdqVar);
            }
        });
        this.zzi.zzi(zzcdqVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            bundle.putLong(zzdpn.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
    }
}
