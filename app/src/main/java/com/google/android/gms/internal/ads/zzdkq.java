package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdkq {
    private final zzfap zza;
    private final Executor zzb;
    private final zzdnf zzc;
    private final zzdma zzd;
    private final Context zze;
    private final zzdqf zzf;
    private final zzfhp zzg;
    private final zzdzu zzh;

    public zzdkq(zzfap zzfapVar, Executor executor, zzdnf zzdnfVar, Context context, zzdqf zzdqfVar, zzfhp zzfhpVar, zzdzu zzdzuVar, zzdma zzdmaVar) {
        this.zza = zzfapVar;
        this.zzb = executor;
        this.zzc = zzdnfVar;
        this.zze = context;
        this.zzf = zzdqfVar;
        this.zzg = zzfhpVar;
        this.zzh = zzdzuVar;
        this.zzd = zzdmaVar;
    }

    public static /* synthetic */ b6.a zza(final zzdkq zzdkqVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzezu zzezuVar, zzezx zzezxVar, String str, String str2, Object obj) {
        final zzcdq zza = zzdkqVar.zzc.zza(zzrVar, zzezuVar, zzezxVar);
        final zzbyt zza2 = zzbyt.zza(zza);
        if (zzdkqVar.zza.zzb != null) {
            zzdkqVar.zzh(zza);
            zza.zzaj(zzcfk.zzd());
        } else {
            zzdlx zzb = zzdkqVar.zzd.zzb();
            zza.zzN().zzV(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(zzdkqVar.zze, null, null), null, null, zzdkqVar.zzh, zzdkqVar.zzg, zzdkqVar.zzf, null, zzb, null, null, null, null);
            zzj(zza);
        }
        zza.zzN().zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzdkk
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzdkq.zzf(zzdkq.this, zza, zza2, z10, i10, str3, str4);
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public static /* synthetic */ b6.a zzb(zzdkq zzdkqVar, Object obj) {
        zzcdq zza = zzdkqVar.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzc(), null, null);
        final zzbyt zza2 = zzbyt.zza(zza);
        zzdkqVar.zzh(zza);
        zza.zzN().zzJ(new zzcfh() { // from class: com.google.android.gms.internal.ads.zzdki
            @Override // com.google.android.gms.internal.ads.zzcfh
            public final void zza() {
                zzbyt.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdS));
        return zza2;
    }

    public static /* synthetic */ b6.a zzc(final zzdkq zzdkqVar, JSONObject jSONObject, final zzcdq zzcdqVar) {
        zzbky zzbkyVar = zzdkqVar.zza.zzb;
        final zzbyt zza = zzbyt.zza(zzcdqVar);
        if (zzbkyVar != null) {
            zzcdqVar.zzaj(zzcfk.zzd());
        } else {
            zzcdqVar.zzaj(zzcfk.zze());
        }
        zzcdqVar.zzN().zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(boolean z10, int i10, String str, String str2) {
                zzdkq.zzg(zzdkq.this, zzcdqVar, zza, z10, i10, str, str2);
            }
        });
        zzcdqVar.zzp("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public static /* synthetic */ void zzf(zzdkq zzdkqVar, zzcdq zzcdqVar, zzbyt zzbytVar, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (zzdkqVar.zza.zza != null && zzcdqVar.zzq() != null) {
                zzcdqVar.zzq().zzs(zzdkqVar.zza.zza);
            }
            zzbytVar.zzb();
            return;
        }
        zzbytVar.zzd(new zzeez(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    public static /* synthetic */ void zzg(zzdkq zzdkqVar, zzcdq zzcdqVar, zzbyt zzbytVar, boolean z10, int i10, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzea)).booleanValue()) {
            zzdkqVar.zzi(zzcdqVar, zzbytVar);
        } else if (z10) {
            zzdkqVar.zzi(zzcdqVar, zzbytVar);
        } else {
            zzbytVar.zzd(new zzeez(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
        }
    }

    private final void zzh(zzcdq zzcdqVar) {
        zzj(zzcdqVar);
        zzcdqVar.zzag("/video", zzbin.zzl);
        zzcdqVar.zzag("/videoMeta", zzbin.zzm);
        zzcdqVar.zzag("/precache", new zzcby());
        zzcdqVar.zzag("/delayPageLoaded", zzbin.zzp);
        zzcdqVar.zzag("/instrument", zzbin.zzn);
        zzcdqVar.zzag("/log", zzbin.zzg);
        zzcdqVar.zzag("/click", new zzbhm(null, null));
        if (this.zza.zzb != null) {
            zzcdqVar.zzN().zzG(true);
            zzcdqVar.zzag("/open", new zzbja(null, null, null, null, null));
        } else {
            zzcdqVar.zzN().zzG(false);
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcdqVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcdqVar.zzD() != null) {
                hashMap = zzcdqVar.zzD().zzaw;
            }
            zzcdqVar.zzag("/logScionEvent", new zzbiu(zzcdqVar.getContext(), hashMap));
        }
    }

    private final void zzi(zzcdq zzcdqVar, zzbyt zzbytVar) {
        if (this.zza.zza != null && zzcdqVar.zzq() != null) {
            zzcdqVar.zzq().zzs(this.zza.zza);
        }
        zzbytVar.zzb();
    }

    private static final void zzj(zzcdq zzcdqVar) {
        zzcdqVar.zzag("/videoClicked", zzbin.zzh);
        zzcdqVar.zzN().zzI(true);
        zzcdqVar.zzag("/getNativeAdViewSignals", zzbin.zzs);
        zzcdqVar.zzag("/getNativeClickMeta", zzbin.zzt);
    }

    public final b6.a zzd(final JSONObject jSONObject) {
        return zzgap.zzn(zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzdkq.zzb(zzdkq.this, obj);
            }
        }, this.zzb), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzdkq.zzc(zzdkq.this, jSONObject, (zzcdq) obj);
            }
        }, this.zzb);
    }

    public final b6.a zze(final String str, final String str2, final zzezu zzezuVar, final zzezx zzezxVar, final com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzdkq.zza(zzdkq.this, zzrVar, zzezuVar, zzezxVar, str, str2, obj);
            }
        }, this.zzb);
    }
}
