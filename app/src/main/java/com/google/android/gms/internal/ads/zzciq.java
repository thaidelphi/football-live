package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzciq extends com.google.android.gms.ads.internal.client.zzcx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdnv zzc;
    private final zzebi zzd;
    private final zzeho zze;
    private final zzdsj zzf;
    private final zzbxb zzg;
    private final zzdoa zzh;
    private final zzdte zzi;
    private final zzbeg zzj;
    private final zzffq zzk;
    private final zzfbl zzl;
    private final zzcrv zzm;
    private final zzdqf zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().b());

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzciq(Context context, VersionInfoParcel versionInfoParcel, zzdnv zzdnvVar, zzebi zzebiVar, zzeho zzehoVar, zzdsj zzdsjVar, zzbxb zzbxbVar, zzdoa zzdoaVar, zzdte zzdteVar, zzbeg zzbegVar, zzffq zzffqVar, zzfbl zzfblVar, zzcrv zzcrvVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdnvVar;
        this.zzd = zzebiVar;
        this.zze = zzehoVar;
        this.zzf = zzdsjVar;
        this.zzg = zzbxbVar;
        this.zzh = zzdoaVar;
        this.zzi = zzdteVar;
        this.zzj = zzbegVar;
        this.zzk = zzffqVar;
        this.zzl = zzfblVar;
        this.zzm = zzcrvVar;
        this.zzn = zzdqfVar;
    }

    public static /* synthetic */ void zzc(zzciq zzciqVar, Runnable runnable) {
        Preconditions.f("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (zzciqVar.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            for (zzbnx zzbnxVar : zze.values()) {
                for (zzbnw zzbnwVar : zzbnxVar.zza) {
                    String str = zzbnwVar.zzb;
                    for (String str2 : zzbnwVar.zza) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzebj zza = zzciqVar.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfbn zzfbnVar = (zzfbn) zza.zzb;
                        if (!zzfbnVar.zzC() && zzfbnVar.zzB()) {
                            zzfbnVar.zzj(zzciqVar.zza, (zzecy) zza.zzc, (List) entry.getValue());
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfaw e8) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e8);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzv.zzs().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi() {
        this.zzf.zzq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(boolean z10) throws RemoteException {
        try {
            zzfpj.zza(this.zza).zzc(z10);
            if (z10) {
                return;
            }
            try {
                if (this.zza.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                    return;
                }
                throw new IOException("Failed to remove query_info_shared_prefs");
            } catch (IOException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzk() {
        if (this.zzo) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbbm.zza(this.zza);
        com.google.android.gms.ads.internal.zzv.zzp().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzv.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zzf();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzee)).booleanValue()) {
            this.zzh.zzf();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue()) {
            zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcil
                @Override // java.lang.Runnable
                public final void run() {
                    zzciq.this.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkR)).booleanValue()) {
            zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcio
                @Override // java.lang.Runnable
                public final void run() {
                    zzciq.this.zzj.zza(new zzbtf());
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdc)).booleanValue()) {
            zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcim
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbt.zzb(zzciq.this.zza, true);
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeH)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeI)).booleanValue()) {
                zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcin
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.zzv.zzf().zzd(r0.zza, zzciq.this.zzn);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.client.zzcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzl(java.lang.String r12, com.google.android.gms.dynamic.IObjectWrapper r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza
            com.google.android.gms.internal.ads.zzbbm.zza(r0)
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzej
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            android.content.Context r0 = r11.zza     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzs.zzq(r0)     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            goto L2f
        L21:
            r0 = move-exception
            goto L24
        L23:
            r0 = move-exception
        L24:
            com.google.android.gms.internal.ads.zzbyf r1 = com.google.android.gms.ads.internal.zzv.zzp()
            java.lang.String r2 = "NonagonMobileAdsSettingManager_AppId"
            r1.zzw(r0, r2)
        L2d:
            java.lang.String r0 = ""
        L2f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L38
            r6 = r12
            goto L39
        L38:
            r6 = r0
        L39:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L40
            goto L93
        L40:
            com.google.android.gms.internal.ads.zzbbd r12 = com.google.android.gms.internal.ads.zzbbm.zzec
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzba
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r1.zzb(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r12 = r12 | r1
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.t0(r13)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            com.google.android.gms.internal.ads.zzcip r13 = new com.google.android.gms.internal.ads.zzcip
            r13.<init>()
            goto L7f
        L7d:
            r13 = 0
            r2 = r12
        L7f:
            r7 = r13
            if (r2 == 0) goto L93
            android.content.Context r4 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r11.zzb
            com.google.android.gms.internal.ads.zzffq r8 = r11.zzk
            com.google.android.gms.internal.ads.zzdqf r9 = r11.zzn
            java.lang.Long r10 = r11.zzp
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzv.zza()
            r3.zzc(r4, r5, r6, r7, r8, r9, r10)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciq.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzm(com.google.android.gms.ads.internal.client.zzdk zzdkVar) throws RemoteException {
        this.zzi.zzh(zzdkVar, zzdtd.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.t0(iObjectWrapper);
        if (context == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbod zzbodVar) throws RemoteException {
        this.zzl.zzf(zzbodVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzp(boolean z10) {
        com.google.android.gms.ads.internal.zzv.zzs().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzq(float f10) {
        com.google.android.gms.ads.internal.zzv.zzs().zzd(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzr(String str) {
        zzbbm.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzec)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zza().zzc(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs(zzbkt zzbktVar) throws RemoteException {
        this.zzf.zzs(zzbktVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjq)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(com.google.android.gms.ads.internal.client.zzfs zzfsVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzfsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzv.zzs().zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzx() {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
            String zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzi();
            if (com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, zzi, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(false);
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzw("");
        }
    }
}
