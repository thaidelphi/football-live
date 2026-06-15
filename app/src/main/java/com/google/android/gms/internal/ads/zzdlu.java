package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlu {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdqf zzd;
    private final Executor zze;
    private final zzauc zzf;
    private final VersionInfoParcel zzg;
    private final zzdzu zzi;
    private final zzfhp zzj;
    private final zzeaf zzk;
    private final zzfat zzl;
    private b6.a zzm;
    private final zzdlh zza = new zzdlh();
    private final zzbje zzh = new zzbje();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlu(zzdlr zzdlrVar) {
        this.zzc = zzdlr.zza(zzdlrVar);
        this.zze = zzdlr.zzj(zzdlrVar);
        this.zzf = zzdlr.zzb(zzdlrVar);
        this.zzg = zzdlr.zzd(zzdlrVar);
        this.zzb = zzdlr.zzc(zzdlrVar);
        this.zzi = zzdlr.zzf(zzdlrVar);
        this.zzj = zzdlr.zzi(zzdlrVar);
        this.zzd = zzdlr.zze(zzdlrVar);
        this.zzk = zzdlr.zzg(zzdlrVar);
        this.zzl = zzdlr.zzh(zzdlrVar);
    }

    public static /* synthetic */ zzcdq zza(zzdlu zzdluVar, zzcdq zzcdqVar) {
        zzcdqVar.zzag("/result", zzdluVar.zzh);
        zzcfi zzN = zzcdqVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(zzdluVar.zzc, null, null);
        zzdzu zzdzuVar = zzdluVar.zzi;
        zzfhp zzfhpVar = zzdluVar.zzj;
        zzdqf zzdqfVar = zzdluVar.zzd;
        zzdlh zzdlhVar = zzdluVar.zza;
        zzN.zzV(null, zzdlhVar, zzdlhVar, zzdlhVar, zzdlhVar, false, null, zzbVar, null, null, zzdzuVar, zzfhpVar, zzdqfVar, null, null, null, null, null, null);
        return zzcdqVar;
    }

    public final synchronized b6.a zzg(final String str, final JSONObject jSONObject) {
        b6.a aVar = this.zzm;
        if (aVar == null) {
            return zzgap.zzh(null);
        }
        return zzgap.zzn(aVar, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                b6.a zzb;
                zzcdq zzcdqVar = (zzcdq) obj;
                zzb = zzdlu.this.zzh.zzb(zzcdqVar, str, jSONObject);
                return zzb;
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzezu zzezuVar, zzezx zzezxVar, zzclc zzclcVar) {
        b6.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgap.zzr(aVar, new zzdlo(this, zzezuVar, zzezxVar, zzclcVar), this.zze);
    }

    public final synchronized void zzi() {
        b6.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgap.zzr(aVar, new zzdlk(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        b6.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgap.zzr(aVar, new zzdln(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdR);
        final Context context = this.zzc;
        final zzauc zzaucVar = this.zzf;
        final VersionInfoParcel versionInfoParcel = this.zzg;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzeaf zzeafVar = this.zzk;
        final zzfat zzfatVar = this.zzl;
        b6.a zzm = zzgap.zzm(zzgap.zzk(new zzfzv() { // from class: com.google.android.gms.internal.ads.zzceb
            @Override // com.google.android.gms.internal.ads.zzfzv
            public final b6.a zza() {
                com.google.android.gms.ads.internal.zzv.zzA();
                Context context2 = context;
                zzcfk zza = zzcfk.zza();
                zzauc zzaucVar2 = zzaucVar;
                zzeaf zzeafVar2 = zzeafVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcdq zza2 = zzced.zza(context2, zza, "", false, false, zzaucVar2, null, versionInfoParcel, null, null, zzaVar2, zzbak.zza(), null, null, zzeafVar2, zzfatVar);
                final zzbyt zza3 = zzbyt.zza(zza2);
                zza2.zzN().zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzcea
                    @Override // com.google.android.gms.internal.ads.zzcfg
                    public final void zza(boolean z10, int i10, String str2, String str3) {
                        zzbyt.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzbyp.zzf), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzcdq zzcdqVar = (zzcdq) obj;
                zzdlu.zza(zzdlu.this, zzcdqVar);
                return zzcdqVar;
            }
        }, this.zze);
        this.zzm = zzm;
        zzbys.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbio zzbioVar) {
        b6.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgap.zzr(aVar, new zzdll(this, str, zzbioVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbio zzbioVar) {
        zzl(str, new zzdls(this, weakReference, str, zzbioVar, null));
    }

    public final synchronized void zzn(String str, zzbio zzbioVar) {
        b6.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgap.zzr(aVar, new zzdlm(this, str, zzbioVar), this.zze);
    }
}
